package unguided;

public class Main {
    public static void main(String[] args) {

        ItemTransaksi.catatLogKasir("Membuka transaksi baru untuk Pelanggan #042.");

        ItemTransaksi[] items = {
            new TiketReguler("Interstellar", 40000, 2, 3),
            new TiketVIP("Dune: Part Two", 60000, 2, 25000),
            new PaketSnack("Combo Popcorn Caramel + 2 Soda", 1, 55000)
        };

        System.out.println("=== DAFTAR TRANSAKSI BIOSKOP ===");
        double totalTransaksi = 0.0;
        for (ItemTransaksi item : items) {
            item.cetakRincianItem();
            totalTransaksi += item.getNominalBayar();
        }

        System.out.println("-------------------------------------------------------------");
        System.out.println("TOTAL TRANSAKSI : Rp" + totalTransaksi);
        System.out.println("=============================================================");
        ItemTransaksi.catatLogKasir("Transaksi #042 selesai diproses.");
    }
}

