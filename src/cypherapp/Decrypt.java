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
    String substitution(String input, int key1){
        StringBuilder s = new StringBuilder();
        int len = input.length();
        char temp;
        int t1;
        for(int i=0;i<len;i++)
        {
            temp = input.charAt(i);
            if(Character.isUpperCase(temp))
            {
                t1 = (int)temp - (int)'A';
                t1 = (t1 - key1 +26)%26;
                t1 = t1 + (int)'A';
                temp = (char)t1;
                s.append(temp);
            }
            else if(Character.isLowerCase(temp))
            {
                t1 = (int)temp - (int)'a';
                t1 = (t1 - key1+26)%26;
                t1 = t1 + (int)'a';
                temp = (char)t1;
                s.append(temp);
            }
            else
            {
                s.append(temp);
            }
        }
        String op = s.toString();
        return op;
    }
    
    String tansposition(String input,int key2)
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
    
    public String decryptText(String text, int key1, int key2){
        String op = "";
        
        //System.out.println(op);
        for(int i =0; i<5;i++){
            op = substitution(text,key1);
            op = tansposition(op,key2);
        }
        return op;
    
    }
    
    
}
