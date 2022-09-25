package main.java.com.company;
import java.util.*;
import com.google.gson.Gson;

public class info {
    private String Cname;
    private String Boarding;
    private String departure;
    private String Flight_no;
    private String Class_type;

    public info() {

    }
    public info(String Cname, String Boarding,String departure, String Flight_no,String Class_type) {
        this.Cname = Cname;
        this.Boarding=Boarding;
        this.departure=departure;
        this.Flight_no=Flight_no;
        this.Class_type=Class_type;
    }

    public String getCname(String Cname) {
        return Cname;
    }

    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    public String getBoarding() {
        return Boarding;
    }

    public void setBoarding(String Boarding) {
        this.Boarding=Boarding;
    }

    public String getDeparture() {
        return departure;
    }
    public void setDeparture(String departure) {
        this.departure=departure;
    }
    public int getFlight_no(int Flight_no) {
        return Flight_no;
    }
    public void setFlight_no(String Flight_no) {
        this.Flight_no=Flight_no;
    }
    public String getClass_type(String Class_type) {
        return Class_type;
    }
    public void setClass_type(String Class_type) {
        this.Class_type=Class_type;
    }
    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}

