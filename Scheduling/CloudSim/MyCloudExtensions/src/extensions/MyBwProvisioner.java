package extensions;

import org.cloudbus.cloudsim.Vm;
import org.cloudbus.cloudsim.provisioners.BwProvisioner;


public class MyBwProvisioner extends BwProvisioner {
    /**
     * Creates the new BwProvisioner.
     *
     * @param bw overall amount of bandwidth available in the host.
     * @pre bw >= 0
     * @post $none
     */
    public MyBwProvisioner(long bw) {
        super(bw);
    }

    @Override
    public boolean allocateBwForVm(Vm vm, long bw) {
        return false;
    }

    @Override
    public long getAllocatedBwForVm(Vm vm) {
        return 0;
    }

    @Override
    public void deallocateBwForVm(Vm vm) {

    }

    @Override
    public boolean isSuitableForVm(Vm vm, long bw) {
        return false;
    }
}
