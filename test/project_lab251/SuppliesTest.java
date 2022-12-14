/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_lab251;


import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class SuppliesTest {
    
 
    public SuppliesTest() {
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
    @Test
    public void testSetName() {
        System.out.println("setName");
        Supplies item = new Supplies("Round table for 6",100,1,0);
        String expResult = "Round table for 10";
        item.setName("Round table for 10");
        String result=item.getName();
        assertEquals(expResult, result);
       
    }
    @Test
    public void testGetName() {
        System.out.println("getName");
        Supplies item =new Supplies("Round table for 6",100,1,0);;
        String expResult = "Round table for 6";
        String result = item.getName();
        assertEquals(expResult, result);
       
    }

    @Test
    @Ignore
    public void testSetPrice() {
        Supplies item =new Supplies("Round table for 6",100,1,0);
        System.out.println("setPrice");
        int expResult = 330;
        item.setPrice(expResult);
        int result=(int)item.getPrice();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Supplies item = new Supplies("Round table for 6",100,1,2);
        int expResult = 100;
        int result = (int)item.getPrice();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        Supplies item = new Supplies("Round table for 6",100,1,7);
        int expResult=5;
        item.setQuantity(5);
        int result=item.getQuantity();
        assertEquals(expResult, result);
    }

   
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
         Supplies item = new Supplies("Round table for 6",100,40,6);
        int expResult = 40;
        int result = item.getQuantity();
        assertEquals(expResult, result);
      
    }

    @Test
    public void testSetDays() {
        System.out.println("setDays");
        Supplies item = new Supplies("Round table for 6",100,1,8);
        int expResult = 7;
        item.setDays(expResult);
        int result=item.getDays();
         assertEquals(expResult, result);
        
    }

    @Test
    public void testGetDays() {
        System.out.println("getDays");
        Supplies item = new Supplies("Round table for 6",100,1,8);
        int expResult = 8;
        int result = item.getDays();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    
    @Test
    public void testUpdateSupplies() {
        // Rename an item
        Supplies item=new Supplies("Green table",30,0,0);
        item.setName("Black table");
        String expResult = "Black table";
        String result = item.getName();
        assertEquals(expResult, result);
        // Edit Price
        item.setPrice(60);
        int expResult1 = 60;
        int result1 = (int)item.getPrice();
        assertEquals(expResult1, result1);
        //add item
         Supplies item2=new Supplies(null,0,0,0);
        item2.setName("Pink chair");
        item2.setPrice(30);
        String expResult2= "Pink chair 30.0 0 0";
        String result2=item2.toString();
        assertEquals(expResult2, result2);
        
        //change item quantity
        int item_quantity = 0;
        int result1_quantity = item.getQuantity();
        assertEquals(item_quantity, result1_quantity);
    }
    @Test
    public void testRentProudctAmount() {
        // Rename an item
        Supplies item=new Supplies("black chair",30,0,0);
        int quantity = 4;
        int days = 2;
        item.setPrice(60);
        int expResult1 = 480;
        int result1 = (int)(item.getPrice() * quantity) * days ;
        assertEquals(expResult1, result1);
        
    }
}
