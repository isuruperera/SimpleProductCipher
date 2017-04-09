/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cypherapp;

/**
 *
 * @author Isuru Tharanga
 */
public class Encrypt {
    
        //Logic for substitution of values
        private String substitution(String inputText, int key1){
        StringBuilder s = new StringBuilder();
        int len = inputText.length();
        char tempChar;
        int charValue;
        for(int i=0;i<len;i++)
        {
            tempChar = inputText.charAt(i);
            
               tempChar = (char)(((int)tempChar)^key1);
               s.append(tempChar);
        }
        String op = s.toString();
        return op;
    }
        
    //Logic for transposition of values
    private String tansposition(String input,int key2)
    {
        key2 = key2%10000;      
        char output[][]=new char[10000][10000];
        int len = input.length();
        String output2="";
        int i1,i2,i;
         
        //calculate columns from rows
        int m_col = (int)Math.ceil(((float)len)/key2);
         
        for(i=0,i1=0,i2=0;i<len;i++)
        {
            output[i2][i1]=input.charAt(i);
            i2++;
            if(i2==key2)
            {
                i2=0;
                i1++;
            } 
        }
  
        for(i1=0;i1<key2;i1++)
        {
            for(i2=0;i2<m_col;i2++)
            {
                output2 = output2+output[i1][i2];
            }
        }
        return (output2);        
    }
     
    //Encrypt text by doing substitution and transposition
    public String encryptText(String text,int key1, int key2){
        String op = "";
        
        for(int i =0; i<1;i++){
            op = tansposition(text,key1+3);
            op = substitution(op,key2+3);
        }
        
        return op;  
    }
        
}
