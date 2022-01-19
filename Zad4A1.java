// Zad4A1

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

class Muzyka implements Comparable {
    private String tytul;

    public Muzyka(String tytul) {
        this.tytul = tytul;
    }

    public String getTytul() {
        return tytul;
    }

    private int compareIgnoreCase(String a1, String a2) {
        Locale locale = new Locale("pl", "PL");
        Collator col = Collator.getInstance(locale);
        col.setStrength(Collator.PRIMARY);
        return col.compare(a1.toUpperCase(locale), a2.toUpperCase(locale));
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) { return 0; }
        if (this.getClass() != o.getClass()) { return 1; }
        return compareIgnoreCase(this.tytul, ((Muzyka) o).tytul);
    }
}

public class Zad4A1 {
    public static void main(String[] args){
        ArrayList<Muzyka> muzykas = new ArrayList<>();
        muzykas.add(new Muzyka("Zając"));
        muzykas.add(new Muzyka("Żubr"));
        muzykas.add(new Muzyka("evolve"));
        muzykas.add(new Muzyka("żyrafa"));
        muzykas.add(new Muzyka("origins"));
        

        Collections.sort(muzykas);

        for (Muzyka m : muzykas) {
            System.out.println(m.getTytul());
        }
    }
}
