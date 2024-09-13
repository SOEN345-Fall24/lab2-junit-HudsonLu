import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTest {

    @Test
    public void testFunctionAPositive() {
        Example example = new Example(4, -8);
        assertEquals("Calc sum incorrect", 6, example.Function_A(2));
    }

    @Test
    public void testFunctionANegative() {
        Example example = new Example(4, -8);
        assertEquals("Calc sum incorrect", -5, example.Function_A(-1));
    }

    @Test
    public void testFunctionBLessThanSix() {
        Example example = new Example(4, -8);
        assertEquals("Calc sum incorrect", -5, example.Function_B(3));
    }

    @Test
    public void testFunctionBMoreThanSix() {
        Example example = new Example(4, -8);
        assertEquals("Calc sum incorrect", 15, example.Function_B(7));
    }

}

