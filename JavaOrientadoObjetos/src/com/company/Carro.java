package com.company;
public class Carro {
    public String nome;
    public String cor;
    public float peso;
    public int velocidade;

    //Quando o tivpo é void o método não retorna valores, Ex: Ao invés de retornar um valo ele escreve direto;
    private void movimentar(int velocidade){
        System.out.println("O carro esta se movimentando com a velocidade: " + velocidade + " Km/h");
    }

    public void frear(int tempo){
        this.movimentar(100);
        System.out.println("O carro freou em " + tempo + " Segundos");

    }
}
