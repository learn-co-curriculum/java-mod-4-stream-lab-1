
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        List<GasStation> gasStations = List.of(
                new GasStation("SuperSpeedy Gas", 3.79),
                new GasStation("Quickmart Gas", 3.95),
                new GasStation("GasNGo", 3.89));

        //Call the stream min method passing a Comparator to find the lowest price


        //Print the lowest price if a value exists

    }
}