import java.time.LocalDate;


public class Livro {
    private int id;
    private String titulo;
    private String estado; // "livre", "reservado", "emprestado", "renovado"
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Livro(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        this.estado = "livre";
    }

    public void atualizarEstado(String novoEstado) {
        this.estado = novoEstado;
        if ("emprestado".equals(novoEstado)) {
            this.dataEmprestimo = LocalDate.now();
            this.dataDevolucao = dataEmprestimo.plusDays(14); // Define o prazo de devolução em 14 dias
        } else if ("livre".equals(novoEstado)) {
            this.dataEmprestimo = null;
            this.dataDevolucao = null;
        }
    }

    public String getEstado() {
        return estado;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", estado='" + estado + '\'' +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                '}';
    }
}
