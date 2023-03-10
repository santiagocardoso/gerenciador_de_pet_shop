package dados;

public class Dono {
    private String nome, cpf;
    private Endereco endereco;

    public Dono() {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }

    public String toString(){
        String donoString = "";
        donoString += "Nome: " + this.nome + " | Cpf: " + this.cpf;
        if (this.endereco != null) {
            donoString += "\n[Endereço] " + this.endereco.toString();
        }
        return donoString;
    }
}
