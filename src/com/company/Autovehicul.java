package com.company;

import java.awt.*;

public class Autovehicul {
    private static String marc;
    private static Color carColor;
    public static float speed;
    public static float maxSpeed;
    public static int currentRate;
    public static int maxRate;
    public static Sofer driver;
    final int wheelsAmount = 4;

    public Autovehicul(String marc, float maxSpeed, int maxRate, Color carColor, Sofer driver) {
        this.marc = marc;
        this.maxSpeed = maxSpeed;
        this.maxRate = maxRate;
        this.carColor = carColor;
        this.driver = driver;
    }

    public Autovehicul() {

    }

    public void Accelerate(float number) {
        var currentSpeed = speed + number;
        if (currentSpeed < maxSpeed) {
            speed = currentSpeed;
        } else if (number == maxSpeed) {
           speed = number;
        }
        this.toString();
    }

    public void Brake() {
        speed /= 1.1;
        this.toString();
    }

    public static void IncrementRate() {
       if (currentRate < maxRate) {
           currentRate += 1;
       }
    }

    public static void DecrementRate() {
        if (currentRate > 1) {
            currentRate -= 1;
        }
    }

    public static void Stop() {
       speed = 0;
       currentRate = 1;
    }

    @Override
    public String toString() {
        System.out.println(marc + " Viteza: " + speed + " Traptea: " + currentRate);
        return null;
    }

    public static float getSpeed() {
        return speed;
    }
}
