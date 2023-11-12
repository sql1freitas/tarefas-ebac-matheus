import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;



public class CadastroUsuarioForm extends JFrame {
    private JTextField nomeTextField, idadeTextField, enderecoTextField, cpfTextField;
    private DefaultListModel<String> listaModel;
    private JList<String> listaUsuarios;

    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private int indiceSelecionado = -1;

    public CadastroUsuarioForm() {
        // Configurações básicas do JFrame
        setTitle("Cadastro, Edição e Exclusão de Usuários");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Componentes do formulário
        nomeTextField = new JTextField(20);
        idadeTextField = new JTextField(3);
        enderecoTextField = new JTextField(20);
        cpfTextField = new JTextField(11);

        JButton cadastrarButton = new JButton("Cadastrar");
        JButton excluirButton = new JButton("Excluir");
        JButton editarButton = new JButton("Editar");

        // Lista de usuários
        listaModel = new DefaultListModel<>();
        listaUsuarios = new JList<>(listaModel);

        // Layout do formulário
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);

        panel.add(new JLabel("Nome: "), gbc);
        gbc.gridx++;
        panel.add(nomeTextField, gbc);
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("Idade: "), gbc);
        gbc.gridx++;
        panel.add(idadeTextField, gbc);
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("Endereço: "), gbc);
        gbc.gridx++;
        panel.add(enderecoTextField, gbc);
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("CPF: "), gbc);
        gbc.gridx++;
        panel.add(cpfTextField, gbc);
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(cadastrarButton, gbc);
        gbc.gridx++;
        panel.add(excluirButton, gbc);
        gbc.gridx++;
        panel.add(editarButton, gbc);
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 3;
        panel.add(new JScrollPane(listaUsuarios), gbc);

        // Configuração do layout do JFrame
        add(panel);

        // Ação do botão cadastrar
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarUsuario();
            }
        });

        // Ação do botão excluir
        excluirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                excluirUsuario();
            }
        });

        // Ação do botão editar
        editarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editarUsuario();
            }
        });

        // Ação da lista de usuários
        listaUsuarios.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                indiceSelecionado = listaUsuarios.getSelectedIndex();
                preencherCamposEdicao();
            }
        });
    }

    private void cadastrarUsuario() {
        String nome = nomeTextField.getText();
        int idade = Integer.parseInt(idadeTextField.getText());
        String endereco = enderecoTextField.getText();
        String cpf = cpfTextField.getText();

        Usuario novoUsuario = new Usuario(nome, idade, endereco, cpf);
        usuarios.add(novoUsuario);

        // Atualiza a lista de usuários
        atualizarListaUsuarios();
        limparCampos();
    }

    private void excluirUsuario() {
        if (indiceSelecionado != -1) {
            usuarios.remove(indiceSelecionado);
            indiceSelecionado = -1;
            atualizarListaUsuarios();
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um usuário para excluir.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void editarUsuario() {
        if (indiceSelecionado != -1) {
            String nome = nomeTextField.getText();
            int idade = Integer.parseInt(idadeTextField.getText());
            String endereco = enderecoTextField.getText();
            String cpf = cpfTextField.getText();

            Usuario usuarioEditado = new Usuario(nome, idade, endereco, cpf);
            usuarios.set(indiceSelecionado, usuarioEditado);

            atualizarListaUsuarios();
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um usuário para editar.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void atualizarListaUsuarios() {
        listaModel.clear();
        for (Usuario usuario : usuarios) {
            listaModel.addElement(usuario.toString());
        }
    }

    private void preencherCamposEdicao() {
        if (indiceSelecionado != -1) {
            Usuario usuarioSelecionado = usuarios.get(indiceSelecionado);
            nomeTextField.setText(usuarioSelecionado.getNome());
            idadeTextField.setText(String.valueOf(usuarioSelecionado.getIdade()));
            enderecoTextField.setText(usuarioSelecionado.getEndereco());
            cpfTextField.setText(usuarioSelecionado.getCpf());
        }
    }

    private void limparCampos() {
        nomeTextField.setText("");
        idadeTextField.setText("");
        enderecoTextField.setText("");
        cpfTextField.setText("");
    }


}



