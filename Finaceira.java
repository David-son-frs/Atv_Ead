class Financeira {

    public static double calcularJurosSimples(double capital, double taxa, int tempo) {
        return capital * taxa * tempo;
    }

    public static double converterMoeda(double valor, double taxaCambio) {
        return valor * taxaCambio;
    }
}

public class Main {

    public static void main(String[] args) {

      
        double capital = 1000.0;
        double taxa = 0.05; 
        int tempo = 2; 

        double juros = Financeira.calcularJurosSimples(capital, taxa, tempo);
        System.out.println("Juros simples: R$ " + juros);

     
        double valorEmDolar = 500.0;
        double taxaCambio = 5.10; 

        double valorEmReais = Financeira.converterMoeda(valorEmDolar, taxaCambio);
        System.out.println("Valor em reais: R$ " + valorEmReais);
    }
}
