public class TratadorDeDevolucao {
    public void registrarDevolucao(Atendente atendente, Livro livro) {
        atendente.registrarDevolucao(livro);
    }

    public void emitirBoletoMulta(Atendente atendente, Livro livro) {
        atendente.emitirBoletoMulta(livro);
    }
}
