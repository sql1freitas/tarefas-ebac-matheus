public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, Integer idade,String cnpj) {
        super(nome, idade);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return   "Pessoa Jurídica{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                " CNPJ='" + cnpj + '\'' +
                '}';
    }
}
