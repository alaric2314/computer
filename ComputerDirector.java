public class ComputerDirector {
    public Computer constructGamingComputer(
            ComputerBuilder builder) {

        builder.setCPU("Intel i7");
        builder.setRAM("32GB");
        builder.setGPU("RTX 4070");
        builder.setStorage("2TB SSD");

        return builder.build();
    }

    public Computer constructOfficeComputer(
            ComputerBuilder builder) {

        builder.setCPU("Intel i5");
        builder.setRAM("16GB");
        builder.setGPU("Integrated Graphics");
        builder.setStorage("512GB SSD");

        return builder.build();
    }
}
