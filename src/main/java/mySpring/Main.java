package mySpring;

import lombok.SneakyThrows;

/**
 * Created by Evegeny on 28/06/2017.
 */
public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);
        iRobot.cleanRoom();
    }
}
