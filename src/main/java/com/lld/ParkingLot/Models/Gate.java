package com.lld.ParkingLot.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Gate {

    private String location;
    private Operator operator;
}
