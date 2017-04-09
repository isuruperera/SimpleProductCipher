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
public class CypherApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainLogic mainLogic = new MainLogic();
        //mainLogic.readFile();
//        System.out.println(System.getProperty("user.dir"));
        MainWindow mw = new MainWindow();
        mw.setMainLogic(mainLogic);
//        String s = "Cypher this 2131 #$#%#@#";
//        Encrypt en = new Encrypt();
//        String testEn = en.encryptText(s, 1, 2);
//        System.out.println(testEn);
//        Decrypt de = new Decrypt();
//        String testDe = de.decryptText(testEn, 1, 2);
//        System.out.println(testDe);
        
        
         mw.setVisible(true);
    }
    
}
