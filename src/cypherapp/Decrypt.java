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
public class Decrypt {
    
    //logic for reverse substitution
    private String substitution(String input, int key1){
        StringBuilder s = new StringBuilder();
        int len = input.length();
        char tempChar;
        int charValue;
        for(int i=0;i<len;i++)
        {
            tempChar = input.charAt(i);
            if(Character.isUpperCase(tempChar))
            {
                charValue = (int)tempChar - (int)'A';
                charValue = (charValue - key1 +26)%26;
                charValue = charValue + (int)'A';
                tempChar = (char)charValue;
                s.append(tempChar);
            }
            else if(Character.isLowerCase(tempChar))
            {
                charValue = (int)tempChar - (int)'a';
                charValue = (charValue - key1+26)%26;
                charValue = charValue + (int)'a';
                tempChar = (char)charValue;
                s.append(tempChar);
            }
            else
            {
//                charValue = (int)tempChar;
//                charValue = (charValue - key1);
//                tempChar = (char)charValue;
                s.append(tempChar);
            }
        }
        String op = s.toString();
        return op;
    }
    
    //logic for reverse transposition
    private String tansposition(String input,int key2)
    {
        char output[][]=new char[100][100];
        int len = input.length();
        String output2="";
        int i1,i2,i;
         
        //calculate columns from rows
        int m_col = (int)Math.ceil((float)len/key2);
         
        for(i=0,i1=0,i2=0;i<len;i++)
        {
            output[i1][i2]=input.charAt(i);
            i2++;
            if(i2==m_col)
            {
                i2=0;
                i1++;
            } 
        }
 
        for(i1=0;i1<m_col;i1++)
        {
            for(i2=0;i2<key2;i2++)
            {
                output2 = output2+output[i2][i1];
            }
        }
        return (output2);
    }
    
    
    //logic for reverse substitution and transposition iteratively to decrypt
    public String decryptText(String text, int key1, int key2){
        String op = "";
        
        //System.out.println(op);
        for(int i =0; i<5;i++){
            op = substitution(text,key1+3);
            op = tansposition(op,key2+3);
        }
        return op;
    
    }
    
    
}
