package com.imperva.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Evegeny on 28/06/2017.
 */
public class MapUtil {
    public static void removePoorPeople(HashMap<String, Integer> map, int amount) {

        Set<String> strings = map.keySet();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String actorName = iterator.next();
            Integer money = map.get(actorName);
            if (money < amount) {
                iterator.remove();
            }
        }


    }
}

















