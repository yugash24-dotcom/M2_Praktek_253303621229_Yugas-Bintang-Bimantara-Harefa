public class Main {
    public static void main(String[] args) {

        // Membuat object dari class Weapon
        Weapon pedangSakti = new Weapon();

        // Mengisi nilai atribut object
        pedangSakti.name = "Pedang Excalibur";
        pedangSakti.damage = 150;

        // Memanggil method untuk menampilkan data senjata
        pedangSakti.showWeapon();
    }
}
