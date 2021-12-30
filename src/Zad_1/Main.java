package Zad_1;

public class Main {
    private ComplexBuildingFactory complexBuildingFactory;

    public void PrintComplexResult(){
        ComplexAbstractFactory complexAbstractFactory;
        complexAbstractFactory = new ConcreteFactory();
        complexBuildingFactory = new ComplexBuildingFactory(complexAbstractFactory);
    }

    public static void main(String[] args) {
        Main a = new Main();
        a.PrintComplexResult();
    }
}
