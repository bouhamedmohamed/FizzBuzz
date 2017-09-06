package domain;

public class FizzBuzz {
    public String calculateThePlay(String playToCalculate) {
        try {
            if (Integer.parseInt(playToCalculate) % 3 == 0)
                return "fizz";
        } catch (NumberFormatException ex) {
        }
        return playToCalculate;
    }
}
