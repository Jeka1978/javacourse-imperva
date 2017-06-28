package mySpring;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * Created by Evegeny on 28/06/2017.
 */
public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();
    private Config config = new JavaConfig();
    private List<Configurer> configurers = new ArrayList<>();


    public static ObjectFactory getInstance() {
        return ourInstance;
    }

    @SneakyThrows
    private ObjectFactory() {
        Reflections scanner = new Reflections("mySpring");
        Set<Class<? extends Configurer>> set = scanner.getSubTypesOf(Configurer.class);
        for (Class<? extends Configurer> aClass : set) {
            configurers.add(aClass.newInstance());
        }
    }


    public <T> T createObject(Class<T> type) throws IllegalAccessException, InstantiationException {
        type = resolveImpl(type);
        T t = type.newInstance();
        for (Configurer configurer : configurers) {
            configurer.configure(t);
        }



        return t;

    }

    private <T> Class<T> resolveImpl(Class<T> type) {
        if (type.isInterface()) {
            type = config.getImplClass(type);
        }
        return type;
    }


}
