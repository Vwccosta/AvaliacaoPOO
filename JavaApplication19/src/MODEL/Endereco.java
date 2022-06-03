package MODEL;

/**
 *
 * @author Vander
 */
public class Endereco {
    private String logradouro;
    private int numero;
    private String complemento;
    private String cep;
    private Cidade cidade;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco:" + 
                "\n Rua: " + logradouro + "," + numero + 
                "\n Complemento: " + complemento + 
                "\n CEP: " + cep + "\n " 
                + cidade.toString();
    }
    
    
    
}