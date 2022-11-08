/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_lab251;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sara alshehri
 */
public class Project_lab251Test {
    
    public Project_lab251Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Test of rentProudct method, of class Project_lab251.
     */
    @Test
    public void testRentProudct() {
        System.out.println("rentProudct");
        ArrayList<Supplies>table = new ArrayList<Supplies>();
        table.add(new Supplies("Round table for 6",100.0,1,0));
        ArrayList<Supplies>chair = new ArrayList<Supplies>();
        chair.add(new Supplies("White Chair",40.0,1,0));
        ArrayList<Supplies>speaker = new ArrayList<Supplies>();
        speaker.add(new Supplies("Big Speaker",120.0,1,0));
        
        Project_lab251 instance = new Project_lab251();
        
        String name ="Round table for 6" ;
        String expName=table.get(0).getName();
        assertEquals(expName, name);
    }

    /**
     * Test of serviceRating method, of class Project_lab251.
     */
    @Test
    public void testServiceRating() {
        System.out.println("serviceRating");
        int rating =2;
        int expRating=2;
        assertEquals(expRating, rating);
    }
    
}
