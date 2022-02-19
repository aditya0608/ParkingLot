package com.lld.ParkingLot.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ParkingLot {

    private String name;
    private String address;
    private List<ParkingFloor> parkingFloors=new ArrayList<ParkingFloor>();
    private List<EntryGate> entryGateList=new ArrayList<EntryGate>() ;
    private List<ExitGate> exitGates=new ArrayList<ExitGate>();

}
