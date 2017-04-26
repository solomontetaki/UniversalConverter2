package converter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by JavaCourses on 26.04.2017..
 */
@RunWith(Parameterized.class)
public class FahrenheitUnitConverterTest {
    FahrenheitUnitConverter converter = new FahrenheitUnitConverter();

    @Parameterized.Parameter(0)
    public double srcKelvin;
    @Parameterized.Parameter(1)
    public double trgtFahrenheit;

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {10.0, -441.67},
                {100.0, -279.67},
                {150.0, -189.67}
        });
    }


    @Test
    public void toSi() throws Exception {
        assertEquals(srcKelvin, converter.toSi(trgtFahrenheit), 0.00001);
    }

    @Test
    public void fromSi() throws Exception {
        assertEquals(trgtFahrenheit, converter.fromSi(srcKelvin), 0.00001);
    }

    @Test
    public void getName() throws Exception {
        assertEquals("Fahrenheit", converter.getName());
    }

}