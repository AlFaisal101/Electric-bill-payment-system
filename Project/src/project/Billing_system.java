
package project;

import java.util.Scanner;



public class Billing_system {
    
    static Billing_system op = new Billing_system();
    static Scanner sc = new Scanner(System.in);
    static Scanner inp = new Scanner(System.in); 
    
    void payment(){
       
        String ab;
        System.out.print("\nAvailiable payment methods: "
                         + "\n1.Bkash"
                         + "\n2.Rocket"
                         + "\n3.Credit card"
                         + "\n4.Press 4 to go back"
                         + "\nSelect: ");
        int select = sc.nextInt();
        
        if(select == 1){
                System.out.print("Enter bkash accnt no. : ");
                ab = inp.nextLine();
                
                System.out.print("Enter pin: ");
                String ab2 = inp.nextLine();
                
                if(ab.length() == 11 && ab2.length() == 5){
                    System.out.print("\nSucessfully purchased"+"\n\n\n");
                }
                else{
                    System.out.print("\nInvalid bkash account or pin!\nTry again"+"\n\n\n\n");
                }
            }
                
            
        else if(select == 2){
            System.out.print("Enter rocket accnt no. : ");
                ab = inp.nextLine();
                
                System.out.print("Enter pin: ");
                String ab2 = inp.nextLine();
                
                if(ab.length() == 13 && ab2.length() == 5){
                    System.out.print("\nSucessfully purchased"+"\n\n\n");
                }
                else{
                    System.out.print("\nInvalid rocket account or pin!\nTry again"+"\n\n\n\n");
                }
            }
        
        else if(select == 3){
            System.out.print("\nEnter Credit card accnt no. : ");
                ab = inp.nextLine();
                
                System.out.print("Enter pin: ");
                String ab2 = inp.nextLine();
                
                if(ab.length() == 6 && ab2.length() == 4){
                    System.out.print("\nSucessfully purchased"+"\n\n\n");
                }
                else{
                    System.out.print("\nInvalid Credit card account or pin!\nTry again"+"\n\n\n\n");
                }
            }
        else if(select == 4){
            op.provider();
        }
        else{
            System.out.print("\nWrong insertion!\nTry again.\n");
        }
        
    }
    
    
    void provider(){
        System.out.print("\nCurrent providers:"
                + "\n1.DPDC"
                + "\n2.DESCO"
                + "\n3.NESCO"
                + "\n4.BPDB"
                + "\n5.WestZone"
                + "\nSelect: ");
        
        int select = sc.nextInt();
        
      
            System.out.print("\nSelect package(monthly package)"
                             + "\n1.200 KiloWatt"
                             + "\n2.500 Kilowatt"
                             + "\n3.1000 KiloWatt"
                             + "\nSelect: ");
            select = sc.nextInt();
            
            
            if(select == 1){
                
                System.out.print("Monthly package 200 KiloWatt would cost ...\n\nAre you sure to buy?"
                                + "\nPress 1 to confirm:");
                select = sc.nextInt();
                if(select == 1){
                    op.payment();
                }
            }
            else if(select == 2){
                
                System.out.print("Monthly package 500 KiloWatt would cost ...\n\nAre you sure to buy?"
                                + "\nPress 1 to confirm:");
                select = sc.nextInt();
                if(select == 1){
                    op.payment();
                }
            }
            else if(select == 3){
                
                System.out.print("Monthly package 1000 KiloWatt would cost ...\n\nAre you sure to buy?"
                                + "\nPress 1 to confirm:");
                select = sc.nextInt();
                if(select == 1){
                    op.payment();
                }
            }
      
            else{
                System.out.print("\nWrong insertion!\nTry again.");            } 
       
    }
    
    void selection(){
        System.out.println("\n\nBuy electricity"
                        +"\n1. Residential purpose"
                        + "\n2. Industrial purpose"
                        + "\nEnter selection: ");
        int select = sc.nextInt();
        
        if(select == 1){
            op.provider();
        }
        else{
            op.provider();
        }
    }
    public static void main(String[] args) {
       
        String nam = "Al faisal";
        System.out.print("\tWelcome to electricity prepaid  purchase!!"
                        + "\n\nPlease log in first."
                        + "\nEnter user name: ");
        String arr = sc.nextLine();
        
        
        String pass = "4321";
        System.out.print("Enter user pin: ");
        String pin = sc.nextLine();
        
    
        
        if(arr .equals(nam) && pin.equals(pass)){
              System.out.print("\nSucessfully logged in!");
              op.selection();
          }
          else{
              System.out.print("Invalid user name or pin!"
                               +"\nTry again.\n");
          }
  
    }
   }
