package com.imperva.collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Created by Evegeny on 28/06/2017.
 */
public class MapUtilTest {
    @Test
    public void removePoorPeople() throws Exception {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Arnold", 50);
        map.put("Stallone", 30);
        map.put("Chuck Norris", 300);
        map.put("Bruse Willes", 100);

        MapUtil.removePoorPeople(map,200);

        Assert.assertTrue(map.size() == 1);
        Assert.assertTrue(map.containsKey("Chuck Norris"));
        Assert.assertEquals(new Integer(300), map.get("Chuck Norris"));

    }

    @Test
    public void checkDouble() throws Exception {
        double x = 1.1;
        double y = 1.3;
        System.out.println(x+y);
        Assert.assertEquals(2.4,x+y,0.0001);

    }
}











