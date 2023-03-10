package dados;

public class Endereco {
    private String rua, bairro, cidade, estado, cep;
    private int numero;

    public Endereco() {

    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getRua() {
        return rua;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getBairro() {
        return bairro;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getEstado() {
        return estado;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getCep() {
        return cep;
    }

    public String toString(){
        String enderecoString = "";
        enderecoString += "Rua: " + this.rua + " | Numero: " + this.numero + " | Bairro: " + this.bairro + " | Cidade: " + this.cidade + " | Estado: " + this.estado + " | CEP: " + this.cep;

        return enderecoString;
    }
}
