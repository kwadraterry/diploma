package extensions;

import org.cloudbus.cloudsim.Vm;
import org.cloudbus.cloudsim.provisioners.PeProvisioner;

import java.util.List;

public class MyPeProvisioner extends PeProvisioner{
    /**
     * Creates the new PeProvisioner.
     *
     * @param mips overall amount of MIPS available in the Pe
     * @pre mips>=0
     * @post $none
     */
    public MyPeProvisioner(double mips) {
        super(mips);
    }

    @Override
    public boolean allocateMipsForVm(Vm vm, double mips) {
        return false;
    }

    @Override
    public boolean allocateMipsForVm(String vmUid, double mips) {
        return false;
    }

    @Override
    public boolean allocateMipsForVm(Vm vm, List<Double> mips) {
        return false;
    }

    @Override
    public List<Double> getAllocatedMipsForVm(Vm vm) {
        return null;
    }

    @Override
    public double getTotalAllocatedMipsForVm(Vm vm) {
        return 0;
    }

    @Override
    public double getAllocatedMipsForVmByVirtualPeId(Vm vm, int peId) {
        return 0;
    }

    @Override
    public void deallocateMipsForVm(Vm vm) {

    }
}
