package Zad_1;

public class ConcreteFactory implements ComplexAbstractFactory{
    public Complex createComplex(){
        System.out.println("Созданно комплексное число!: 0 + i0");
        return new ComplexCreate();
    }
    public Complex createComplex(int real, int image){
        System.out.println("Созданно комплексное число!: "+ real +" + i"+image);
        return new ComplexCreate();
    }
}
