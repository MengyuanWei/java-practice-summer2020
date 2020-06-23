package com.ascending.training.domain;

import com.ascending.training.WheelShape;

public interface Vehicle {
    void move();
    Integer getWheelNum();
    WheelShape getWheelShape();
    void getSeatType();
}
