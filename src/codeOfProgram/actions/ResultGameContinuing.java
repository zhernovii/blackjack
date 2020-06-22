package codeOfProgram.actions;

public class ResultGameContinuing implements Result {

    @Override
    public void countResultGame(int countOfPoints) {
        if (countOfPoints > 21) {
            System.out.println("Your score " + countOfPoints + ". \u001B[031mYou lose. \u001B[0mBe carefult when you take one more card");
            System.exit(0);

        } else {
            if (countOfPoints == 21) {
                System.out.println("\u001B[036mYou are lucky dude. Super result");
                System.exit(0);
            }
        }
    }
}
