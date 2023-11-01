/**
 *  Classe para manipulação das notas
 *
 * @author Matheus Felipe
 */

public class Notas {

    private Double valor;


    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    /**
     * Construtor para a classe notas implicando que elas precisam de um valor
     * @param valor
     */
    public Notas(Double valor){
        this.valor = valor;

    }

    /**
     * Método Simples para o cálculo da média
     * @param total
     * @return
     */
    public Double calculoMedia(Double total) {
        Double media = total / 4;
        return media;
    }
}
