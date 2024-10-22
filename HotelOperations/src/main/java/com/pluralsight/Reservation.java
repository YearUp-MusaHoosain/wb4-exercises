package com.pluralsight;

public class Reservation {

    private String RoomType;
    private int NumberOfNights;
    private boolean Weekend;
    private double ReservationTotal;

    public Reservation(String RoomType, int NumberOfNights, boolean Weekend, double ReservationTotal){
        this.RoomType = RoomType;
        this.NumberOfNights = NumberOfNights;
        this.Weekend = Weekend;
        this.ReservationTotal = ReservationTotal;
    }


    public String getRoomType(){
        return RoomType;
    }


    public void setRoomType(String RoomType){
        this.RoomType = RoomType;
    }

    public double getPrice() throws Exception {
        double Price = 0;
        if (this.getRoomType().equalsIgnoreCase("king")){
            Price = 139.0;
        } else if (this.getRoomType().equalsIgnoreCase("double")) {
            Price = 124.0;
        }
        else {
            throw new Exception("Invalid Room Type");
        }

        if(this.isWeekend()){
//            Price = Price + (Price * .10);
//            Price = Price * 1.1;
            Price *= 1.1;
        }
        return Price;
    }

    public int getNumberOfNights(){
        return this.NumberOfNights;
    }

    public void setNumberOfNights(int NumberOfNights){
        this.NumberOfNights = NumberOfNights;
    }

    public boolean isWeekend(){
        return this.Weekend;
    }

    public void setIsWeekend(boolean isWeekend){
        this.Weekend = isWeekend;
    }

    public double getReservationTotal() throws Exception {
        return this.getPrice() * getNumberOfNights();
    }

}
