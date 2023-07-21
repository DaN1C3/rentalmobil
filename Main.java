import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class RentalMobil {
    private List<Mobil> mobilList;
    private Scanner scanner;

    public RentalMobil() {
        mobilList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void tambahMobil(Mobil mobil) {
        mobilList.add(mobil);
    }
    // menambahkan method overloading
     public void tambahMobil(String merk, String warna) {
        Mobil mobil = new Mobil(merk, warna);
        tambahMobil(mobil);
    }

    public void sewaMobil() {
        System.out.println("================= Daftar mobil tersedia =================");
        for (Mobil mobil : mobilList) {
            if (mobil.isTersedia()) {
                System.out.println(mobil);
            }
        }

        System.out.print("Masukkan merk mobil yang ingin disewa: ");
        String merk = scanner.nextLine();

        for (Mobil mobil : mobilList) {
            if (mobil.getMerk().equalsIgnoreCase(merk) && mobil.isTersedia()) {
                mobil.setTersedia(false);
                System.out.println("Anda berhasil menyewa mobil: " + mobil.getMerk());
                return;
            }
        }
        System.out.println("Maaf, mobil tidak tersedia atau merk tidak valid.");
    }

    public void kembalikanMobil() {
        System.out.print("Masukkan merk mobil yang ingin dikembalikan: ");
        String merk = scanner.nextLine();

        for (Mobil mobil : mobilList) {
            if (mobil.getMerk().equalsIgnoreCase(merk) && !mobil.isTersedia()) {
                mobil.setTersedia(true);
                System.out.println("Terima kasih, mobil " + mobil.getMerk() + " telah dikembalikan.");
                return;
            }
        }
        System.out.println("Maaf, mobil tidak ditemukan atau sudah tersedia.");
    }

    public void tampilkanMobilTersedia() {
        System.out.println("================= Daftar mobil tersedia =================");
        for (Mobil mobil : mobilList) {
            if (mobil.isTersedia()) {
                System.out.println(mobil);
            }
        }
    }

    public void menu() {
        int pilihan;
        do {
            System.out.println("============== MENU ==============");
            System.out.println("|| 1. Tambah Mobil              ||");
            System.out.println("|| 2. Sewa Mobil                ||");
            System.out.println("|| 3. Kembalikan Mobil          ||");
            System.out.println("|| 4. Tampilkan Mobil Tersedia  ||");
            System.out.println("|| 5. Keluar                    ||");
            System.out.println("==================================");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan \n di buffer setelah membaca angka

            switch (pilihan) {
                case 1:
                    tambahMobilMenu();
                    break;
                case 2:
                    sewaMobil();
                    break;
                case 3:
                    kembalikanMobil();
                    break;
                case 4:
                    tampilkanMobilTersedia();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan layanan Rental Mobil.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
            System.out.println();
        } while (pilihan != 5);
    }

    private void tambahMobilMenu() {
        System.out.println("========== TAMBAH MOBIL ==========");
        System.out.print("Masukkan merk mobil: ");
        String merk = scanner.nextLine();
        System.out.print("Masukkan warna mobil: ");
        String warna = scanner.nextLine();

        Mobil mobil;
        System.out.print("Apakah mobil premium ? (y/n)");
        String isPremium = scanner.nextLine();

        if (isPremium.equalsIgnoreCase("y")) {
            System.out.print("Masukkan fitur premium: ");
            String premiumFeature = scanner.nextLine();
            mobil = new MobilPremium(merk, warna, premiumFeature);
        } else {
            mobil = new Mobil(merk, warna);
        }
        tambahMobil(mobil);
        System.out.println("Mobil berhasil ditambahkan.");
    }
}

public class Main {
    public static void main(String[] args) {
        RentalMobil rentalMobil = new RentalMobil();

        rentalMobil.tambahMobil(new Mobil("Avanza", "Hitam"));
        rentalMobil.tambahMobil(new Mobil("Innova", "Putih"));
        rentalMobil.tambahMobil(new Mobil("Ertiga", "Silver"));
        rentalMobil.tambahMobil(new Mobil("Pajero", "Silver"));
        // menambahkan satu contoh object MobilPremium
        rentalMobil.tambahMobil(new MobilPremium("BMW X5", "Hitam", "Sunroof dan Interior Kulit"));
        rentalMobil.tambahMobil(new Jeep("Jeep Wrangler", "Hitam"));
        rentalMobil.menu();
    }
}
