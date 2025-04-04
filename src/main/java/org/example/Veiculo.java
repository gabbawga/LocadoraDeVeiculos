package org.example;

public class Veiculo {
    private String modelo;
    private double valorDiaria;

    public Veiculo(String modelo, double valorDiaria){
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;

    }

    // Getters
    public String getModelo() {
        return modelo;
    }

    public double getValorDiaria(){
        return valorDiaria;
    }

    // Setter
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria =  valorDiaria;
    }


    public double calcularCusto(int dias){
        double custoAluguel = (dias * valorDiaria);

        if(dias >= 7){
            custoAluguel -= desconto(dias);
            return custoAluguel;
        }

        return custoAluguel;
    }

    public double desconto(int dias){
        if(dias >= 7){
            double valorDesconto = (valorDiaria * dias) * 0.10;
            return valorDesconto;
        }
        return 0;
    }

    //Metodo de calcular multa fixa de 50R$
    public  double calcularMulta(int diasAtrasados){
        if(diasAtrasados <= 0 ) return 0;
        return diasAtrasados * 50.0;
    }

}
