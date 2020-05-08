package cst8284.junit.lab4.test;

import cst8284.junit.lab4.Currency;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;

public class CurrencyTest {

    private static final String MONEY_CODE = "USD";
    private static final String DIFFERENT_MONEY_CODE = "CAD";
    private Currency currency;

    @Before
    public void initCurrency() throws Exception {
        currency = new Currency(MONEY_CODE);      
    }
    
    @Test
    public void testGetAbbreviation_True() {
           
        String result = currency.getAbbreviation();

        assertEquals(MONEY_CODE, result);
    }

 
    @Test
    public void testGetAbbreviation_False() {
        String result = currency.getAbbreviation();

        assertFalse(DIFFERENT_MONEY_CODE.equals(result));
    }
    
    @Test
    public void testEquals_WhenEquals() throws Exception {
        Currency secondCurrency = new Currency(MONEY_CODE);
        boolean test;
        test = currency.equals(secondCurrency);
        assertTrue(test);

        
        
    }

    @Test
    public void testEquals_WhenNotEquals() throws Exception {
        Currency secondCurrency = new Currency(DIFFERENT_MONEY_CODE);
        boolean test;
        test = currency.equals(secondCurrency);

        assertFalse(test);
        
    }

    @Test
    public void testHashCode_True() throws Exception {
        Currency secondCurrency = new Currency(MONEY_CODE);

        int firstHash = currency.hashCode();
        int secondHash = secondCurrency.hashCode();

        assertEquals(firstHash, secondHash);
    }
    
    @Test
    public void testHashCode_False() throws Exception {
    	Currency secondCurrency = new Currency(DIFFERENT_MONEY_CODE);
    	
    	int firstHash = currency.hashCode();
    	int secondHash = secondCurrency.hashCode();
    	
    	assertFalse(firstHash==secondHash);
       
    	
    }
  
    
}

