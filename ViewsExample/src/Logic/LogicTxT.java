/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mogli
 */
public class LogicTxT {

    String[] txtText;
    String fileName;
    String lineTxt = null;
    String[] toFile = {"","",""};
    ArrayList<Data> myList;
    Data[] array = new Data [4];

    public LogicTxT() {
        this.txtText = new String[15];
        this.fileName = "C:\\Users\\Mogli\\Documents\\GitTest\\ViewsExample\\src\\Files\\exampleTxT.txt";
        this.myList = new ArrayList<Data>();
        
    }

    //<editor-fold defaultstate="collapsed" desc="Function to charge information to peopleArray">
    public void chargeInformationFromTxT() throws IOException {
        try {
            FileReader file = new FileReader(this.fileName);
            BufferedReader reader = new BufferedReader(file);
            int ArrayIndex = 0;
            while ((this.lineTxt = reader.readLine()) != null) {
                this.txtText[ArrayIndex] = this.lineTxt;
                ArrayIndex++;
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Function to add info to a array length 3">
    public void addInfoToArray(String data) {
        try {
            if (this.toFile[0].isEmpty()) {
                this.toFile[0] = data;
            } else if (this.toFile[1].isEmpty()) {
                this.toFile[1] = data;
            } else if (this.toFile[2].isEmpty()) {
                this.toFile[2] = data;
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Function to export the information to a txtFile">
    public boolean importDataToTxt() {
        boolean state = true;
        int numberOFperson  = (int) (Math.random()*15)+1;
        String namePerson  = this.txtText[numberOFperson-1];
        try {
            FileWriter writer = new FileWriter("C:\\Users\\Mogli\\Documents\\GitTest\\ViewsExample\\src\\Files\\"+namePerson+".txt");
            BufferedWriter Bwriter = new BufferedWriter(writer);
            for (int i = 0; i <this.toFile.length; i++) {
                if (this.toFile[i].equals("")) {
                     Bwriter.write("No he asignado un trabajos");
                     Bwriter.newLine();
                }else{
                    Bwriter.write(this.toFile[i]);
                    Bwriter.newLine(); 
                }
            }
            Bwriter.close();
            this.cleanArray();
        } catch (Exception e) {
            state = false;
        }
        return state;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Function to restart the array empty">
    private void cleanArray(){
        this.toFile[0]="";
        this.toFile[1]="";
        this.toFile[2]="";
    }
    //</editor-fold>
    
    public void addInfo(Data pato){
        try {
            if (this.array[0]==null) {
                this.array[0] = new Data();
                this.array[0].ID = pato.ID;
                this.array[0].nombre = pato.nombre;  
            } else if (this.array[1] ==null) {
                this.array[1] = new Data();
                this.array[1].ID = pato.ID;
                this.array[1].nombre = pato.nombre; 
            } else if (this.array[2] ==null) {
                this.array[2] = pato;
            }else if(this.array[3] == null){
                this.array[3] = pato;
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
    
    public String hola(String nombre){
        String message = "";
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i].nombre.equals(nombre)) {
                message = "holaaa";
            }
        }
        return message;
    }
}
