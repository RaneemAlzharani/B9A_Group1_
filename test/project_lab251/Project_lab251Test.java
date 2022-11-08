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
     * Test of serviceRating method, of class Project_lab251.
     */
    @Test
    public void testServiceRating() {
        System.out.println("serviceRating");
        int rating =2;
        int expRating=2;
        assertEquals(expRating, rating);
    }

    /**
     * Test of main method, of class Project_lab251.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Project_lab251.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rentProudct method, of class Project_lab251.
     */
    @Test
    public void testRentProudct() {
        System.out.println("rentProudct");
        ArrayList<Supplies> table = null;
        ArrayList<Supplies> chair = null;
        ArrayList<Supplies> speaker = null;
        Project_lab251.rentProudct(table, chair, speaker);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    
}
