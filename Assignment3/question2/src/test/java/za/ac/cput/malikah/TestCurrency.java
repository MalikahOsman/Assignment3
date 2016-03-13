package za.ac.cput.malikah;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.malikah.Services.Impl.CurrencyConverterService;
import za.ac.cput.malikah.domain.CurrencyConverter;

/**
 * Created by Malikah Osmen on 2016-03-13.
 */
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
