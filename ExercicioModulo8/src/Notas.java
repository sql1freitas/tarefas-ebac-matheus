public class Notas {

    private Double valor;


    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Notas(Double valor){
        this.valor = valor;

    }

    public Double calculoMedia(Double total) {
        Double media = total / 4;
        return media;
    }
}
