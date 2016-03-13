package za.ac.cput.malikah;

import Services.Impl.CurrencyConverterService;
import domain.CurrencyConverter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestCurrency {
        private CurrencyConverterService service;
        CurrencyConverter currency;
        @Before
        public void setUp() throws Exception {

            currency = service.randToDollar();
        }

        @Test
        public void testCurrency() throws Exception {

            //CurrencyConverter convert = service.randToDollar();
            System.out.println(" The Currency is "+service.randToDollar());
            Assert.assertEquals(55, currency.getCurr());


        }
}


