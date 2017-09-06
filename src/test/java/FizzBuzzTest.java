import domain.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_empty_string_when_send_empty_string() {

        final FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("", fizzBuzz.calculateThePlay(""));
    }

    @Test
    public void should_return_1_when_send_1() {

        final FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.calculateThePlay("1"));
    }

    @Test
    public void should_return_fizz_when_send_3() {

        final FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("fizz", fizzBuzz.calculateThePlay("3"));
    }

    @Test
    public void should_return_buzz_when_send_5() {

        final FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("buzz", fizzBuzz.calculateThePlay("5"));
    }

    @Test
    public void should_return_fizzBuzz_when_send_15() {

        final FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("fizzbuzz", fizzBuzz.calculateThePlay("15"));
    }
}