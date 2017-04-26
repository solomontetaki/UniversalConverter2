package converter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class KelvinUnitConverterTest {
    KelvinUnitConverter converter = new KelvinUnitConverter();

    @Parameterized.Parameter(0)
    public double srcKelvin;
    @Parameterized.Parameter(1)
    public double trgtKelvin;

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {10.0, 10.0},
                {100.0, 100.0},
                {150.0, 150.0}
        });
    }

    @Test
    public void toSi() throws Exception {
        assertEquals(trgtKelvin, converter.toSi(srcKelvin), 0.00001);
    }

    @Test
    public void fromSi() throws Exception {
        assertEquals(srcKelvin, converter.fromSi(trgtKelvin), 0.00001);
    }

    @Test
    public void getName() throws Exception {
        assertEquals("Kelvin", converter.getName());
    }

}