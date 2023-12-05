public class Pessoa {

    private String nome;
    private String sexo;
    private Integer idade;

    private Double renda;

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }

    public Pessoa(String nome, String sexo, Integer idade, Double renda) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.renda = renda;

        if(idade < 18){
            throw new RuntimeException("Proibido para menores de 18 anos!");
        }
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                ", renda=" + renda +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
