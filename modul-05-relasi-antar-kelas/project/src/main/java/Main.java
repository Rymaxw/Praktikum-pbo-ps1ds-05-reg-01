import guided.agregasi.*;
import guided.komposisi.*;

public class Main {

    public static void main(String[] args) {
        runAgregasi();
        runKomposisi();
    }

    public static void runAgregasi(){
        Mahasiswa m1 = new Mahasiswa("001", "Max");
        Mahasiswa m2 = new Mahasiswa("002", "Min");

        Jurusan prodi = new Jurusan("DS", "Data Science");
        prodi.addMahasiswa(m1);
        prodi.addMahasiswa(m2);
        prodi.displayMahasiswa();
    }

    public static void runKomposisi(){
        Komputer mac = new Komputer("Apple M2", 3200, "Apple Display", "Logitech", "Wireless");
        mac.displaySpecKomputer();

    }


}