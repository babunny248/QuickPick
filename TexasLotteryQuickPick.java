import java.util.Random;

public class TexasLotteryQuickPick {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Your Quick Pick numbers are:");
        for (int i = 0; i < 6; i++) {
            int number = random.nextInt(50) + 1; // Generate random number between 1 and 50
            System.out.print(number + " ");
        }
    }
}