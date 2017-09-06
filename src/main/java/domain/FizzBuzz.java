package domain;

public class FizzBuzz {


    public String calculateThePlay(String playToCalculate) {
        try {
            final int validPlayTocalculate = Integer.parseInt(playToCalculate);
            if (validPlayTocalculate % 15 == 0)
                return "fizzBuzz";
            else if (validPlayTocalculate % 3 == 0)
                return "fizz";
            else if (validPlayTocalculate % 5 == 0)
                return "buzz";
        } catch (NumberFormatException ex) {
        }
        return playToCalculate;
    }

    public String calculateTheGameAfter(int games) {

        StringBuilder gameResults = new StringBuilder("");
        for (int currentGame = 1; currentGame <= games; currentGame++) {
            gameResults.append(calculateThePlay(String.valueOf(currentGame)) + " ");
        }
        return gameResults.toString();
    }
}
