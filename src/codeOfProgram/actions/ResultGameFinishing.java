package codeOfProgram.actions;

public class ResultGameFinishing implements Result {

    @Override
    public void countResultGame(int countOfPoints) {
        if (countOfPoints < 18) {
            System.out.println("Your score "+countOfPoints+". \u001B[031mYou lose. \u001B[0mDon't afraid to take one more card");

        } else {
            if (countOfPoints == 21) {
                System.out.println("\u001B[036mYou are lucky dude. Super result");
            } else {
                System.out.println("\u001B[032mYou won");
            }
        }
        System.exit(0);
    }
}
