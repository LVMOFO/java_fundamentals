package labs_examples.objects_classes_methods.labs.methods;
/**
 * Modified by Bo Bender 220524@1430
 */
public class Zoomy {
        public String sMake;
        public String sModel;
        public String sYear;
        public String sColor;
        public String sState;
        public String sLicense;
        public String sMiles;

        @Override
        public String toString() {
            return "Zoomy{" +
                    "sMake='" + sMake + '\'' +
                    ", sModel='" + sModel + '\'' +
                    ", sYear='" + sYear + '\'' +
                    ", sColor='" + sColor + '\'' +
                    ", sState='" + sState + '\'' +
                    ", sLicense='" + sLicense + '\'' +
                    ", sMiles='" + sMiles + '\'' +
                    '}';
        }
}
