package converter;


public class FahrenheitUnitConverter extends UnitConverter {
    @Override
    public double toSi(double value) {
        return (5.0/9.0) * (value - 32) + 273.15;
    }

    @Override
    public double fromSi(double siValue) {
        return (9.0/5.0) * (siValue - 273.15) + 32;
    }

    @Override
    public String getName() {
        return "Fahrenheit";
    }
}
