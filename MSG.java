public abstract class MSG {
    abstract void establishPhysicalLayer();

    abstract void establishDataLinkLayer();

    abstract void establishApplicationLayer();

    public final void print() {
        establishPhysicalLayer();
        establishDataLinkLayer();
        establishApplicationLayer();
    }
}
