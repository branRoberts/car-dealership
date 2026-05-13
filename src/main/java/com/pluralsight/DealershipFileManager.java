package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class DealershipFileManager {

    public Dealership getDealership() {
        String line;
        Dealership dealership = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("dealership.csv"));
            String firstLine = reader.readLine();
            String dealershipData[] = firstLine.split("\\|");
            dealership = new Dealership(dealershipData[0], dealershipData[1], dealershipData[2]);

            while ((line = reader.readLine()) != null) {
                String[] values = line.split("\\|");
                int vin = Integer.parseInt(values[0]);
                int year = Integer.parseInt(values[1]);
                String make = values[2];
                String model = values[3];
                String vehicleType = values[4];
                String color = values[5];
                int odometer = Integer.parseInt(values[6]);
                double price = Double.parseDouble(values[7]);
                dealership.addVehicle(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));


            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error reading dealership.csv");
        }
        return dealership;
    }

}
