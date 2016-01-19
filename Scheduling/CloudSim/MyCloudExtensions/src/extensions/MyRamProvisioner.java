package extensions;

import org.cloudbus.cloudsim.Vm;
import org.cloudbus.cloudsim.provisioners.RamProvisioner;


public class MyRamProvisioner extends RamProvisioner {
    /**
     * Creates the new RamProvisioner.
     *
     * @param ram the ram
     * @pre ram>=0
     * @post $none
     */
    public MyRamProvisioner(int ram) {
        super(ram);
    }

    @Override
    public boolean allocateRamForVm(Vm vm, int ram) {
        return false;
    }

    @Override
    public int getAllocatedRamForVm(Vm vm) {
        return 0;
    }

    @Override
    public void deallocateRamForVm(Vm vm) {

    }

    @Override
    public boolean isSuitableForVm(Vm vm, int ram) {
        return false;
    }
}
