package com.main;

import java.util.Scanner;

    public class mainprogram {
        public static void main(String[] args) {

            double priceOneShirt;
            double priceAPairOfPants;
            double priceOneDress;
            String customerName, homePhone;
            int numberOfShirts, numberOfPants, numberOfDresses;
            int totalNumberOfItems;
            double subTotalShirts, subTotalPants, subTotalDresses;
            double totalOrder;
            short orderMonth, orderDay, orderYear;

            final double discountRate = 0.15;

            Scanner sc= new Scanner(System.in); //sc is an object of the Scanner Class

            //Input Customer Details
            System.out.println("Welcome to Eyram Retail Services");
            System.out.print("Please enter customer's name: ");
            customerName = sc.nextLine();
            System.out.print("Please enter customer's home phone number: ");
            homePhone = sc.next();

            //Input price details
            System.out.print("\nEnter the price of one shirt: ");
            priceOneShirt = sc.nextDouble();
            System.out.print("Enter please of a pair of pants: ");
            priceAPairOfPants = sc.nextDouble();
            System.out.print("Enter the price of one dress: ");
            priceOneDress = sc.nextDouble();

            //Input number of items bought
            System.out.print("\nEnter number of shirts bought: ");
            numberOfShirts = sc.nextInt();
            System.out.print("Enter number of pants bought: ");
            numberOfPants = sc.nextInt();
            System.out.print("Enter number of dresses bought: ");
            numberOfDresses = sc.nextInt();

            //Input calender details
            System.out.println("\nEnter details of transaction date below");
            System.out.println("******************************************");
            System.out.print("Enter month number: ");
            orderMonth =  sc.nextShort();
            System.out.print("Enter day-number: ");
            orderDay = sc.nextShort();
            System.out.print("Enter year: ");
            orderYear = sc.nextShort();

            //perform calculations
            totalNumberOfItems = numberOfShirts + numberOfPants + numberOfDresses;
            subTotalShirts = numberOfShirts * priceOneShirt;
            subTotalPants = numberOfPants * priceAPairOfPants;
            subTotalDresses = numberOfDresses * priceOneDress;

            totalOrder = subTotalShirts + subTotalPants + subTotalDresses;

            //Display Invoice
            System.out.println("\n-/-\tEyram Retail Services\t-/-");
            System.out.println("==================================");
            System.out.println("Customer: " +customerName);
            System.out.println("Contact Number: " +homePhone);
            System.out.println("Order Date: " +orderDay+" / "+orderMonth+"/ "+orderYear);
            System.out.println("-----------------------------------------------------");
            System.out.println("Items\tQty\tUnit/Price\tSub-Total");
            System.out.println("Shirts\t" +numberOfShirts+ "\t$" +priceOneShirt+ "\t\t$" +subTotalShirts);
            System.out.println("Pants\t" +numberOfPants+ "\t$" +priceAPairOfPants+ "\t\t$" +subTotalPants);
            System.out.println("Dresses\t" +numberOfDresses+ "\t$" +priceOneDress+ "\t\t$" +subTotalDresses);
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Number of items: " +totalNumberOfItems);
            System.out.println("Total Order: $" +totalOrder);
            System.out.println("Total Discount: $" +totalOrder*discountRate);
            System.out.println("===========================================================================");
            System.out.println();

        }
    }
