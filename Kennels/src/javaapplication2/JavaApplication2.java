/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author 4pardg10
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
   
    
    public void main(String[] args) {
      
        
        Enclosure e1 = new Enclosure();
        Scanner scanIn = new Scanner(System.in);
        
        int current = 1;
        
        while(current == 1)
        {
        System.out.println("+-----------------------------------+");
        System.out.println("|        Kennels Application        |");
        System.out.println("+-----------------------------------+");
        System.out.println("Options:");
        System.out.println("1-New Dog");
        System.out.println("2-Find Dog");
        System.out.println("3-Remove Dog");
        System.out.println("4-Exit");
        
        String input = scanIn.nextLine();
        
        if(input.equals("1"))
        {
            System.out.println("Please enter dog ID:");
            String id = scanIn.nextLine();
            Dog d1 = new Dog(id);
            if(e1.addDog(d1))
            {
                System.out.println("New Dog Added");
            }
            else
                    {
                System.out.println("Enclosure is full");
                    }
                    
        }
        }
    }     
}
        
        
  

   
        

    

