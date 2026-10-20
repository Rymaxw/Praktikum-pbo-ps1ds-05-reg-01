package unguided;

public class Main {
    public static void main(String[] args) {
        ModelRegresi regresi = new ModelRegresi("Regresi Linier", 500, 4);
        ModelKlasifikasi klasifikasi = new ModelKlasifikasi("Decision Tree", 800, 3);
        ModelDeepLearning deepLearning = new ModelDeepLearning("Neural Network", 1000, 5, 3);

        ModelML[] models = new ModelML[] { regresi, klasifikasi, deepLearning };

        int totalBiaya = 0;
        for (ModelML m : models) {
            m.tampilkanInfo();
            int biaya = m.hitungBiaya();
            System.out.println("Biaya komputasi: " + biaya);
            System.out.println("---");
            totalBiaya += biaya;
        }

        System.out.println("Total biaya: " + totalBiaya);
        System.out.println("Biaya 10 epoch (Neural Network): " + models[2].hitungBiaya(10));
        System.out.println("Biaya 10 epoch (Regresi Linier): " + models[0].hitungBiaya(10));
        System.out.println("Biaya 10 epoch batch 50 (Regresi Linier): " + ((ModelRegresi) models[0]).hitungBiaya(10, 50));
    }
}
