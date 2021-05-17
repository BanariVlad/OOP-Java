package com.company;

public class Rezervor {
    private static int capacity;
    private static int maxCapacity;

    public Rezervor(int capacity) {
        this.maxCapacity = capacity;
    }

    public void IncrementCapacity(int number) {
        var currentCapacity = capacity + number;
        if (currentCapacity < maxCapacity) {
            capacity = currentCapacity;
        } else if (number == maxCapacity) {
            capacity = number;
        }
    }

    public void DecrementCapacity(int number) {
        capacity -= number;
    }

    public int getCapacity() {
        return capacity;
    }
}
