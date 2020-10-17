package br.senac.rn.introducaooo;

public class Lampada {

    public final Integer FREQUENCIA = 60; //nome de constante sempre em MAIUSCULO

    //Sempre em primeiro Atributos(Propriedade) depois os Metodos(Funcionalidades)
    //nome de Atributos(Propriedade) sempre com o começo da palavra em minusculo
    public String cor;
    public Integer potencia;
    public Integer tensao;
    public Float comprimento;
    private Boolean estado = false;

    public Lampada() {
    }

    public Lampada(String cor) {
        this.cor = cor;
    }

    public Lampada(String cor, Integer potencia) {
        this.cor = cor;
        this.potencia = potencia;
    }

    //nome de Metodos(Funcionalidades) sempre com o começo da palavra em minusculo
    /*
    Métodos devem ser verbos, em "mixed case" com a primeira letra minúscula e
    a primeira letra das palavras internas em letra maiúscula.
     */
    public void acende() {
        estado = true;
    }

    public void apaga() {
        estado = false;
    }

    public String statusLampada() {
        if (estado == true) {
            return "LIGADO";
        }
        return "DESLIGADO";
    }

    @Override
    public String toString() {
        return "Lampada{" +
                "cor='" + cor + '\'' +
                ", estado=" + statusLampada() +
                '}';
    }
}