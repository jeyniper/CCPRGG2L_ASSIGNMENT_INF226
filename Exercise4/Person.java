public class Person {
   int age;
   String name;

   Person(String personName, int personAge ) {
    this.name = personName;
    this.age = personAge;
   }

   void addFriend(Person Friend) {
    System.out.println(this.name + " is friend with " + Friend.name);
   }
   void addClassmate(Person Classmate) {
    System.out.println(this.name + " is bestpwenny with " + Classmate.name);

   } 
}
