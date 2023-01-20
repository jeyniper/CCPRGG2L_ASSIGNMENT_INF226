public class App {
    public static void main(String[] argsStrings) {

        Weapon sword = new Weapon();

        sword.name = "Gramr";
        sword.damage = 5;
        sword.rarity = "Commomn";
        sword.sayMyName();
        sword.sayMyDamage();
        sword.sayMyRarity();
        sword.attack();
        sword.addDamage(6);
        String showNameandRarity = sword.showNameandRarity();
        System.out.print(showNameandRarity);

        Weapon firearms = new Weapon();

        firearms.name = "Riffle";
        firearms.damage = 10;
        firearms.rarity = "Epic";
        
        Weapon siege = new Weapon();

        siege.name = "Cannon";
        siege.damage = 15;
        siege.rarity = "Legendary";
       
        
        
    }
}
