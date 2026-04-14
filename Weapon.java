public class Weapon {

    // Atribut / properties dari Weapon
    String name;   // menyimpan nama senjata
    int damage;    // menyimpan besar damage senjata

    // Method untuk menampilkan informasi senjata ke terminal
    void showWeapon() {
        System.out.println("=== WEAPON INFO ===");
        System.out.println("Nama Senjata : " + name);
        System.out.println("Damage       : " + damage);
    }
}