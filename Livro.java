public class Livro {
    private int id;
    private String titulo;
    private String estado; // "livre", "reservado", "emprestado"

    public Livro(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        this.estado = "livre";
    }

    public void atualizarEstado(String novoEstado) {
        this.estado = novoEstado;
    }

    public String getEstado() {
        return estado;
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
                '}';
    }
}
