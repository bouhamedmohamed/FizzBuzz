import domain.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    @Test
    public void should_return_empty_string_when_send_empty_string() {

        final FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("",fizzBuzz.calculateThePlay(""));
    }
}