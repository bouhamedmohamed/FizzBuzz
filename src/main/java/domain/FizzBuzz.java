package domain;

public class FizzBuzz {
    public String calculateThePlay(String playToCalculate) {
        try {
            final int validPlayTocalculate = Integer.parseInt(playToCalculate);
            if (validPlayTocalculate % 3 == 0)
                return "fizz";
            else
            if (validPlayTocalculate % 5 == 0)
                return "buzz";
        } catch (NumberFormatException ex) {
        }
        return playToCalculate;
    }
}
