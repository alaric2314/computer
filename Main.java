public class Main {
    public static void main(String[] args) {

    ComputerDirector director =
            new ComputerDirector();

    Computer gamingComputer =
            director.constructGamingComputer(
                    new GamingComputerBuilder()
            );

    Computer officeComputer =
            director.constructOfficeComputer(
                    new OfficeComputerBuilder()
            );

    System.out.println("Gaming:");
    System.out.println(gamingComputer);

    System.out.println();

    System.out.println("Office:");
    System.out.println(officeComputer);
}
}
