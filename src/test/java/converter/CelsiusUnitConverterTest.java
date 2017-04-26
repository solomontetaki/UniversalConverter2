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
public class CelsiusUnitConverterTest {
    CelsiusUnitConverter converter = new CelsiusUnitConverter();

    @Parameterized.Parameter(0)
    public double srcKelvin;
    @Parameterized.Parameter(1)
    public double trgtCelsius;

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {10.0, -263.1500},
                {100.0, -173.15},
                {150.0, -123.15}
        });
    }

    @Test
    public void toSi() throws Exception {
        assertEquals(srcKelvin, converter.toSi(trgtCelsius), 0.00001);
    }

    @Test
    public void fromSi() throws Exception {
        assertEquals(trgtCelsius, converter.fromSi(srcKelvin), 0.00001);
    }

    @Test
    public void getName() throws Exception {
        assertEquals("Celsius", converter.getName());
    }

}