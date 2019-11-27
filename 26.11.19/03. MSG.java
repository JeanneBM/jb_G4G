package MessagingProtocols;

public abstract class MSG {
    public abstract String establishPhysicalLayer();

    public abstract String establishDataLinkLayer();

    public abstract String establishApplicationLayer();

    public final String execute() {
        return establishPhysicalLayer()
                + establishDataLinkLayer()
                + establishApplicationLayer();
    }
}

