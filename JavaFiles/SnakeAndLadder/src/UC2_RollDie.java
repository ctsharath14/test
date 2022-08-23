/*The Player rolls the die
        to get a number
        between 1 to 6.
        - Use ((RANDOM)) to get the number between
        1 to 6*/

public class UC2_RollDie {
    public static void main(String[] args) {
        int startPosition = 0;
        System.out.println("<---------------Welcome to Snake and the Ladder game--------------->");
        System.out.println("Player starting position is : "+startPosition);
        int dieRoll = (int)((Math.random() * 6) + 1);
        System.out.println("Die outcome is : "+dieRoll);
    }
}
