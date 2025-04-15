package model;

import model.Veiculo;
import javax.swing.*;

public class Caminhao extends Veiculo {
    private int cargaMax;
    private int alturaMax;
    private int comprimento;

    public Caminhao() {
        this(0,0,0,0,0,0);
    }

    public Caminhao(int peso, int velocidadeMax, float preco, int cargaMax, int alturaMax, int comprimento) {
        super(peso,velocidadeMax,preco);
        setCargaMax(cargaMax);
        setAlturaMax(alturaMax);
        setComprimento(comprimento);
    }    

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(int alturaMax) {
        this.alturaMax = alturaMax;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
    
    public void leitura() {
        super.leitura();
        setCargaMax(Integer.parseInt(JOptionPane.showInputDialog("Carga Maxima(Ton): ")));
        setAlturaMax(Integer.parseInt(JOptionPane.showInputDialog("Altura Maxima(m): ")));
        setComprimento(Integer.parseInt(JOptionPane.showInputDialog("Comprimento(m): ")));
    }
    
    public void imprimir() {
        JOptionPane.showMessageDialog(null,paraString());
    }
    
    public String paraString(){
        return (super.paraString() + "Ton\nCarga Maxima: " + getCargaMax() + "m\nAltura Maxima: " + getAlturaMax() + "m\nComprimento: " + getComprimento());
    }
}