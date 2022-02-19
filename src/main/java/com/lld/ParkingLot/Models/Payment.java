package com.lld.ParkingLot.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment {

    private String ticketNo;
    private String mode;
    private PaymentStatus status;
    private double amount;
}
