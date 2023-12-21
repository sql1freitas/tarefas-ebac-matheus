package Domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Carro {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carro_seq")
    @SequenceGenerator(name = "carro_seq", sequenceName = "sq_carro", initialValue = 1)
    private Long id;
    @Column(length = 200, nullable = false)
    private String modelo;
    @OneToMany(mappedBy = "carro")
    private List<Acessorio> acessorioList;
    @ManyToOne
    @JoinColumn(name = "id_marca_fk", foreignKey = @ForeignKey(name = "fk_marca_carro"),
            referencedColumnName = "id", nullable = false)
    private Marca marca;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<Acessorio> getAcessorioList() {
        return acessorioList;
    }

    public void setAcessorioList(List<Acessorio> acessorioList) {
        this.acessorioList = acessorioList;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}
