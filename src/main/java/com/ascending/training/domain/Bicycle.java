package com.ascending.training.domain;

public class Bicycle extends Bike{
    private Integer paddleNum = 2;
    public static String brand ="Giant";

    public String toString() {
        return "WheelShape: " + getWheelShape() + ", Wheel Number: " + getWheelNum() + ", Paddle Number: " + paddleNum;
    }
}
