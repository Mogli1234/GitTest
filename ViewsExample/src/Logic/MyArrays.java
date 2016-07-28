/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.ArrayList;

/**
 *
 * @author Mogli
 */
public class MyArrays {
    public ArrayList<String> stringArrays;
    public int[] ArrayExample;
    
    //this is the constructor I initialize all the arrays or List
    public MyArrays() {
        this.stringArrays = new ArrayList<String>();
        this.ArrayExample = new int[8];
    }
    
    //This are example of a element call ArrayList you dont use this element of the actual course
    public void AddItemsToArray(String Object){
        this.stringArrays.add(Object);
    }
    
    public String showItemsFromArrayList(){
        String message = "";
        for(Object key:this.stringArrays){
           message+= key + "\n";
       }
        return message;
    }
    
    //This items are for normal array like the example of the last week
    public void FillArray(){
        for (int i = 0; i < this.ArrayExample.length; i++) {
            this.ArrayExample[i] = (int) (Math.random()*100) +1;
        }
    }
    
   public String PrintMyArray(){
       String menssage ="";
     for(int i =0;i<=this.ArrayExample.length-1;i++){
         menssage += this.ArrayExample[i]+"\n";  
     }
     return menssage;
   }
    
}
