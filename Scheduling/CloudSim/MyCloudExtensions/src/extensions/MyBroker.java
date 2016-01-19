package extensions;

import cloudreports.extensions.brokers.Broker;

import java.util.List;


public class MyBroker extends Broker {
    public MyBroker(String name) throws Exception {
        super(name);
    }

    @Override
    public int getDatacenterId() {
        return 0;
    }

    @Override
    public List<Integer> getDatacenterIdList() {
        return null;
    }
}
