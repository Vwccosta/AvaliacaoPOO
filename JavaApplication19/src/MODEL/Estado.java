package MODEL;

/**
 *
 * @author Vander
 */
public class Estado {
    private String nome;
    private String codIbge;
    private Pais pais;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodIbge() {
        return codIbge;
    }

    public void setCodIbge(String codIbge) {
        this.codIbge = codIbge;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Estado" + 
                "\n Nome: " + nome + 
                "\n IBGE: " + codIbge + 
                "\n" + pais.toString();
    }
    
    
}