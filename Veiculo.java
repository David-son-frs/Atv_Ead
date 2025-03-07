package Atv_Ead_JavaClassMain.java;

// Classe abstrata Veiculo
abstract class Veiculo {
    protected String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public abstract void acelerar();
}

// Classe que foi criada para Carro(subclass)
class Carro extends Veiculo {

    public Carro(String modelo) {
        super(modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("O carro " + modelo + " está acelerando!");
    }
}

// Classe que foi criada para Moto(sublclass)
class Moto extends Veiculo {

    public Moto(String modelo) {
        super(modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("A moto " + modelo + " está acelerando!");
    }
}

// Classe Main para testar o progama
 class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Civic");
        Moto moto = new Moto("CB 500");

        carro.acelerar();
        moto.acelerar();
    }
}
