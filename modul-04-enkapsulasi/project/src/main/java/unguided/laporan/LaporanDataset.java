package unguided.laporan;

import unguided.model.Dataset;
import java.util.Locale;

public class LaporanDataset {
    public void cetak(unguided.model.Dataset dataset){
        String status = dataset.perluDibersihkan() ? "Perlu dibersihkan" : "Bersih";
        String persentaseStr = String.format(Locale.US, "%.2f%%", dataset.getPersentaseMissing());

        System.out.println("=== Laporan Dataset ===");
        System.out.println("Nama         : " + dataset.getNama());
        System.out.println("Jumlah Baris : " + dataset.getJumlahBaris());
        System.out.println("Jumlah Kolom : " + dataset.getJumlahKolom());
        System.out.println("Missing      : " + dataset.getJumlahMissing() + " sel (" + persentaseStr + ")");
        System.out.println("Status       : " + status);
    }
}
