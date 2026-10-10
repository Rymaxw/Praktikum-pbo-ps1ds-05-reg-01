package guided2.main;

import guided2.hargatoken.Hargatoken;
import guided2.hargapulsa.Hargapulsa;

public class Main {
    public static void main(String[] args) {
        Hargatoken objectToken = new Hargatoken();
        objectToken.info();
        Hargapulsa objectPulsa = new Hargapulsa();
        objectPulsa.info();
    }
}
