/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cypherapp.MainLogic;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Isuru Tharanga
 */
public class MainControllerTest {
    
    public MainControllerTest() {
        Test1();
        
    }
    
    @Test
    public void Test1(){
        MainLogic mc = new MainLogic();
        mc.readFile();
        System.out.println(System.getProperty("user.dir"));
        assertTrue(mc.getCipherText()!="");
    
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
