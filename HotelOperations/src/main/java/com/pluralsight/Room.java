package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean dirty;
    private boolean occupied;


    public Room(int numberOfBeds, double price, boolean dirty, boolean occupied){
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.dirty = dirty;
        this.occupied = occupied;

    }

    public int getNumberOfBeds(){
        return this.numberOfBeds;
    }

    public double getPrice(){
        return this.price;
    }

    public boolean isDirty(){
        return this.dirty;
    }

    public boolean isOccupied(){
        return occupied;
    }

    public boolean isAvailable(){
        return (!this.isDirty() && !this.isOccupied());
    }
}
