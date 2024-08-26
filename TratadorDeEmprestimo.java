public class TratadorDeEmprestimo {
    public void solicitarReserva(Estudante estudante, Livro livro) {
        estudante.reservarLivro(livro);
    }

    public void efetivarEmprestimo(Estudante estudante, Livro livro) {
        estudante.realizarEmprestimo(livro);
    }

    public void renovarEmprestimo(Estudante estudante, Livro livro) {
        estudante.renovarEmprestimo(livro);
    }
}
