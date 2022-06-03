package MODEL;

/**
 *
 * @author Vander
 */
public class Pais {
    private String nome;
    private String ddd;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    @Override
    public String toString() {
        return "Pais" + 
                "\n Nome:" + nome + 
                "\n DDD: " + ddd;
    }
}