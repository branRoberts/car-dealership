package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    private void init(){
       DealershipFileManager dealershipFileManager = new DealershipFileManager();
       dealership = dealershipFileManager.getDealership();
    }

    public void display(){
        Scanner input = new Scanner(System.in);
        init();
        while(true){
            System.out.println("Welcome to the Vehicle Menu");
            System.out.println("1. Find Vehicle within price range");
            System.out.println("2. Find Vehicle make/model");
            System.out.println("3. Find Vehicle year range");
            System.out.println("4. Find vehicle by color");
            System.out.println("5. Find vehicle mileage range");
            System.out.println("6. Find vehicle by type");
            System.out.println("7. List all vehicles");
            System.out.println("8. Add vehicle");
            System.out.println("9. Remove vehicle");
            System.out.println("99. Exit");

            String choice = input.nextLine();
            switch(choice){
                case "1" -> processPriceRangeRequest();
                case "2" -> processMakeModelRequest();
                case "3" -> processYearRangeRequest();
                case "4" -> processColorRequest();
                case "5" -> processMileageRangeRequest();
                case "6" -> processVehicleTypeRequest();
                case "7" -> processAllVehiclesRequest();
                case "8" -> processAddVehicleRequest();
                case "9" -> processRemoveVehicleRequest();
                case "99" -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }

        }
    }
    public void displayVehicles(ArrayList<Vehicle> vehicles){
        for(Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }
    }
    public void processPriceRangeRequest(){}
    public void processMakeModelRequest(){}
    public void processYearRangeRequest(){}
    public void processColorRequest(){}
    public void processMileageRangeRequest(){}
    public void processVehicleTypeRequest(){}
    public void processAllVehiclesRequest(){
        displayVehicles(dealership.getAllVehicles());
    }
    public void processAddVehicleRequest(){}
    public void processRemoveVehicleRequest(){}
}
