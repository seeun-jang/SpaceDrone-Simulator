public class Drone {
    String name;
    int battery;

    Drone(String name, int battery) {
        this.name = name;
        this.battery = battery;
    }

    void explore(Planet planet) {

        // 배터리 확인
        if (battery <= 0) {
            System.out.println("BATTERY EMPTY!");
            return;
        }

        if (battery < 20) {
            System.out.println("LOW BATTERY! Exploration cancelled.");
            return;
        }

        System.out.println("\n[" + planet.name + " Exploration Started]");
        System.out.println("Danger Level: " + planet.dangerLevel);

        battery -= 20;

        if (planet.dangerLevel >= 70) {
            System.out.println("WARNING: High danger level detected!");
            System.out.println(name + " is returning to the base.");
        } else {
            System.out.println("Exploration Successful!");
        }
    }

    void showStatus() {
        System.out.println("Battery: " + battery + "%");

        if (battery == 0) {
            System.out.println("BATTERY EMPTY!");
        } else if (battery <= 20) {
            System.out.println("LOW BATTERY!");
        }
    }
}
