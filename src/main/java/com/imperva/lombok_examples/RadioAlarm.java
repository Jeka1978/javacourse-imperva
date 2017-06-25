package com.imperva.lombok_examples;

import lombok.Setter;
import lombok.experimental.Delegate;

/**
 * Created by Evegeny on 25/06/2017.
 */
public class RadioAlarm implements Radio, Alarm {
    @Delegate
    @Setter
    private Alarm alarm = new AlarmImpl();
    @Delegate(excludes = RadioExclusions.class)
    private Radio radio = new RadioImpl();


    public void bbb(){
        System.out.println("bbbbbbbbbbbbbb");
    }





}
