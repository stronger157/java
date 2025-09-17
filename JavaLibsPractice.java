import java.util.Scanner;

public class JavaLibsPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Taking Inputs ---
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your favorite city: ");
        String city = sc.nextLine();

        System.out.print("Enter your favorite food: ");
        String food = sc.nextLine();

        System.out.print("Enter your favorite color: ");
        String color = sc.nextLine();

        System.out.print("Enter a number of friends you have: ");
        int friends = sc.nextInt();

        System.out.print("Enter how many hours you sleep per day: ");
        double sleepHours = sc.nextDouble();

        System.out.print("Enter a random number: ");
        int randomNumber = sc.nextInt();

        System.out.print("Enter the number of pets you own: ");
        int pets = sc.nextInt();

        System.out.print("Enter the price of your favorite snack: ");
        double snackPrice = sc.nextDouble();

        System.out.print("Enter a year you like: ");
        int year = sc.nextInt();

        // --- Doing Math ---
        int totalCompanions = friends + pets;
        double yearlySleep = sleepHours * 365;
        double totalSnackCost = snackPrice * randomNumber;

        // --- Printing the Story ---
        System.out.println("\n--- Your Funny JavaLibs Story ---\n");
        System.out.println("Once upon a time, " + name + " decided to visit " + city + ".");
        System.out.println("They wore a " + color + " outfit and carried " + pets + " pets along.");
        System.out.println("With " + friends + " friends joining, the group had " + totalCompanions + " companions in total!");
        System.out.println(name + " loved eating " + food + " so much that they spent " + totalSnackCost + " dollars");
        System.out.println("just on snacks before reaching " + city + "!");
        System.out.println("In the year " + year + ", " + name + " promised to sleep for " + yearlySleep + " hours total.");
        System.out.println("It was a fun and memorable journey. The end!");
        
        sc.close();
    }
}
