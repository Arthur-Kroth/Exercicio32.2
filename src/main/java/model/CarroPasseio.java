package model;

import model.Veiculo;
import javax.swing.*;

public class CarroPasseio extends Veiculo {
    private String cor;
    private String modelo;

    public CarroPasseio() {
        this(0,0,0,"","");
    }
    
    public CarroPasseio(int peso, int velocidadeMax, float preco, String cor, String modelo) {
        super(peso, velocidadeMax, preco);
        setCor(cor);
        setModelo(modelo);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void leitura() {
        super.leitura();
        setCor(JOptionPane.showInputDialog("Cor:"));
        setModelo(JOptionPane.showInputDialog("Modelo:"));
    }
    
    public void imprimir() {
        JOptionPane.showMessageDialog(null,paraString());
    }
    
    public String paraString() {
        return (super.paraString() + "\nCor: " + getCor() + "\nModelo: " + getModelo());
    }
}
