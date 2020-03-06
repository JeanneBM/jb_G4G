package test.mt;

import strategyPattern.ftocSpanishWelcomeTemplateMethod;
import strategyPattern.ftocDeutschWelcomeTemplateMethod;
import strategyPattern.ftocPolishWelcomeTemplateMethod;
import strategyPattern.strategyRunner;
import org.junit.Test;
import strategyPattern.interfejs;

import static org.junit.Assert.assertEquals;

public class strategyPatternTest {
    @Test
    public void ftocDeutschWelcomeTemplateMethod_execute_shouldReturn_AllWelcomes() {
        interfejs mns = new ftocDeutschWelcomeTemplateMethod();
        assertEquals("Guten Tag! " + "Ich heiße Asia. " + "Auf Wiedersehen!", mns.execute());
    }

    @Test
    public void ftocPolishWelcomeTemplateMethod_execute_shouldReturn_AllWelcomes() {
        interfejs mns = new ftocPolishWelcomeTemplateMethod();
        assertEquals("Czesc! " + "Mam na imie Asia. " + "Do zobaczenia!", mns.execute());
    }

    @Test
    public void ftocSpanishWelcomeTemplateMethod_execute_shouldReturn_AllWelcomes() {
        interfejs mns = new ftocSpanishWelcomeTemplateMethod();
        assertEquals("Hola! " + "Mi nombre es Asia. " + "Hasta La Vista!", mns.execute());
    }

}
