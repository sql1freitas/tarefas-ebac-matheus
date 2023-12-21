package Domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Marca {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "marca_seq")
    @SequenceGenerator(name = "marca_seq", sequenceName = "sq_marca", initialValue = 1)
    private Long id;
    @Column(length = 200, nullable = false)
    private String nome;
    @OneToMany(mappedBy = "marca")
    private List<Carro> carro;

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

    public List<Carro> getCarro() {
        return carro;
    }

    public void setCarro(List<Carro> carro) {
        this.carro = carro;
    }
}
