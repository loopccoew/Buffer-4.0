package com.buffer;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;
public class Vehicle {

 String Vehicle_No;
 String Phone_No;
 LocalTime Entry;
 LocalTime Exit;
 LocalDate Date;
 String ParkingNo;
 
Vehicle(){
Vehicle_No=null;
Phone_No=null;
Entry=null;
Exit=null;
Date=null;
ParkingNo=null;

}

void userdetails(String number,String vno,String pno) {

Vehicle_No=vno;

Phone_No=pno;

Entry=LocalTime.now();

Date=LocalDate.now();

ParkingNo=number;

}

void exit() {
Exit=LocalTime.now();
}

long payment() {
    long hours = ChronoUnit.HOURS.between(Entry, Exit);
    System.out.println(hours);
    if(hours<=2) {
    return 30;
    }
    else {
    long cal=hours-2;
    return 30+cal*20;
    }
}


}

