package dados;

public class Animal {
    private String nome, especie, descricao;
    private Dono dono;

    public Animal() {
        
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Dono getDono() {
        return dono;
    }
    public void setDono(Dono dono) {
        this.dono = dono;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toString(){
        String animalString = "";
        animalString += "Nome: " + this.nome + " | Espécie: " + this.especie + " | Descrição: " + this.descricao;
        if (this.dono != null)
            animalString += "\n    [Dono] " + this.dono.toString();

        return animalString;
    }
}
