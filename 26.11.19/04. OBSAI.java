package MessagingProtocols;

public class OBSAI extends MSG {
    @Override
    public String establishPhysicalLayer()
    {
        return "OBSAIPhysicalLayer";
    }
    @Override
    public String establishDataLinkLayer()
    {
        return "OBSAIDataLinkLayer";
    }
    @Override
    public String establishApplicationLayer()
    {
        return "OBSAIApplicationLayer";
    }
}

