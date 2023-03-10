package dados;

public class Veterinario {
    private String nome;
    private float salario;
    private Endereco endereco;
    private Animal[] animais;
    private int quantAnimais = 0;

    public Veterinario() {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public float getSalario() {
        return salario;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setAnimal(Animal a) {
        if (quantAnimais < animais.length) {
            animais[quantAnimais] = a;
            quantAnimais++;
        }
    }
    public Animal[] getAnimais() {
        return animais;
    }
    public Veterinario(int quantAnimais) {
        animais = new Animal[quantAnimais];
    }
    public int getQuantAnimais() {
        return quantAnimais;
    }

    public String toString() {
        String veterinarioString = "";
        veterinarioString += "Nome: " + this.nome + " | Salário: " + this.salario;
        if (this.endereco != null)
            veterinarioString += "\n      [Endereço] " + this.endereco.toString();
            
        return veterinarioString;
    }
}
