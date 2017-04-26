package converter;


public class CelsiusUnitConverter extends UnitConverter{
    @Override
    public double toSi(double value) {
        return value + 273.15;
    }

    @Override
    public double fromSi(double siValue) {
        return siValue  - 273.15;
    }

    @Override
    public String getName() {
        return "Celsius";
    }
   }
