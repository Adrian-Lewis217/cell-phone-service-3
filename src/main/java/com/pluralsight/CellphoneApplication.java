package com.pluralsight;

import java.util.Scanner;

public class CellphoneApplication {
    public static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the information for CellPhone 1:");
        System.out.print("Enter Serial Number: ");
        int serialNum = input.nextInt();
        cellPhone1.setSerialNum(serialNum);
        input.nextLine(); // buffer

        System.out.print("Enter Model of Phone: ");
        String model = input.nextLine();
        cellPhone1.setModel(model);

        System.out.print("Enter the Carrier: ");
        String carrier = input.nextLine();
        cellPhone1.setCarrier(carrier);

        System.out.print("Enter the Phone Number: ");
        String phoneNum = input.nextLine();
        cellPhone1.setPhoneNum(phoneNum);

        System.out.print("Enter name of Owner: ");
        String owner = input.nextLine();
        cellPhone1.setOwner(owner);

        System.out.println("Enter the information for CellPhone 2:");
        System.out.print("Enter Serial Number: ");
        int serialNum2 = input.nextInt();
        cellPhone2.setSerialNum(serialNum2);
        input.nextLine(); // buffer

        System.out.print("Enter Model of Phone: ");
        String model2 = input.nextLine();
        cellPhone2.setModel(model2);

        System.out.print("Enter the Carrier: ");
        String carrier2 = input.nextLine();
        cellPhone2.setCarrier(carrier2);

        System.out.print("Enter the Phone Number: ");
        String phoneNum2 = input.nextLine();
        cellPhone2.setPhoneNum(phoneNum2);

        System.out.print("Enter name of Owner: ");
        String owner2 = input.nextLine();
        cellPhone2.setOwner(owner2);

        input.close();

        display(cellPhone1);
        display(cellPhone2);

        cellPhone1.dial(cellPhone2.getPhoneNum());
        cellPhone2.dial(cellPhone1.getPhoneNum());



    }
    public static void display(CellPhone phone){
        System.out.println("\nCellPhone");
        System.out.println("Serial Number: " + phone.getSerialNum());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNum());
        System.out.println("Owner: " + phone.getOwner());
    }


}

