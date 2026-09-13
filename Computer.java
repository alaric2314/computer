public class Computer {

    private String CPU;
    private String RAM;
    private String GPU;
    private String storage;
    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }
    @Override
    public String toString() {
        return "CPU: " + CPU + "\n" +
                "RAM: " + RAM + "\n" +
                "GPU: " + GPU + "\n" +
                "Storage: " + storage;
    }

}