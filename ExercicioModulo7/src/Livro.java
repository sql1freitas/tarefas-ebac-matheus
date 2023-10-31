/**
 * Classe responsável pelo objeto livro e seus atributos
 *
 * @author Matheus Felipe
 */
public class Livro {
    private String nome;
    private String autor;
    private String edicao;
    private int codigo;

    private double valor;

    private String genero;




    public Livro(String nome, String autor, String edicao, Integer codigo,
                 Double valor, String genero) {
        this.nome = nome;
        this.autor = autor;
        this.edicao = edicao;
        this.codigo = codigo;
        this.valor = valor;
        this.genero = genero;

    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * Método que lista todos os detalhes do livro escolhido.
     * @param livro
     */
    public void listarDetalhes(Livro livro){

        System.out.print("Nome: " + livro.nome + " ");
        System.out.print("Autor: " + livro.autor + " ");
        System.out.print("Genero: " + livro.genero + " ");
        System.out.print("Edição: " + livro.edicao + " ");
        System.out.print("Valor: " + livro.valor + " ");
    }

    }



