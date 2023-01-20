public class Weapon {
    String name;
    int damage;
    String rarity;

    public void sayMyName() {
        System.out.println("Weapon name: " + name);
    }
    
    public void sayMyDamage() {
        System.out.println("The weapon damage is: " + damage);
    }

    public void sayMyRarity() {
        System.out.println("The weapon rarity is: " + rarity);
    }
    void attack() {
        System.out.println("I am attacking...");
    }
    void addDamage(int additionalDamage) {
        int newDamage = this.damage + additionalDamage;
        System.out.println("Adding damage.....");
        System.out.println("Damage has increased " + this.damage + " to " + newDamage);
        this.damage = newDamage;
    }
    String showNameandRarity() {
        String showNameandRarity = " Name: " + name + " Rarity: " + rarity;
        return showNameandRarity;
    }
 }

    
