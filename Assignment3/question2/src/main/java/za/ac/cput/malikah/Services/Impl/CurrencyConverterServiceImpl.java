package za.ac.cput.malikah.Services.Impl;

import za.ac.cput.malikah.domain.CurrencyConverter;

/**
 * Created by Malikah Osmen on 2016-03-13.
 */

public class CurrencyConverterServiceImpl implements CurrencyConverterService {


    public CurrencyConverter randToDollar() {
        CurrencyConverter currCon = new CurrencyConverter();
        currCon.setCurr(55);
        currCon.setCountry("South Africa");
        currCon.setContinent("Africa");
        return currCon;
    }


    /*public double randToDollar(double rand)
    {
        System.out.println("This method will convert currency from rand to Dollar");
        return rand * 0.066;
    }

    public double randToEuro(double rand)
    {
        System.out.println("This method will convert currency from rand to Euro");
        return rand * 0.059;
    }*/

}

/*public class CoalServiceImpl  implements ElectricityService {
    public ElectricityData getElectricity() {
        ElectricityData electricityData = new ElectricityData();
        electricityData.setFreq(55);
        electricityData.setSource("Coal");
        electricityData.setVoltage(240);
        return electricityData;
    }
}*/