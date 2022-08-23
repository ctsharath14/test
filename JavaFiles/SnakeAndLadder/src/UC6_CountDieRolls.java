/*Report the number of
        times the dice was
        played to win the game
        and also the position
        after every die role*/

public class UC6_CountDieRolls {
    public static void main(String[] args) {
        int startPosition = 0;
        int currentPosition = 0;
        int count = 0;
        System.out.println("<---------------Welcome to Snake and the Ladder game--------------->");
        System.out.println("Player starting position is : "+startPosition);
        while (currentPosition <= 100) {
            System.out.println("<---------------------------------------------------------------------------->");
            int dieRoll = (int)((Math.random() * 6) + 1);
            System.out.println("Die outcome is : "+dieRoll);
            count ++;
            int option = (int)(Math.random() * 3);
            switch (option) {
                case 1: //No Play
                    System.out.println("It's a No Play!! Player stays at same position : "+currentPosition);
                    break;

                case 2://Ladder
                    if ((currentPosition + dieRoll) <= 100) {
                        currentPosition = currentPosition + dieRoll;
                        if (currentPosition == 100) {
                            System.out.println("Hurray!! Player has won the game");
                            System.out.println("Die was rolled "+count+ " times to win the game");
                            return;
                        } else {
                            System.out.println("Player has moved to position : " + currentPosition);
                        }
                    }
                    else {
                        System.out.println("Player position goes above 100, hence the chance is skipped");
                    }
                    break;

                default://Snake
                    if (currentPosition - dieRoll >= 0) {
                        System.out.println("Snake Bites!! Player moves to position : " + currentPosition);
                    } else {
                        System.out.println("Snake Bites!! Players moves back to start position");
                    }
                    break;
            }
        }
    }
}
