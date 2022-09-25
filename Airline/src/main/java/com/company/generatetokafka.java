package main.java.com.company;

import main.java.com.company.*;
import java.util.*;

import static main.java.com.company.generaterandom.*;

public class generatetokafka {
    public static void main(String[]args) throws InterruptedException{
        while (true) {
            int records = new Random().nextInt(5);//in-memory mutable 4Bytes
            for (int i = 1; i <= records; i++) {
                info air = new info();
                air.setCname(generateRandomCname());
                air.setBoarding(generateRandomBoarding());
                air.setDeparture(generateRandomDeparture());

                air.setFlight_no(generateFlight_No());
                air.setClass_type(generateRandomClass_Type());

                testkafka.sendtokafka("airline_ticket",air.toString());
            }
            System.out.println("Written " + records + " to Kafka..");
            Thread.sleep(30);
        }
    }
}
