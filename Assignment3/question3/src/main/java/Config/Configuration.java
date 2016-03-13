package Config;

import Services.Impl.DollarConveter;
import Services.Impl.EuroConveter;
import domain.CurrencyConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Malikah Osmen on 2016-03-13.
 */
@Configuration
public class Configuration {

@Bean(name="")
    public CurrencyConverter randToDollar(){
    return new DollarConveter();
}
    @Bean(name="")
    public CurrencyConverter randToDollar(){
        return new DollarConveter();
    }
}
