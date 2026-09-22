package guided;

public class Modul02 {
    public static void main(String[] args) {
       // cara 1
        int [] varArray1 ;
        varArray1 = new int[5];
        varArray1[0] = 18;
        varArray1[1] = 20;
        varArray1[2] = 22;
        varArray1[3] = 24;
        varArray1[4] = 26;

        // cara 2
        int [] varArray2 = new int[5];
        
        // cara 3
        int [] varArray3 = {1,2,3,4,5};

        System.out.println(varArray3[3]);


        // Array 2 Dimensi
        // 10 20
        // 30 40
        int [][] arr2d = new int[2] [2];
        arr2d[0] [0] = 10;
        arr2d[0] [1] = 20;
        arr2d[1] [0] = 30;
        arr2d[1] [1] = 40;

        
    }
} 

