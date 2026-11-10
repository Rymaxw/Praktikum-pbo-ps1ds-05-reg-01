package unguided;

import java.util.Comparator;

public class WaktuTrainingComparator implements Comparator<HasilEksperimen> {
    @Override
    public int compare(HasilEksperimen h1, HasilEksperimen h2) {
        return Integer.compare(h1.getWaktuTraining(), h2.getWaktuTraining());
    }
}
