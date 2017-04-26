package converter;


public abstract class UnitConverter {
    public abstract double toSi(double value);
    public abstract double fromSi(double siValue);
    public abstract String getName();

    @Override
    public String toString() {
        return getName();
    }
}
