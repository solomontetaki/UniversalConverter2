package converter;


public class KelvinUnitConverter extends UnitConverter {
    @Override
    public double toSi(double value) {
        return value;
    }

    @Override
    public double fromSi(double siValue) {
        return siValue;
    }

    @Override
    public String getName() {
        return "Kelvin";
    }

}