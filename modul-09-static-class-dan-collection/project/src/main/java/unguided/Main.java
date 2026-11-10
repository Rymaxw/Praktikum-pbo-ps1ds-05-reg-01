package unguided;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<HasilEksperimen> daftar = new ArrayList<>();
        daftar.add(new HasilEksperimen("Logistic Regression", 0.82, 12));
        daftar.add(new HasilEksperimen("Random Forest", 0.91, 45));
        daftar.add(new HasilEksperimen("SVM", 0.87, 60));
        daftar.add(new HasilEksperimen("KNN", 0.79, 5));
        daftar.add(new HasilEksperimen("Decision Tree", 0.84, 8));

        System.out.println("Jumlah eksperimen: " + HasilEksperimen.getJumlahEksperimen());

        Collections.sort(daftar);
        System.out.println("\nSorted by akurasi");
        daftar.forEach(System.out::println);

        Collections.sort(daftar, new WaktuTrainingComparator());
        System.out.println("\nSorted by waktu training");
        daftar.forEach(System.out::println);

        List<HasilEksperimen> akurasiTinggi = daftar.stream()
                .filter(h -> h.getAkurasi() >= 0.85)
                .collect(Collectors.toList());
        System.out.println("\nModel dengan akurasi minimal 0.85");
        akurasiTinggi.forEach(System.out::println);

        HasilEksperimen hasilCari = daftar.stream()
                .filter(h -> h.getNamaModel().equals("KNN"))
                .findFirst()
                .orElse(null);
        System.out.println("\nPencarian model KNN");
        System.out.println(hasilCari);
    }
}
