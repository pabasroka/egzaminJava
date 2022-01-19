// Zad4B1

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

class Plytoteka implements Comparable {
    private String tytul;

    public Plytoteka(String tytul) {
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
        return compareIgnoreCase(this.tytul, ((Plytoteka) o).tytul);
    }
}

public class Zad4B1 {
    public static void main(String[] args){
        Plytoteka[] plytotekas = new Plytoteka[6];
        plytotekas[0] = new Plytoteka("Zając");
        plytotekas[1] = new Plytoteka("Żubr");
        plytotekas[2] = new Plytoteka("evolve");
        plytotekas[3] = new Plytoteka("żyrafa");
        plytotekas[4] = new Plytoteka("origins");
        plytotekas[5] = new Plytoteka("mercury no1");

        Arrays.sort(plytotekas);

        for (Plytoteka m : plytotekas) {
            System.out.println(m.getTytul());
        }
    }
}