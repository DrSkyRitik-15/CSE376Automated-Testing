package makeCa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class goalTest {

    goal go = new goal();
    
    
    @Test
    void Test() {
    	double c=100;
    	int it =20;
    	double ex=(c*it)-(c*it*0.05);
    	assertEquals(ex, go.discount(c, it)); 
    	
    }

    @Test
    void testD0() {
        
        double cost = 100; 
        int it = 100;   
        double ex = (cost * it) - (cost * it * 0.20);  
        assertEquals(ex, go.discount(cost, it));  
    }

    @Test
    void testDFor1() {
       
        double cost = 100; 
        int it = 50;    
        double ex = (cost * it) - (cost * it * 0.10);  
        assertEquals(ex, go.discount(cost, it));
    }

  

    @Test
    void testor2() {
       
        double cost = 100; 
        int item = 5;     
        double ex = cost * item;  
        assertEquals(ex, go.discount(cost, item));
    }

  

    @Test
    void testD() {
        
        double cost = 100;
        int item = 0;     
        double ex = 0.0;  
        assertEquals(ex, go.discount(cost, item));
    }
}
