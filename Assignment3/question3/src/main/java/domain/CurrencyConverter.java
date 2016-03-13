package domain;

/**
 * Created by Malikah Osmen on 2016-03-13.
 */

    /**
     * Created by Malikah Osmen on 2016-03-13.
     */
    public class CurrencyConverter {
        private double curr;
        // private double dollar;
        //private double euro;
        //private double pound;
        private String country;
        private String continent;

        public CurrencyConverter() {
        }

        public CurrencyConverter(double curr, String country, String continent) {
            this.curr = curr;
            this.country = country;
            this.continent = continent;
        }

        public double getCurr() {
            return curr;
        }

        public void setCurr(double curr) {
            this.curr = curr;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getContinent() {
            return continent;
        }

        public void setContinent(String continent) {
            this.continent = continent;
        }

        @Override
        public String toString() {
            return "CurrencyConverter{" +
                    "curr=" + curr +
                    ", country='" + country + '\'' +
                    ", continent='" + continent + '\'' +
                    '}';
        }
    }

