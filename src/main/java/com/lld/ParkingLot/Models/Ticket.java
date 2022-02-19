package com.lld.ParkingLot.Models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Ticket {

    private String ticketNumber;
    private VehicleType vehicleType;
    private Payment payment;
    private LocalDateTime localDateTime;
    private ParkingSpot parkingSpot;
    private String vehicleNumber;
    private PaymentStatus paymentStatus;
    private ParkingFloor parkingFloor;



}
