package hfdp.proxy;

import hfdp.state.GumballMachineV2;

public class ProxyTester {
    public static void main(String[] args) {
        GumballMonitor gm = new GumballMonitor(new GumballMachineV2(10, "India"));

        gm.report();
    }
}
