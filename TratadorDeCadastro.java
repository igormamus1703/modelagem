import java.util.HashMap;
import java.util.Map;

public class TratadorDeCadastro {
    private Map<Integer, Pessoa> pessoas = new HashMap<>();
    private Map<Integer, Livro> livros = new HashMap<>();

    public void inserirPessoa(Pessoa pessoa) {
        if (pessoas.containsKey(pessoa.getId())) {
            System.out.println("Pessoa com ID " + pessoa.getId() + " já está cadastrada.");
        } else {
            pessoas.put(pessoa.getId(), pessoa);
            System.out.println("Pessoa " + pessoa.getNomeCompleto() + " cadastrada com sucesso.");
        }
    }

    public void consultarPessoa(int id) {
        if (pessoas.containsKey(id)) {
            System.out.println(pessoas.get(id));
        } else {
            System.out.println("Pessoa com ID " + id + " não encontrada.");
        }
    }

    public void atualizarPessoa(Pessoa pessoa) {
        if (pessoas.containsKey(pessoa.getId())) {
            pessoas.put(pessoa.getId(), pessoa);
            System.out.println("Pessoa " + pessoa.getNomeCompleto() + " atualizada com sucesso.");
        } else {
            System.out.println("Pessoa com ID " + pessoa.getId() + " não encontrada para atualização.");
        }
    }

    public void excluirPessoa(int id) {
        if (pessoas.containsKey(id)) {
            pessoas.remove(id);
            System.out.println("Pessoa com ID " + id + " excluída com sucesso.");
        } else {
            System.out.println("Pessoa com ID " + id + " não encontrada para exclusão.");
        }
    }

    public void inserirLivro(Livro livro) {
        if (livros.containsKey(livro.getId())) {
            System.out.println("Livro com ID " + livro.getId() + " já está cadastrado.");
        } else {
            livros.put(livro.getId(), livro);
            System.out.println("Livro " + livro.getTitulo() + " cadastrado com sucesso.");
        }
    }

    public void consultarLivro(int id) {
        if (livros.containsKey(id)) {
            System.out.println(livros.get(id));
        } else {
            System.out.println("Livro com ID " + id + " não encontrado.");
        }
    }

    public void atualizarLivro(Livro livro) {
        if (livros.containsKey(livro.getId())) {
            livros.put(livro.getId(), livro);
            System.out.println("Livro " + livro.getTitulo() + " atualizado com sucesso.");
        } else {
            System.out.println("Livro com ID " + livro.getId() + " não encontrado para atualização.");
        }
    }

    public void excluirLivro(int id) {
        if (livros.containsKey(id)) {
            livros.remove(id);
            System.out.println("Livro com ID " + id + " excluído com sucesso.");
        } else {
            System.out.println("Livro com ID " + id + " não encontrado para exclusão.");
        }
    }
}
