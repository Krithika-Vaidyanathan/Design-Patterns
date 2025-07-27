package org.krithika.BuilderPattern;

//Client code
public class BuilderClientService {
    public static void main(String[] args) {
        GamingComputerBuilder gamingComputerBuilder = new GamingComputerBuilder();
        ComputerDirector director = new ComputerDirector();
        director.construct(gamingComputerBuilder);

       Computer gamingComputer = gamingComputerBuilder.getResult();
       gamingComputer.displayInfo();
    }
}
