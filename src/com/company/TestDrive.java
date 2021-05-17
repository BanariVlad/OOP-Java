package com.company;

import java.awt.*;

public class TestDrive extends Autovehicul {

    public static Autovehicul car;

    public TestDrive(String marc, float maxSpeed, int maxRate, Color carColor, Autovehicul car) {
        super();
        this.car = car;
    }

    public static void CarTest() throws InterruptedException {
        car.driver.rezervor.IncrementCapacity(100);
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            if (car.currentRate < car.maxRate) {
                car.IncrementRate();
                car.Accelerate(((car.getSpeed() + 1) * i) > maxSpeed ? maxSpeed : (car.getSpeed() + 1) * i);
            } else {
                car.DecrementRate();
                car.Brake();
            }
        }
        car.Stop();
    }
}
