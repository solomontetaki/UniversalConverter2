package converter;


import asg.cliche.Command;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class UniversalConverter {

    private List<UnitConverter> converters = Arrays.asList(
            new CelsiusUnitConverter(),
            new FahrenheitUnitConverter(),
            new KelvinUnitConverter()
    );
    private UnitConverter sourceConverter;
    private UnitConverter targetConverter;


    @Command
    public void list() {
        for (int i = 0; i < converters.size(); i++){
            System.out.printf("%d - %s\n", i +1, converters.get(i));
        }
    }

    @Command
    public void source(int idx){
        sourceConverter = converters.get(idx - 1);
    }

    @Command
    public void target(int idx){
        targetConverter = converters.get(idx - 1);
    }

    @Command
    public double convert(double v){
        if (sourceConverter == null || targetConverter == null){
            System.out.println("Error! Something is missing!");
            throw new IllegalStateException("source or target converter is not set");
        }
        double siValue = sourceConverter.toSi(v);
        double targetValue = targetConverter.fromSi(siValue);
        return targetValue;
    }
}
