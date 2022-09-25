package main.java.com.company;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Random;

import main.java.com.company.generaterandom.*;

import static main.java.com.company.generaterandom.*;


public class createjson {
    public static void main(String[] args)throws InterruptedException, IOException  {
        while (true) {
            int records = new Random().nextInt(15);
            for (int i = 1; i <= records; i++) {
                info AirlineInfo = new info();
                AirlineInfo.setCname(generateRandomCname());
                AirlineInfo.setBoarding(generateRandomBoarding());
                AirlineInfo.setDeparture(generateRandomDeparture());

                AirlineInfo.setFlight_no(generateFlight_No());
                AirlineInfo.setClass_type(generateRandomClass_Type());
                // Write the vehicleInfo data into a file
                File file = new File("airline-info.json");
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                System.out.println(AirlineInfo);
                bw.write(AirlineInfo.toString()+"\n");
                bw.flush();
                bw.close();
            }
            Thread.sleep(100);
            System.out.println("Written "+records+" to file");
        }
    }
}
