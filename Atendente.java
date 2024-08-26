import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

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

    public void emitirBoletoMulta(Livro livro) {
        if (livro.getDataDevolucao() != null && LocalDate.now().isAfter(livro.getDataDevolucao())) {
            long diasAtraso = ChronoUnit.DAYS.between(livro.getDataDevolucao(), LocalDate.now());
            double multa = diasAtraso * 1.00;
            System.out.println("Boleto de multa emitido: R$" + multa + " por " + diasAtraso + " dias de atraso.");
        } else {
            System.out.println("Nenhuma multa necessária. Livro devolvido no prazo.");
        }
    }
}
