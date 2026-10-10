package guided1.manusia;

public class manusia {
    // Definisi atribut
    private String nama;
    private int umur;

    // Definisi constructor
    public manusia() { // Constructor pertama = default tanpa parameter
    }

    public manusia(String a) { // Constructor kedua
        nama = a;
    }

    public manusia(String a, int b) { // Constructor ketiga
        nama = a;
        umur = b;
    }

    // Definisi method (Getter & Setter)
    public void setNama(String a) {
        nama = a;
    }

    public String getNama() {
        return nama;
    }

    public void setUmur(int a) {
        umur = a;
    }

    public int getUmur() {
        return umur;
    }
}
