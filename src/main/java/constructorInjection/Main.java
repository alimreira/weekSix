package constructorInjection;

public class Main {

    public static void main(String[] args) {
        // Creating a Rent object
        Rent rent = new Rent(78348.9f, 12, "House");

        // Injecting Rent into House via constructor
        House house = new House("Abeokuta", "Apartment", 2, rent);

        System.out.println(house);
    }
}
