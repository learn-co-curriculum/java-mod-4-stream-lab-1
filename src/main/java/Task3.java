import java.util.List;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        List<GasStation> gasStations = List.of(
                new GasStation("SuperSpeedy Gas", 3.79),
                new GasStation("Quickmart Gas", 3.95),
                new GasStation("GasNGo", 3.89));

        //Prompt the user to enter a price limit
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your price limit per gallon?");
        double limit = scanner.nextDouble();

        //Filter and print gas stations with price per gallon <= limit

    }
}
