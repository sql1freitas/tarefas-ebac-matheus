package Domain;

import jakarta.persistence.*;

@Entity
@Table
public class Acessorio {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acessorio_seq")
    @SequenceGenerator(name = "acessorio_seq", sequenceName = "sq_acessorio", initialValue = 1)
    private Long id;
    @Column(length = 200, nullable = false)
    private String nome;

    @Column(nullable = false)
    private Double valor;
    @ManyToOne
    @JoinColumn(name = "id_carro_fk", foreignKey = @ForeignKey(name = "fk_acessorios_carro"),
    referencedColumnName = "id", nullable = false)
    private Carro carro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
}
