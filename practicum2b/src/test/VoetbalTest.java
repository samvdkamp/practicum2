import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VoetbalTest {
    Voetbalclub c;
    String tempnaam = "";

    @BeforeEach
    public void init() {
        System.out.println("init");
        String tempnaam = "";
        c = new Voetbalclub(tempnaam);
    }


    @Test
    void nullOfLeeg() {
        System.out.println("nullOfLeeg");
        if (tempnaam == null || tempnaam == "") {
            tempnaam = "FC";
        }
    }

    @Test
    void testVerwerk() {
        System.out.println("testVerwerk");
        char i = 'a';
        if (i != 'v' && i != 'g' && i != 'w') {
            c.verwerkResultaat(i);
            assertEquals(0, c.aantalPunten());
            assertEquals(0, c.aantalGespeeld());
        }

    }

    @Test
    void verwerkString() {
        System.out.println("verwerkString");
        char l = 'w';
        char p = 'g';
        char q = 'v';
        c.verwerkResultaat(l);
        if (l == 'w') {
            assertEquals(3, c.aantalPunten());
        }
        c.verwerkResultaat(p);
        if (p == 'g') {
            assertEquals(4, c.aantalPunten());
        }
        c.verwerkResultaat(q);
        if (q == 'v') {
            assertEquals(4, c.aantalPunten());
        }
    }

    @Test
    void testResultaat() {
        System.out.println("testResultaat");
        boolean test;
        test = false;
        for (int o = 0; o < 5; o++) {
            c.verwerkResultaat('g');
            c.verwerkResultaat('w');
            c.verwerkResultaat('v');
        }
        int score = 5 * 3 + 5 * 1;
        assertEquals(c.aantalPunten(), score);
        assertEquals(c.aantalGespeeld(), 5 * 3);
    }


}
