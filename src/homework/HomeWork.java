/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class HomeWork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          System.out.println("Hello");
        System.out.println("Wellcome to my program");
        Scanner myKB = new Scanner(System.in);
        
        String password;
        
        System.out.println("Please enter your password ");
        
        password = myKB.nextLine();
if(password.length() > 8){
            
            System.out.println("Your password is ok");
              String services;
        String response;
      
        System.out.println("Do you like over services?");
        
        services = myKB.nextLine();//get input
     
        System.out.println("How you give response?");
        
        response = myKB.nextLine();
        
        System.out.println( services  + " \n Thank for your response " + response);
        }
        
        else{
            
            System.out.println("Invalid - must be at least 8 characters");

    }
        
}
}