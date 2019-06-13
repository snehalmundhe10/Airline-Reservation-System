package Business;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Flight {

    private static int count = 0;   
    private int flightId;   
    private String airlineType;
    private int airlineCapacity;
    private String source;
    private String destination;
    //private String date;
    private Date date;
    private double flightFare;

//                            Date date = new Date();
//                            SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
//                            String Date = fmt.format(date);        
    public Flight() {
        count++;
        flightId = count;
       // seatList = new ArrayList<>();
    }
    
    public int getFlightId() {
        return flightId;
    }
    
    public String getAirlineType() {
        return airlineType;
    }

    public void setAirlineType(String airlineType) {
        this.airlineType = airlineType;
    }

    public int getAirlineCapacity() {
        return airlineCapacity;
    }

    public void setAirlineCapacity(int airlineCapacity) {
        this.airlineCapacity = airlineCapacity;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }

    public double getFlightFare() {
        return flightFare;
    }

    public void setFlightFare(double flightFare) {
        this.flightFare = flightFare;
    }   
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return airlineType;
    }
    
    
}
