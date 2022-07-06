import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
        int slot;
        int input;

        while(true) {
            player.showPlayerWeapon();
            input = scanner.nextInt();
            if(input != -1) {
                slot = input - 1;
                player.shotWithWeapon(slot);
            } else {
                break;
            }
        }
        System.out.println("Game over!");
    }
}
