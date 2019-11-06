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
public class Enclosure {
    private Dog[] spaces;
    
    private int price = 15;
    

   public Enclosure()
   {
      spaces = new Dog[10];
       
   }
    
   public boolean addDog(Dog dogIn)
   {
       for(int i=0; i<spaces.length; i++)
       {
            if(spaces[i] == null)
            {
                spaces[i] = dogIn;
                return true;
            }
        }
        return false;
   }
    public boolean xDog(String ID)
    {
        for(int i=0; i<spaces.length; i++)
        {
            if(spaces[i] != null)
            {
                if(spaces[i].getid().equals(ID))
                {
                    spaces[i] = null;
                    return true;
                }
            }
        }
        return false;
    }
    
    public int encSpaces()
    {
        int tally = 0;
        for(int i=0; i<spaces.length; i++)
        {
            if(spaces[i] == null)
            {
                tally++;
            }
        }
        return tally;
    }
       }
   

