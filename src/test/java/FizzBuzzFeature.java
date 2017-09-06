import domain.FizzBuzz;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzFeature {
    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_return_empty_in_case_of_0_game() {

        final String gameResult = fizzBuzz.calculateTheGameAfter(0);
        Assert.assertEquals("", gameResult);
    }

    @Test
    public void should_return_result_in_case_of_15_games() {
        final String gameResult = fizzBuzz.calculateTheGameAfter(15);
        Assert.assertEquals("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz ", gameResult);
    }


}
