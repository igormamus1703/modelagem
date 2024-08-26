public class Estudante extends Pessoa {
    private String matricula;

    public Estudante(int id, String nome, String sobrenome, String cpf, String matricula) {
        super(id, nome, sobrenome, cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void reservarLivro(Livro livro) {
        if ("livre".equals(livro.getEstado())) {
            livro.atualizarEstado("reservado");
            System.out.println("Livro " + livro.getTitulo() + " reservado com sucesso!");
        } else {
            System.out.println("Livro " + livro.getTitulo() + " não está disponível para reserva.");
        }
    }

    public void realizarEmprestimo(Livro livro) {
        if ("reservado".equals(livro.getEstado())) {
            livro.atualizarEstado("emprestado");
            System.out.println("Livro " + livro.getTitulo() + " emprestado com sucesso!");
        } else {
            System.out.println("Livro " + livro.getTitulo() + " não está reservado.");
        }
    }

    public void renovarEmprestimo(Livro livro) {
        if ("emprestado".equals(livro.getEstado())) {
            livro.atualizarEstado("renovado");
            System.out.println("Empréstimo do livro " + livro.getTitulo() + " renovado com sucesso!");
        } else {
            System.out.println("Livro " + livro.getTitulo() + " não está emprestado ou já foi renovado.");
        }
    }
}
