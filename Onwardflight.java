package com.posidex.linkdlink.dao;

import java.util.Date;

public class Onwardflight {
	 private String origin;

    private String rating;

    private String DepartureTime;

    private String cancellationPolicy;

    private int avlWindowSeats;

    private int impulse_perc_seats;

    private String BusServiceID;

    private String totalReviews;

    private String seat;

    private String duration;

    private String qtype;

    private boolean AvailCatCard;

    private String skey;

    private String busCondition;

    private String src_voyager_id;

    private int levyFee;

    private String destination;

    private BPPrims BPPrims;

    private String amenities;

    private String src_vendor_id;

    private String dest_voyager_id;

    private String ArrivalTime;

    private int zeroCancellationTime;

    private String gps;

    private Fare fare;

    private String dst_vendor_id;

    private String OperatorID;

    private DPPrims DPPrims;

    private String mTicket;

    private String row_type;

    private String BusType;

    private RouteSeatTypeDetail RouteSeatTypeDetail;

    private String depdate;

    private String idRequired;

    private int ServiceID;

    private String busCompany;

    private boolean bpDpSeatLayout;

    private Ugcreview ugcreview;

    private String TravelsName;

    private String tbrequired;

    private String farebasis;

    private String RouteID;

    private String ServiceName;

    private int srtFee;

    private String partialCancellationAllowed;

    private String ugcid;

    private String arrdate;

    public void setOrigin(String origin){
        this.origin = origin;
    }
    public String getOrigin(){
        return this.origin;
    }
    public void setRating(String rating){
        this.rating = rating;
    }
    public String getRating(){
        return this.rating;
    }
    public void setDepartureTime(String DepartureTime){
        this.DepartureTime = DepartureTime;
    }
    public String getDepartureTime(){
        return this.DepartureTime;
    }
    public void setCancellationPolicy(String cancellationPolicy){
        this.cancellationPolicy = cancellationPolicy;
    }
    public String getCancellationPolicy(){
        return this.cancellationPolicy;
    }
    public void setAvlWindowSeats(int avlWindowSeats){
        this.avlWindowSeats = avlWindowSeats;
    }
    public int getAvlWindowSeats(){
        return this.avlWindowSeats;
    }
    public void setImpulse_perc_seats(int impulse_perc_seats){
        this.impulse_perc_seats = impulse_perc_seats;
    }
    public int getImpulse_perc_seats(){
        return this.impulse_perc_seats;
    }
    public void setBusServiceID(String BusServiceID){
        this.BusServiceID = BusServiceID;
    }
    public String getBusServiceID(){
        return this.BusServiceID;
    }
    public void setTotalReviews(String totalReviews){
        this.totalReviews = totalReviews;
    }
    public String getTotalReviews(){
        return this.totalReviews;
    }
    public void setSeat(String seat){
        this.seat = seat;
    }
    public String getSeat(){
        return this.seat;
    }
    public void setDuration(String duration){
        this.duration = duration;
    }
    public String getDuration(){
        return this.duration;
    }
    public void setQtype(String qtype){
        this.qtype = qtype;
    }
    public String getQtype(){
        return this.qtype;
    }
    public void setAvailCatCard(boolean AvailCatCard){
        this.AvailCatCard = AvailCatCard;
    }
    public boolean getAvailCatCard(){
        return this.AvailCatCard;
    }
    public void setSkey(String skey){
        this.skey = skey;
    }
    public String getSkey(){
        return this.skey;
    }
    public void setBusCondition(String busCondition){
        this.busCondition = busCondition;
    }
    public String getBusCondition(){
        return this.busCondition;
    }
    public void setSrc_voyager_id(String src_voyager_id){
        this.src_voyager_id = src_voyager_id;
    }
    public String getSrc_voyager_id(){
        return this.src_voyager_id;
    }
    public void setLevyFee(int levyFee){
        this.levyFee = levyFee;
    }
    public int getLevyFee(){
        return this.levyFee;
    }
    public void setDestination(String destination){
        this.destination = destination;
    }
    public String getDestination(){
        return this.destination;
    }
    public void setBPPrims(BPPrims BPPrims){
        this.BPPrims = BPPrims;
    }
    public BPPrims getBPPrims(){
        return this.BPPrims;
    }
    public void setAmenities(String amenities){
        this.amenities = amenities;
    }
    public String getAmenities(){
        return this.amenities;
    }
    public void setSrc_vendor_id(String src_vendor_id){
        this.src_vendor_id = src_vendor_id;
    }
    public String getSrc_vendor_id(){
        return this.src_vendor_id;
    }
    public void setDest_voyager_id(String dest_voyager_id){
        this.dest_voyager_id = dest_voyager_id;
    }
    public String getDest_voyager_id(){
        return this.dest_voyager_id;
    }
    public void setArrivalTime(String ArrivalTime){
        this.ArrivalTime = ArrivalTime;
    }
    public String getArrivalTime(){
        return this.ArrivalTime;
    }
    public void setZeroCancellationTime(int zeroCancellationTime){
        this.zeroCancellationTime = zeroCancellationTime;
    }
    public int getZeroCancellationTime(){
        return this.zeroCancellationTime;
    }
    public void setGps(String gps){
        this.gps = gps;
    }
    public String getGps(){
        return this.gps;
    }
    public void setFare(Fare fare){
        this.fare = fare;
    }
    public Fare getFare(){
        return this.fare;
    }
    public void setDst_vendor_id(String dst_vendor_id){
        this.dst_vendor_id = dst_vendor_id;
    }
    public String getDst_vendor_id(){
        return this.dst_vendor_id;
    }
    public void setOperatorID(String OperatorID){
        this.OperatorID = OperatorID;
    }
    public String getOperatorID(){
        return this.OperatorID;
    }
    public void setDPPrims(DPPrims DPPrims){
        this.DPPrims = DPPrims;
    }
    public DPPrims getDPPrims(){
        return this.DPPrims;
    }
    public void setMTicket(String mTicket){
        this.mTicket = mTicket;
    }
    public String getMTicket(){
        return this.mTicket;
    }
    public void setRow_type(String row_type){
        this.row_type = row_type;
    }
    public String getRow_type(){
        return this.row_type;
    }
    public void setBusType(String BusType){
        this.BusType = BusType;
    }
    public String getBusType(){
        return this.BusType;
    }
    public void setRouteSeatTypeDetail(RouteSeatTypeDetail RouteSeatTypeDetail){
        this.RouteSeatTypeDetail = RouteSeatTypeDetail;
    }
    public RouteSeatTypeDetail getRouteSeatTypeDetail(){
        return this.RouteSeatTypeDetail;
    }
    public void setDepdate(String depdate){
        this.depdate = depdate;
    }
    public String getDepdate(){
        return this.depdate;
    }
    public void setIdRequired(String idRequired){
        this.idRequired = idRequired;
    }
    public String getIdRequired(){
        return this.idRequired;
    }
    public void setServiceID(int ServiceID){
        this.ServiceID = ServiceID;
    }
    public int getServiceID(){
        return this.ServiceID;
    }
    public void setBusCompany(String busCompany){
        this.busCompany = busCompany;
    }
    public String getBusCompany(){
        return this.busCompany;
    }
    public void setBpDpSeatLayout(boolean bpDpSeatLayout){
        this.bpDpSeatLayout = bpDpSeatLayout;
    }
    public boolean getBpDpSeatLayout(){
        return this.bpDpSeatLayout;
    }
    public void setUgcreview(Ugcreview ugcreview){
        this.ugcreview = ugcreview;
    }
    public Ugcreview getUgcreview(){
        return this.ugcreview;
    }
    public void setTravelsName(String TravelsName){
        this.TravelsName = TravelsName;
    }
    public String getTravelsName(){
        return this.TravelsName;
    }
    public void setTbrequired(String tbrequired){
        this.tbrequired = tbrequired;
    }
    public String getTbrequired(){
        return this.tbrequired;
    }
    public void setFarebasis(String farebasis){
        this.farebasis = farebasis;
    }
    public String getFarebasis(){
        return this.farebasis;
    }
    public void setRouteID(String RouteID){
        this.RouteID = RouteID;
    }
    public String getRouteID(){
        return this.RouteID;
    }
    public void setServiceName(String ServiceName){
        this.ServiceName = ServiceName;
    }
    public String getServiceName(){
        return this.ServiceName;
    }
    public void setSrtFee(int srtFee){
        this.srtFee = srtFee;
    }
    public int getSrtFee(){
        return this.srtFee;
    }
    public void setPartialCancellationAllowed(String partialCancellationAllowed){
        this.partialCancellationAllowed = partialCancellationAllowed;
    }
    public String getPartialCancellationAllowed(){
        return this.partialCancellationAllowed;
    }
    public void setUgcid(String ugcid){
        this.ugcid = ugcid;
    }
    public String getUgcid(){
        return this.ugcid;
    }
    public void setArrdate(String arrdate){
        this.arrdate = arrdate;
    }
    public String getArrdate(){
        return this.arrdate;
    }
}





