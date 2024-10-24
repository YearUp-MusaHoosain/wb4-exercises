package com.pluralsight;

import com.pluralsight.Room;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms){
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedRooms = 0;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedRooms = bookedRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite){
        if (isSuite)
        {
            if(numberOfRooms > getAvailableSuites()){
                return false;
            }
            else // we have the space
            {
                bookedSuites = bookedSuites + numberOfRooms;
                return true;
            }
        }
        else // not a suite
        {
            if(numberOfRooms > getAvailableRooms()){
                return false;
            }
            else{
                bookedRooms = bookedRooms + numberOfRooms;
                return true;
            }
        }

    }

    public int getAvailableSuites(){
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableRooms(){
        return numberOfRooms - bookedRooms;
    }
}
