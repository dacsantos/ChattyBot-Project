import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int numberOfParts = scanner.nextInt();
        int readyToShip = 0;
        int toBeFixed = 0;
        int rejects = 0;

        for (int i = 0; i < numberOfParts; i++) {
            int partState = scanner.nextInt();
            if (partState == 0) {
                readyToShip++;
            } else if (partState == 1) {
                toBeFixed++;
            } else if (partState == -1) {
                rejects++;
            }
        }
        System.out.println(readyToShip + " " + toBeFixed + " " + rejects);

    }
}