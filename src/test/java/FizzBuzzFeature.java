import domain.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzFeature {
    @Test

    public void should_return_empty_incase_of_0game() {
        Assert.assertEquals("",new FizzBuzz().calculateTheGameAfter(0));
    }
}
