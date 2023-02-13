package ie.atu.Productv4;

import ie.atu.Productv4.Product;

public class TV extends Product{

        private String manufacture;
        private String screensize;

        public TV() {
            super();
            manufacture = "";
            screensize = "";
        }

            public String getManufacture() { return manufacture; }

            public void setManufacture(String manufacture) { this.manufacture = manufacture; }

            public String getScreensize() {
        return screensize;
    }

            public void setScreensize(String screensize) { this.screensize = screensize; }

        @Override
        public String toString() {
            return super.toString() + "by " + manufacture + screensize;
        }
}
