public class Car {

    String brand;
    String color;
    int year;
    Person owner;

    Car(String brand, String color, int year, Person ownerName) {
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.owner = ownerName;
    }
    
    void myCar () {
        System.out.println("My name is " this.ownerName + " my car is " this.brand + " my color is " + this.color " the cars is " this.year + " old " );
    }
}