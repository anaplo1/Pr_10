package Zad_2;

public class ChairCreation {
    private final FunctionalChair functionalChair;
    private final VictorianChair victorianChair;
    private final MagicalChair magicalChair;
    public ChairCreation(AbstractChairFactory abstractChairFactory){
        functionalChair = abstractChairFactory.createFunctionalChair();
        System.out.println("Sum: "+functionalChair.sum(1,2));
        victorianChair = abstractChairFactory.createVictorianChair();
        System.out.println("Возраст стула "+victorianChair.getAge());
        magicalChair = abstractChairFactory.createMagicalChair();
        magicalChair.doMagic();
    }
}
