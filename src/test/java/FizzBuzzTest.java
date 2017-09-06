import domain.FizzBuzz;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_return_empty_string_when_send_empty_string() {
        assertEquals("", fizzBuzz.calculateThePlay(""));
    }

    @Test
    public void should_return_1_when_send_1() {
        assertEquals("1", fizzBuzz.calculateThePlay("1"));
    }

    @Test
    public void should_return_fizz_when_send_3() {
        assertEquals("fizz", fizzBuzz.calculateThePlay("3"));
    }

    @Test
    public void should_return_buzz_when_send_5() {
        assertEquals("buzz", fizzBuzz.calculateThePlay("5"));
    }

    @Test
    public void should_return_fizzBuzz_when_send_15() {
        assertEquals("fizzbuzz", fizzBuzz.calculateThePlay("15"));
    }
}