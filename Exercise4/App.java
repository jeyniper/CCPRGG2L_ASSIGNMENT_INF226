public class App {
    public static void main(String[] args) throws Exception {

        Person Me = new Person("jinipr", 22);

        Person Friend = new Person("Liyuh", 27);

        Me.addFriend(Friend);

        Pet Ostrich = new Pet("Ribenszz", 3, Me);
        Ostrich.showOwner();

        Person Classmate = new Person("bIanCakes", 25);

        Person Classmate1 = new Person("lIyUhHh", 25);

        Person Classmate2 = new Person("jE4nn", 25);


        Me.addClassmate(Classmate);
        Me.addClassmate(Classmate1);
        Me.addClassmate(Classmate2);

        Car SportsCar= new Car ("BMW", "Black", Me);
        SportsCar.myCar();

    }
}