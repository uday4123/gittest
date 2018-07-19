package com.posidex.linkdlink.dao;

public class List3 {
	private String SellFare;

    private String busCondition;

    private String seatType;

    private String seatTypeSpecific;

    private int SeatsAvailable;

    private String availabilityStatus;

    public void setSellFare(String SellFare){
        this.SellFare = SellFare;
    }
    public String getSellFare(){
        return this.SellFare;
    }
    public void setBusCondition(String busCondition){
        this.busCondition = busCondition;
    }
    public String getBusCondition(){
        return this.busCondition;
    }
    public void setSeatType(String seatType){
        this.seatType = seatType;
    }
    public String getSeatType(){
        return this.seatType;
    }
    public void setSeatTypeSpecific(String seatTypeSpecific){
        this.seatTypeSpecific = seatTypeSpecific;
    }
    public String getSeatTypeSpecific(){
        return this.seatTypeSpecific;
    }
    public void setSeatsAvailable(int SeatsAvailable){
        this.SeatsAvailable = SeatsAvailable;
    }
    public int getSeatsAvailable(){
        return this.SeatsAvailable;
    }
    public void setAvailabilityStatus(String availabilityStatus){
        this.availabilityStatus = availabilityStatus;
    }
    public String getAvailabilityStatus(){
        return this.availabilityStatus;
    }
}
