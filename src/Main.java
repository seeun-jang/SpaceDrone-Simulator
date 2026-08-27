import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter battery level (0-100): ");
        int battery = scanner.nextInt();

        Drone drone = new Drone("DODO-01", battery);

        Planet mars = new Planet("MARS-04", 30);
        Planet unknown = new Planet("X-928", 85);

        System.out.println("\nSPACE EXPLORATION DRONE LAUNCHED!");
        System.out.println("Drone Name: " + drone.name);
        drone.showStatus();

        drone.explore(mars);
        drone.showStatus();

        drone.explore(unknown);
        drone.showStatus();

        scanner.close();
    }
}
