public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Livro
        Livro livro1 = new Livro(1, "Introdução à Programação");
        Livro livro2 = new Livro(2, "Estruturas de Dados");
        
        // Criando instâncias de Pessoa, Estudante e Atendente
        Pessoa pessoa1 = new Pessoa(1, "João", "Silva", "12345678900");
        Estudante estudante1 = new Estudante(2, "Maria", "Oliveira", "09876543211", "202201");
        Atendente atendente1 = new Atendente(3, "Carlos", "Santos", "11223344556");
        
        // Criando instâncias de TratadorDeCadastro
        TratadorDeCadastro tratadorCadastro = new TratadorDeCadastro();
        
        // Inserindo pessoas e livros no sistema
        tratadorCadastro.inserirPessoa(pessoa1);
        tratadorCadastro.inserirPessoa(estudante1);
        tratadorCadastro.inserirPessoa(atendente1);
        tratadorCadastro.inserirLivro(livro1);
        tratadorCadastro.inserirLivro(livro2);
        
        // Consultando pessoa e livro
        tratadorCadastro.consultarPessoa(2); // Maria Oliveira
        tratadorCadastro.consultarLivro(1); // Introdução à Programação
        
        // Criando instâncias de TratadorDeEmprestimo e TratadorDeDevolucao
        TratadorDeEmprestimo tratadorEmprestimo = new TratadorDeEmprestimo();
        TratadorDeDevolucao tratadorDevolucao = new TratadorDeDevolucao();
        
        // Estudante reservando e emprestando um livro
        tratadorEmprestimo.solicitarReserva(estudante1, livro1);
        tratadorEmprestimo.efetivarEmprestimo(estudante1, livro1);
        
        // Tentativa de renovar o empréstimo
        tratadorEmprestimo.renovarEmprestimo(estudante1, livro1);
        
        // Atendente registrando a devolução do livro
        tratadorDevolucao.registrarDevolucao(atendente1, livro1);
        
        // Emitindo boleto de multa por atraso
        tratadorDevolucao.emitirBoletoMulta(atendente1, 5); // 5 dias de atraso
        
        // Consultando novamente o estado do livro após as operações
        tratadorCadastro.consultarLivro(1);
    }
}
