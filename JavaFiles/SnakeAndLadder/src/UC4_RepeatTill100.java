/*Repeat till the Player
        reaches the winning
        position 100.
        - Note In case the player position moves
        below 0, then the player restarts from 0*/

public class UC4_RepeatTill100 {
    public static void main(String[] args) {
        int startPosition = 0;
        int currentPosition = 0;
        System.out.println("<---------------Welcome to Snake and the Ladder game--------------->");
        System.out.println("Player starting position is : "+startPosition);
        while (currentPosition <= 100) {
            System.out.println("<---------------------------------------------------------------------------->");
            int dieRoll = (int)((Math.random() * 6) + 1);
            System.out.println("Die outcome is : "+dieRoll);
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
