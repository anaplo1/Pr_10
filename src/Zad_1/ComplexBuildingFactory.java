package Zad_1;

public class ComplexBuildingFactory {
    private final Complex complex;
    private final Complex complex1;

    public ComplexBuildingFactory(ComplexAbstractFactory factory) {
        this.complex = factory.createComplex();
        this.complex1 = factory.createComplex(1,2);
    }
}
