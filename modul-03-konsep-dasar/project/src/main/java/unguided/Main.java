package unguided;

public class Main {
    public static void main(String[] args) {
        double[] suhuHarian = { 30.4, 24.3, 26.8, -1.0, 31.4, 30.8, 32.9 };

        PengolahSuhu pengolah = new PengolahSuhu(suhuHarian);

        System.out.println("=== Data Suhu Awal ===");
        pengolah.tampilkanData();

        System.out.println("\nIndex hari kosong (dimulai dari 0): " + pengolah.cariIndexKosong());

        pengolah.isiDataKosong();

        System.out.println("\n=== Data Suhu Setelah Pengisian ===");
        pengolah.tampilkanData();

        double rataRata = Math.round(pengolah.hitungRataRata() * 100.0) / 100.0;
        System.out.println("\nRata-rata : " + rataRata + "°C\n");

        System.out.println("Isi array suhuHarian di main setelah isiDataKosong() dijalankan:");
        System.out.print("[");
        for (int i = 0; i < suhuHarian.length; i++) {
            System.out.print(suhuHarian[i]);
            if (i < suhuHarian.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("(ikut berubah: constructor menyimpan referensi array yang sama)");
    }
}
