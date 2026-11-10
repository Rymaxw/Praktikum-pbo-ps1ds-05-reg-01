package unguided;

public class HasilEksperimen implements Comparable<HasilEksperimen> {
    private static int jumlahEksperimen = 0;

    private String namaModel;
    private double akurasi;
    private int waktuTraining;

    public HasilEksperimen(String namaModel, double akurasi, int waktuTraining) {
        this.namaModel = namaModel;
        this.akurasi = akurasi;
        this.waktuTraining = waktuTraining;
        jumlahEksperimen++;
    }

    public static int getJumlahEksperimen() {
        return jumlahEksperimen;
    }

    public String getNamaModel() {
        return namaModel;
    }

    public double getAkurasi() {
        return akurasi;
    }

    public int getWaktuTraining() {
        return waktuTraining;
    }

    @Override
    public int compareTo(HasilEksperimen other) {
        return Double.compare(other.akurasi, this.akurasi);
    }

    @Override
    public String toString() {
        return "Model=" + namaModel + ", akurasi=" + akurasi + ", waktu=" + waktuTraining + " detik";
    }
}
