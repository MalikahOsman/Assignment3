package Services.Impl;

import domain.CurrencyConverter;

/**
 * Created by Malikah Osmen on 2016-03-13.
 */
public class DollarConveter {
    public CurrencyConverter randToDollar() {
        CurrencyConverter currCon = new CurrencyConverter();
        currCon.setCurr(55);
        currCon.setCountry("South Africa");
        currCon.setContinent("Africa");
        return currCon;
    }

}
