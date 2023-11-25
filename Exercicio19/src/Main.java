import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Tabela {
    String nome();
}

@Tabela(nome = "ExemploTabela")
class ExemploClasse {
    int id;
    String nome;
    double valor;
}

public class Main {
    public static void main(String[] args) {
        // Obtendo a classe
        Class<?> classe = ExemploClasse.class;

        // Verificando se a annotation Tabela está presente
        if (classe.isAnnotationPresent(Tabela.class)) {
            // Obtendo a instância da annotation
            Tabela tabela = classe.getAnnotation(Tabela.class);

            // Imprimindo o nome da tabela
            System.out.println("Nome da tabela: " + tabela.nome());
        } else {
            System.out.println("A annotation Tabela não está presente na classe.");
        }

        // Imprimindo os nomes dos campos usando reflection
        Field[] campos = classe.getDeclaredFields();
        System.out.println("Campos da tabela:");
        for (Field campo : campos) {
            System.out.println(campo.getName());
        }
    }
}
