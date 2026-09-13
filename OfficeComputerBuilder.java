public class OfficeComputerBuilder
        implements ComputerBuilder {

    private Computer computer = new Computer();

    @Override
    public void setCPU(String cpu) {
        computer.setCPU(cpu);
    }

    @Override
    public void setRAM(String ram) {
        computer.setRAM(ram);
    }

    @Override
    public void setGPU(String gpu) {
        computer.setGPU(gpu);
    }

    @Override
    public void setStorage(String storage) {
        computer.setStorage(storage);
    }

    @Override
    public Computer build() {
        return computer;
    }
}
