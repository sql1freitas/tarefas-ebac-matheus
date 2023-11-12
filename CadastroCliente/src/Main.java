import javax.swing.*;

/**
 * @author Matheus
 * Formulário para cadastro, edição e exclusão de usuários na memória
 */


public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadastroUsuarioForm().setVisible(true);
            }
        });
    }
}
