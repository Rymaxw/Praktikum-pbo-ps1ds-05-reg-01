package guided1.main;

import guided1.manusia.manusia;

public class main {
    public static void main(String[] args) {
        // Buat array of Object
        manusia arrMns[] = new manusia[3];

        // Constructor pertama (default) + setter
        manusia objMns1 = new manusia();
        objMns1.setNama("Markonah");
        objMns1.setUmur(76);

        // Constructor kedua (1 parameter nama)
        manusia objMns2 = new manusia("Mat Conan");

        // Constructor ketiga (2 parameter nama & umur)
        manusia objMns3 = new manusia("Bajuri", 13);

        arrMns[0] = objMns1;
        arrMns[1] = objMns2;
        arrMns[2] = objMns3;

        for (int i = 0; i < 3; i++) {
            System.out.println("Nama : " + arrMns[i].getNama());
            System.out.println("Umur : " + arrMns[i].getUmur());
            System.out.println();
        }
    }
}
