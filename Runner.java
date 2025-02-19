import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instantiate first Pet object using default constructor
        Pet pet1 = new Pet();
        System.out.println(pet1);

        // Instantiate second Pet object using custom constructor
        Pet pet2 = new Pet("Buster", "Dog", 11, "Brown", 25.5);
        System.out.println(pet2);

        // Instantiate third Pet object and set the details based on user input
        Pet pet3 = new Pet();
        System.out.print("Enter the name of your pet: ");
        String petName = scanner.nextLine();
        pet3.setName(petName);

        System.out.print("Enter the type of your pet (e.g., Dog, Cat): ");
        String petType = scanner.nextLine();
        pet3.setType(petType);

        System.out.print("Enter the age of your pet: ");
        int petAge = scanner.nextInt();
        pet3.setAge(petAge);

        scanner.nextLine(); // Consume newline

        System.out.print("Enter the color of your pet: ");
        String petColor = scanner.nextLine();
        pet3.setColor(petColor);

        System.out.print("Enter the weight of your pet: ");
        double petWeight = scanner.nextDouble();
        pet3.setWeight(petWeight);

        System.out.println(pet3);

        scanner.close();
    }
}