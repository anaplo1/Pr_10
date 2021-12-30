package Zad_2;

public class ChairFactory implements AbstractChairFactory{
    public VictorianChair createVictorianChair(){
        System.out.println("Создаем викторианский стул");
        return new VictorianChair(10);
    }
    public MagicalChair createMagicalChair(){
        System.out.println("Создаем магический стул");
        return new MagicalChair();
    }
    public FunctionalChair createFunctionalChair(){
        System.out.println("Создаем функциональный стул");
        return new FunctionalChair();
    }
}
