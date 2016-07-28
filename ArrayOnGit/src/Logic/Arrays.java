/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author Mogli
 */
public class Arrays {
 int[] enterosArrat;
 
 public void FillArray(int TamañoArray){
     this.enterosArrat = new int[TamañoArray];
     for (int i = 0; i <= this.enterosArrat.length-1; i++) {
      this.enterosArrat[i] = (int) (Math.random()*10) + 1;
     }
 }
 
 public String ShowArray(){
     String mensaje ="";
     for(int i =0;i<=this.enterosArrat.length-1;i++){
         mensaje +="Este numero esta en la poscion :" + i
                 + " y el numero guardao en el arreglo es:"
                 +this.enterosArrat[i]+"\n";  
     }
     return mensaje;
 }
 
}
