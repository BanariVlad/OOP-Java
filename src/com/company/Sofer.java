package com.company;

public class Sofer {
    private static String name;
    private static String surname;
    private static int driverLicense;
    public static Rezervor rezervor;

    public Sofer(String name, String surname, int driverLicense, Rezervor rezervor) {
        this.name = name;
        this.surname = surname;
        this.driverLicense = driverLicense;
        this.rezervor = rezervor;
    }
}
