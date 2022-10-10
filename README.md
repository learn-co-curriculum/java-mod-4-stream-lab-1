# Stream Lab 1 


## Instruction

### TASK #1:

Edit Task1.java to use Stream methods:

- Create a stream from the `pricePerGallon` array and
  use the `count` method to count the elements.<br>
- Create a stream from the `pricePerGallon` array,
  then call the `max` method to find the maximum value.<br>
- Print the count and maximum price as shown in the sample output.
- Add necessary import statements.

```java
public class Task1 {

    public static void main(String[] args) {
        double[] pricePerGallon = {3.50, 3.25, 4.64, 3.95};

        //Call the stream count method and print the number of values in the array

        //Call the stream max method to get the maximum price
        //Print the highest price per gallon (if a maximum value exists)

    }
}
```


The program should print:

```text
Price count: 4
Highest price per gallon: $4.64
```

### TASK #2:

Edit Task2.java to use Stream methods:

- Create a stream from the list, then call `min` passing an appropriate comparator to find the minimum price.
  - Note that function `min` returns an optional value.
- If a value exists, print the gas station name and price as shown in the sample output.
- Add necessary import statements.


```java
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        List<GasStation> gasStations = List.of(
                new GasStation("SuperSpeedy Gas", 3.79),
                new GasStation("Quickmart Gas", 3.95),
                new GasStation("GasNGo", 3.89));

        //Call the stream min method passing a Comparator to find the lowest price


        //Print the gas station name and lowest price if a value exists

    }
}
```

The program should print:

```text
SuperSpeedy Gas has the lowest price of $3.79
```


### TASK #3:

Edit Task3.java to use Stream methods:

- The program prompts for a price limit.
- Update the program to filter gas stations with a price at or below the limit.
- Use the `forEach` terminal operation to print the elements in the filtered stream.
- Add necessary import statements.

```java
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
```


Test the program by entering a price limit.  For example, if we enter `3.90`,
two gas stations meet the price limit:

```text
What is your price limit per gallon?
3.90
GasStation{name='SuperSpeedy Gas', pricePerGallon=3.79}
GasStation{name='GasNGo', pricePerGallon=3.89}
```

