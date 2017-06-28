package mySpring;

/**
 * Created by Evegeny on 28/06/2017.
 */
public interface Config {

    <T> Class<T> getImplClass(Class<T> type);
}
