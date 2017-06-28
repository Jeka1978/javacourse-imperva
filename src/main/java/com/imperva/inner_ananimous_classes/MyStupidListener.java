package com.imperva.inner_ananimous_classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Evegeny on 28/06/2017.
 */
public class MyStupidListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(666);
    }
}
