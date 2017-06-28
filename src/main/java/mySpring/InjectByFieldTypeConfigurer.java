package mySpring;

import lombok.SneakyThrows;

import java.lang.reflect.Field;

/**
 * Created by Evegeny on 28/06/2017.
 */
public class InjectByFieldTypeConfigurer implements Configurer {
    @Override
    @SneakyThrows
    public void configure(Object o) {
        Class<?> type = o.getClass();
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectByFieldType.class)) {
                Object object = ObjectFactory.getInstance().createObject(field.getType());
                field.setAccessible(true);
                field.set(o,object);
            }
        }
    }
}
