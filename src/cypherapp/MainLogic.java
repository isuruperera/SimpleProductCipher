/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cypherapp;

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
 * @author Isuru Tharanga
 */
public class MainLogic {
    private String cipherText = "";
    private String STATUS = "";

    /**
     * @return the cipherText
     */
    public String getCipherText() {
        return cipherText;
    }

    /**
     * @param cipherText the cipherText to set
     */
    public void setCipherText(String cipherText) {
        this.cipherText = cipherText;
    }
    
    public void encryptText(int key1,int key2){
        Encrypt encryptor = new Encrypt();
        cipherText = encryptor.encryptText(cipherText, key1, key2);
    }
    
    public void decryptText(int key1,int key2){
        Decrypt decryptor = new Decrypt();
        cipherText = decryptor.decryptText(cipherText, key1, key2);
    }
    
    public void readFile(){
        try {
            FileReader fr = new FileReader("input.txt");
            BufferedReader text = new BufferedReader(fr);
            String tempLine = "";
            cipherText = "";
            ArrayList<String> lines = new ArrayList();
            while((tempLine = text.readLine())!=null){
                cipherText+=tempLine + " ";
            }
            setSTATUS("Status: input.txt file loaded");
                      
        } catch (FileNotFoundException ex) {
            setSTATUS("Error: File Not Found");
            Logger.getLogger(MainLogic.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            setSTATUS("Error: File Read Error");
            Logger.getLogger(MainLogic.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void writeFile(){
        try{
            FileWriter fw = new FileWriter("output.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(cipherText);
            bw.flush();
            bw.close();
            fw.close();
            setSTATUS("Status: Message text saved to output.txt");
        }catch(IOException ex){
            setSTATUS("Error: File Write Error");
        }
    
    
    }
    

    /**
     * @return the STATUS
     */
    public String getSTATUS() {
        return STATUS;
    }

    /**
     * @param STATUS the STATUS to set
     */
    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }
    
}
