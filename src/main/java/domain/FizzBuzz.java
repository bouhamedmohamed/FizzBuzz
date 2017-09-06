package domain;

public class FizzBuzz {


    public String calculateThePlay(String playToCalculate) {
        try {
            StringBuilder gameResult = new StringBuilder("");
            final int validPlayToCalculate = Integer.parseInt(playToCalculate);
            gameResult.append(isMultipleThree(validPlayToCalculate));
            gameResult.append(isMultipleFive(validPlayToCalculate));
            return sendGameResult(playToCalculate, gameResult.toString());
        } catch (NumberFormatException ex) {
            return playToCalculate;
        }

    }

    private String sendGameResult(String playToCalculate, String gameResult) {
        if (gameResult.isEmpty())
            return playToCalculate;
        else
            return gameResult;
    }

    private String isMultipleFive(int validPlayToCalculate) {
        String gameResult = "";
        if (validPlayToCalculate % 5 == 0) {
            gameResult = "buzz";
        }
        return gameResult;
    }

    private String isMultipleThree(int validPlayToCalculate) {
        String gameResult = "";
        if (validPlayToCalculate % 3 == 0)
            gameResult = "fizz";
        return gameResult;
    }

    public String calculateTheGameAfter(int games) {

        StringBuilder gameResults = new StringBuilder("");
        for (int currentGame = 1; currentGame <= games; currentGame++) {
            gameResults.append(calculateThePlay(String.valueOf(currentGame)) + " ");
        }
        return gameResults.toString();
    }
}
