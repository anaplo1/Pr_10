package Zad_2;

import Zad_1.ComplexAbstractFactory;
import Zad_1.ComplexBuildingFactory;
import Zad_1.ConcreteFactory;

public class Main {
    private ChairCreation chairCreation;

    public void buildingFabricChair(){
        AbstractChairFactory abstractChairFactory;

        abstractChairFactory = new ChairFactory();
        chairCreation = new ChairCreation(abstractChairFactory);
    }

    public static void main(String[] args) {
        Main a = new Main();
        a.buildingFabricChair();
    }
}
