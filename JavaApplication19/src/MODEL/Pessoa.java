
package MODEL;

import java.util.Date;

/**
 *
 * @author Vander
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private String rg;
    private Date nascimento;
    private Endereco endereco;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa" + 
                "\n nome=" + nome + 
                "\n cpf=" + cpf + 
                "\n rg=" + rg + 
                "\n nascimento=" + nascimento + 
                "\n" + endereco.toString() + "\n";
    }
    
    
    
}