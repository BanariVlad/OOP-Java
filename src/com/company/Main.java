package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Rezervor rezervor = new Rezervor(100);
        Sofer driver = new Sofer("Banari", "Vladislav", 123456789, rezervor);
        Autovehicul car = new Autovehicul("Tesla", 500, 8, new Color(0, 0, 0), driver);
        TestDrive test = new TestDrive("Tesla", 500, 8, new Color(0, 0, 0), car);
        test.CarTest();
    }
}
