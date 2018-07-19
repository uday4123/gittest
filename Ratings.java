package com.posidex.linkdlink.dao;

public class Ratings {
	private double staffBehaviour;

    private int busQuality;

    private double onBoardExperience;

    private double onTimeAD;

    private int acQuality;

    private double stopOverExperience;

    private double seats;

    private double seater;

    private int punctuality;

    public void setStaffBehaviour(double staffBehaviour){
        this.staffBehaviour = staffBehaviour;
    }
    public double getStaffBehaviour(){
        return this.staffBehaviour;
    }
    public void setBusQuality(int busQuality){
        this.busQuality = busQuality;
    }
    public int getBusQuality(){
        return this.busQuality;
    }
    public void setOnBoardExperience(double onBoardExperience){
        this.onBoardExperience = onBoardExperience;
    }
    public double getOnBoardExperience(){
        return this.onBoardExperience;
    }
    public void setOnTimeAD(double onTimeAD){
        this.onTimeAD = onTimeAD;
    }
    public double getOnTimeAD(){
        return this.onTimeAD;
    }
    public void setAcQuality(int acQuality){
        this.acQuality = acQuality;
    }
    public int getAcQuality(){
        return this.acQuality;
    }
    public void setStopOverExperience(double stopOverExperience){
        this.stopOverExperience = stopOverExperience;
    }
    public double getStopOverExperience(){
        return this.stopOverExperience;
    }
    public void setSeats(double seats){
        this.seats = seats;
    }
    public double getSeats(){
        return this.seats;
    }
    public void setSeater(double seater){
        this.seater = seater;
    }
    public double getSeater(){
        return this.seater;
    }
    public void setPunctuality(int punctuality){
        this.punctuality = punctuality;
    }
    public int getPunctuality(){
        return this.punctuality;
    }
}
