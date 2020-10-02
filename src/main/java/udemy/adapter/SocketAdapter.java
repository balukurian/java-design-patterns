package udemy.adapter;

public class SocketAdapter extends Socket implements Adapter{

    @Override
    public Volt get120Volts() {
        return getVolt();
    }

    @Override
    public Volt get12Volts() {
        return convertVolt(getVolt(), 10);
    }

    @Override
    public Volt get240Volts() {
        return convertVolt(getVolt(), 0.5);
    }

    private Volt convertVolt(Volt v, double i) {
        return new Volt(v.getVolt() / i);
    }

}
