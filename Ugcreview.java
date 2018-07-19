package com.posidex.linkdlink.dao;

public class Ugcreview {
	private Ratings ratings;

    private int reviewCount;

    private int posReviewCount;

    private int criReviewCount;

    private int imgReviewCount;

    private double totalRating;

    private int approvedImageCount;

    private String id;

    public void setRatings(Ratings ratings){
        this.ratings = ratings;
    }
    public Ratings getRatings(){
        return this.ratings;
    }
    public void setReviewCount(int reviewCount){
        this.reviewCount = reviewCount;
    }
    public int getReviewCount(){
        return this.reviewCount;
    }
    public void setPosReviewCount(int posReviewCount){
        this.posReviewCount = posReviewCount;
    }
    public int getPosReviewCount(){
        return this.posReviewCount;
    }
    public void setCriReviewCount(int criReviewCount){
        this.criReviewCount = criReviewCount;
    }
    public int getCriReviewCount(){
        return this.criReviewCount;
    }
    public void setImgReviewCount(int imgReviewCount){
        this.imgReviewCount = imgReviewCount;
    }
    public int getImgReviewCount(){
        return this.imgReviewCount;
    }
    public void setTotalRating(double totalRating){
        this.totalRating = totalRating;
    }
    public double getTotalRating(){
        return this.totalRating;
    }
    public void setApprovedImageCount(int approvedImageCount){
        this.approvedImageCount = approvedImageCount;
    }
    public int getApprovedImageCount(){
        return this.approvedImageCount;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
}
