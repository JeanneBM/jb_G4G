package test.mt;

import MessagingTemplateMethods.SpanishWelcomeTemplateMethod;
import MessagingTemplateMethods.AbstractMessagingTemplateMethod;
import MessagingTemplateMethods.DeutschWelcomeTemplateMethod;
import MessagingTemplateMethods.PolishWelcomeTemplateMethod;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

    public class MessagingTemplateMethodTests {
        @Test
        public void DeutschWelcomeTemplateMethod_execute_shouldReturn_AllWelcomes() {
            AbstractMessagingTemplateMethod msg = new DeutschWelcomeTemplateMethod();
            assertEquals("Guten Tag! " + "Ich heiße Asia. " + "Auf Wiedersehen!", msg.execute());
        }

        @Test
        public void PolishWelcomeTemplateMethod_execute_shouldReturn_AllWelcomes() {
            AbstractMessagingTemplateMethod msg = new PolishWelcomeTemplateMethod();
            assertEquals("Czesc! " + "Mam na imie Asia. " + "Do zobaczenia!", msg.execute());
        }

        @Test
        public void SpanishWelcomeTemplateMethod_execute_shouldReturn_AllWelcomes() {
            AbstractMessagingTemplateMethod msg = new SpanishWelcomeTemplateMethod();
            assertEquals("Hola! " + "Mi nombre es Asia. " + "Hasta La Vista!", msg.execute());
        }

        // 0. Doprowadz powyzszy test do stanu powodzenia
        // 1. Zaimplemtuj klasę ECPRI która będzie działąła tak jak OBSAI z tym, że nagłówek wiadomosci ma być równy eCPRI
        // 2. Uzylismy tutaj wzorca projektowego Metoda Szablonowa. Pozostawiajac kod bez zmiany, zrealizuj te same testy, tym razem
        // używając wzorca projektowego Strategia ( po szczegóły zaczerpnij wiedzy w ksiazce "Zwinne Metody..."
        // "OBSAIPhysicalLayer" + "OBSAIDataLinkLayer" + "OBSAIApplicationLayer" + "CPRIPhysicalLayer" + "CPRIDataLinkLayer" + "CPRIApplicationLayer"
    }

