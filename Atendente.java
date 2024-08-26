public class Atendente extends Pessoa {
    public Atendente(int id, String nome, String sobrenome, String cpf) {
        super(id, nome, sobrenome, cpf);
    }

    public void registrarDevolucao(Livro livro) {
        if ("emprestado".equals(livro.getEstado()) || "renovado".equals(livro.getEstado())) {
            livro.atualizarEstado("livre");
            System.out.println("Livro " + livro.getTitulo() + " devolvido com sucesso!");
        } else {
            System.out.println("Livro " + livro.getTitulo() + " não está emprestado.");
        }
    }

    public void emitirBoletoMulta(int diasAtraso) {
        double multa = diasAtraso * 1.00;
        System.out.println("Boleto de multa emitido: R$" + multa + " por " + diasAtraso + " dias de atraso.");
    }
}
