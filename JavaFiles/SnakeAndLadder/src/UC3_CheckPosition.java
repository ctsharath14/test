/*The Player then checks for
        an Option. They are No Play,
        Ladder or Snake.
        - Use ((RANDOM)) to check for Options
        - In Case of No Play the player stays in the same
        position
        - In Case of Ladder the player moves ahead by the
        number of position received in the die
        - In Case of Snake the player moves behind by the
        number of position received in the die.*/

public class UC3_CheckPosition {
    public static void main(String[] args) {
        int startPosition = 0;
        int currentPosition = 0;
        System.out.println("<---------------Welcome to Snake and the Ladder game--------------->");
        System.out.println("Player starting position is : "+startPosition);
        int dieRoll = (int)((Math.random() * 6) + 1);
        System.out.println("Die outcome is : "+dieRoll);
        int option = (int)(Math.random() * 3);
        switch (option) {
            case 1: //No Play
                System.out.println("It's a No Play!! Player stays at same position");
                break;
            case 2://Ladder
                currentPosition = startPosition + dieRoll;
                System.out.println("Player moves ahead to position : "+currentPosition);
                break;
            default://Snake
                System.out.println("Snake Bites!!");
                break;
        }
    }
}
