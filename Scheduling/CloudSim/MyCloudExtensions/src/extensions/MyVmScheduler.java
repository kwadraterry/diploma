package extensions;

import org.cloudbus.cloudsim.Pe;
import org.cloudbus.cloudsim.Vm;
import org.cloudbus.cloudsim.VmScheduler;

import java.util.List;


public class MyVmScheduler extends VmScheduler {

    public MyVmScheduler(List<? extends Pe> pelist) {
        super(pelist);
    }

    @Override
    public boolean allocatePesForVm(Vm vm, List<Double> mipsShare) {
        return false;
    }

    @Override
    public void deallocatePesForVm(Vm vm) {

    }
}
