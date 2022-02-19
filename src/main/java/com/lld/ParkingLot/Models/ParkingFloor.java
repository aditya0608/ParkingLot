package com.lld.ParkingLot.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ParkingFloor {

private  DisplayBoard displayBoard;
private String floorNumber;
private List<ParkingSpot> parkingSpots=new ArrayList<ParkingSpot>();

}
