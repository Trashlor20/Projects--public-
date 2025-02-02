import java.util.Scanner;

public class Pet {
    // Private data
    private String name;
    private String type;
    private int age;

    // Default constructor
    public Pet() {
        this.name = "Unknown";
        this.type = "Unknown";
        this.age = 0;
    }

    // Mutator (set) methods
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Accessor (get) methods
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    // toString method
    @Override
    public String toString() {
        return "Pet information:\nName: " + name + "\nType: " + type + "\nAge: " + age;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instantiate first Pet object using default constructor
        Pet pet1 = new Pet();
        System.out.println(pet1);

        // Instantiate second Pet object and set the details based on user input
        Pet pet2 = new Pet();
        System.out.print("Enter the name of your pet: ");
        String petName = scanner.nextLine();
        pet2.setName(petName);

        System.out.print("Enter the type of your pet (e.g., Dog, Cat): ");
        String petType = scanner.nextLine();
        pet2.setType(petType);

        System.out.print("Enter the age of your pet: ");
        int petAge = scanner.nextInt();
        pet2.setAge(petAge);

        System.out.println(pet2);

        scanner.close();
    }
}