package test.ut;

import MessagingProtocols.MSG;
import MessagingProtocols.OBSAI;
import org.junit.Assert;
import org.junit.Test;

public class OBSAITest {
    @Test
    public void establishPhysicalLayer_ShouldReturn_OBSAIPhysicalLayer() {
        MSG msg = new OBSAI();
        Assert.assertEquals("OBSAIPhysicalLayer", msg.establishPhysicalLayer());
    }
    @Test
    public void establishDataLinkLayer_ShouldReturn_OBSAIPhysicalLayer() {
        MSG msg = new OBSAI();
        Assert.assertEquals("OBSAIDataLinkLayer", msg.establishDataLinkLayer());
    }

    @Test
        public void establishApplicationLayer_ShouldReturn_OBSAIPhysicalLayer() {
        MSG msg = new OBSAI();
        Assert.assertEquals("OBSAIApplicationLayer", msg.establishApplicationLayer());
    }

}

