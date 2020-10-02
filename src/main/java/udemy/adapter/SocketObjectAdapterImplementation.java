package udemy.adapter;

import javax.naming.ldap.SortKey;

public class SocketObjectAdapterImplementation implements Adapter {

    private Socket socket = new Socket();

    @Override
    public Volt get120Volts() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volts() {
        return new Volt(socket.getVolt().getVolt() / 10.0);
    }

    @Override
    public Volt get240Volts() {
        return new Volt(socket.getVolt().getVolt() / 0.5);
    }
}
