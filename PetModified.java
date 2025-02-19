import java.util.Scanner;

public class Pet {
    // Private data
    private String name;
    private String type;
    private int age;
    private String color; // New data field
    private double weight; // New data field

    // Default constructor
    public Pet() {
        this.name = "Unknown";
        this.type = "Unknown";
        this.age = 0;
        this.color = "Unknown"; // Initialize new data field
        this.weight = 0.0; // Initialize new data field
    }

    // Custom constructor
    public Pet(String name, String type, int age, String color, double weight) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.color = color;
        this.weight = weight;
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

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    // Custom method to let pets "speak"
    public String speak() {
        if (type.equalsIgnoreCase("dog")) {
            return "Woof";
        } else if (type.equalsIgnoreCase("cat")) {
            return "Meow";
        } else {
            return "Some noise";
        }
    }

    // toString method
    @Override
    public String toString() {
        return "Pet information:\nName: " + name + "\nType: " + type + "\nAge: " + age + "\nColor: " + color + "\nWeight: " + weight + "\nSound: " + speak();
    }

    // Main method
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