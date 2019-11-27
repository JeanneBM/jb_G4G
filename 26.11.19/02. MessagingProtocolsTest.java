package test.mt;

import MessagingProtocols.CPRI;
import MessagingProtocols.MSG;
import MessagingProtocols.OBSAI;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MessagingProtocolsTest {
    @Test
    public void OBSAI_execute_shouldReturn_EstablishedAllLayers() {
        MSG msg = new OBSAI();
        assertEquals("OBSAIPhysicalLayer" + "OBSAIDataLinkLayer" + "OBSAIApplicationLayer", msg.execute());
    }

    @Test
    public void CPRI_execute_shouldReturn_EstablishedAllLayers() {
        MSG msg = new CPRI();
        assertEquals("CPRIPhysicalLayer" + "CPRIDataLinkLayer" + "CPRIApplicationLayer", msg.execute());
    }

    // 0. Doprowadz powyzszy test do stanu powodzenia
    // 1. Zaimplemtuj klasę ECPRI która będzie działąła tak jak OBSAI z tym, że nagłówek wiadomosci ma być równy eCPRI
    // 2. Uzylismy tutaj wzorca projektowego Metoda Szablonowa. Pozostawiajac kod bez zmiany, zrealizuj te same testy, tym razem
    // używając wzorca projektowego Strategia ( po szczegóły zaczerpnij wiedzy w ksiazce "Zwinne Metody..."
    // 3. Zapoznaj się ze wzorcem projektowym Komenda ( w "Zwinne Metody..." znanym jako "Aktywny Obiekt" oraz "Polecenie"
    // doprowadź do momentu w którym otrzymasz wiadomosc
    // "OBSAIPhysicalLayer" + "OBSAIDataLinkLayer" + "OBSAIApplicationLayer" + "CPRIPhysicalLayer" + "CPRIDataLinkLayer" + "CPRIApplicationLayer"

}

