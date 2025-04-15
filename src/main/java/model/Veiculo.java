package model;

import javax.swing.*;

public class Veiculo {
    private int peso;
    private int velocidadeMax;
    private float preco;

    public Veiculo() {
        this(0,0,0);
    }

    public Veiculo(int peso, int velocidadeMax, float preco) {
        setPeso(peso);
        setVelocidadeMax(velocidadeMax);
        setPreco(preco);
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public void leitura() {
        setPeso(Integer.parseInt(JOptionPane.showInputDialog("Peso(Kg): ")));
        setVelocidadeMax(Integer.parseInt(JOptionPane.showInputDialog("Velocidade Maxima(Km/h): ")));
        setPreco(Integer.parseInt(JOptionPane.showInputDialog("Preco(R$): ")));
    }
    
    public void imprimir() {
        JOptionPane.showMessageDialog(null,paraString());
    }

    public String paraString() {
        return "Veiculo" + "Peso=" + getPeso() + ", Kg\nVelocidade Maxima=" + getVelocidadeMax() + ", Kg\nPreco= R$" + getPreco();
    }
}
