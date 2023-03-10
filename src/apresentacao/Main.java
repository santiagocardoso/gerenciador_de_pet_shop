package apresentacao;

import dados.*;
import sistema.*;
import java.util.Scanner;

public class Main {
    Scanner scan = new Scanner(System.in);
    SistemaPetShop sistema = new SistemaPetShop(5);
	
	public SistemaPetShop getSistema() {
		return sistema;
	}
	
	public int menu() {
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Escolha uma opção:");
		System.out.println("1 - Cadastar veterinário;");
		System.out.println("2 - Mostrar veterinários;");
		System.out.println("3 - Cadastrar endereço de veterinário;");
		System.out.println("4 - Cadastrar animal;");
		System.out.println("5 - Mostrar os animais;");
		System.out.println("6 - Cadastrar dono;");
		System.out.println("7 - Cadastrar endereço do dono;");
		System.out.println("0 - Para sair do programa.");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		int opcao = Integer.valueOf(scan.nextLine());
		
		return opcao;
	}
	
	public Veterinario escolheVeterinario() {
		if(sistema.getQuantVeterinarios() == 0){
            System.out.println("Não há veterinários cadastrados");
            return null;
        }
		mostrarVeterinarios();
		System.out.println("Escolha um dos veterinários cadastrados:");
		int escolhe = Integer.parseInt(scan.nextLine());

		return sistema.getVeterinarios()[escolhe];
	}

	public Animal escolheAnimal() {
		Veterinario v = escolheVeterinario();
		if(v.getQuantAnimais() == 0) {
			System.out.println("Nenhum animal cadastrado!");
			
			return null;
		}
		else {
			for (int i = 0; i < v.getQuantAnimais(); i++) {
				System.out.println("[" + i + "]" + v.getAnimais()[i].toString());
			}
			System.out.println("Escolha um dos animais cadastrados:");
			int escolhe = Integer.parseInt(scan.nextLine());
			
			return v.getAnimais()[escolhe];
		}
	}

	public Dono escolheDono() {
		Animal a = escolheAnimal();
		return a.getDono();
	}

	// Opção 1;
	private void cadastrarVeterinario() {
		if (sistema.getQuantVeterinarios() < 5) {
			Veterinario veterinario = new Veterinario(3);

			System.out.println("Digite o nome:");
			veterinario.setNome(scan.nextLine());

			System.out.println("Digite o salário:");
			veterinario.setSalario(Float.valueOf(scan.nextLine()));
			
			sistema.cadastrarVeterinario(veterinario);
		}
		else
			System.out.println("Número máximo de veterinários registrados!");
	}

	// Opção 2;
	public void mostrarVeterinarios() {
        if (sistema.getQuantVeterinarios() == 0)
            System.out.println("Nao há veterinarios cadastrados!");
        else
            for (int i = 0; i < sistema.getQuantVeterinarios(); i++)
                System.out.println("[" + i + "] - " + sistema.getVeterinarios()[i].toString());
    }

	// Opção 3;
	public Endereco cadastrarEndereco(){
        Endereco e = new Endereco();

        System.out.println("Digite o nome da rua:");
        String nome = scan.nextLine();
        e.setRua(nome);

        System.out.println("Digite o numero da casa:");
        int numero = Integer.parseInt(scan.nextLine());
        e.setNumero(numero);

        System.out.println("Digite o bairro:");
        String bairro = scan.nextLine();
        e.setBairro(bairro);

        System.out.println("Digite a cidade:");
        String cidade = scan.nextLine();
        e.setCidade(cidade);

        System.out.println("Digite o estado:");
        String Estado = scan.nextLine();
        e.setEstado(Estado);

        System.out.println("Digite o CEP:");
        String cep = scan.nextLine();
        e.setCep(cep);

        return e;
    }

	public void cadastrarEnderecoVeterinario() {
		if (sistema.getQuantVeterinarios() == 0)
            System.out.println("Nao há veterinarios cadastrados!");
        else {
			Veterinario v = escolheVeterinario();
			v.setEndereco(cadastrarEndereco());
		}
	}

	// Opção 4;
	public Animal cadastrarAnimais(){
        Animal a = new Animal();

        System.out.println("Digite o nome do animal:");
        String nome = scan.nextLine();
        a.setNome(nome);

        System.out.println("Digite a especie do animal:");
        String especie = scan.nextLine();
        a.setEspecie(especie);

        System.out.println("Digite a descricao:");
        String descricao = scan.nextLine();
        a.setDescricao(descricao);

        return a;
    }

	public void cadastrarAnimal() {
		if (sistema.getQuantVeterinarios() == 0)
            System.out.println("Nao há veterinarios cadastrados!");
        else {
			Veterinario v = escolheVeterinario();
			v.setAnimal(cadastrarAnimais());
		}
	}
	
	// Opção 5;
	public void mostrarAnimais() {
		if (sistema.getQuantVeterinarios() == 0)
            System.out.println("Nao há veterinarios cadastrados!");
        else {
			Veterinario v = escolheVeterinario();
			if (v != null) {
				if(v.getQuantAnimais() == 0)
					System.out.println("Nenhum animal cadastrado!");
				else
					for (int i = 0; i < v.getQuantAnimais(); i++)
						System.out.println("[" + i + "] " + v.getAnimais()[i].toString());
			}
			else
				System.out.println("Veterinario não cadastrado!");
		}
	}

	// Opção 6;
	public Dono cadastrarDonos(){
        Dono d = new Dono();

        System.out.println("Digite o nome do dono:");
        String nome = scan.nextLine();
        d.setNome(nome);

        System.out.println("Digite o cpf do dono");
        String cpf = scan.nextLine();
        d.setCpf(cpf);

        return d;
    }
	
	public void cadastrarDono() {
		if (sistema.getQuantVeterinarios() == 0)
            System.out.println("Nao há veterinarios cadastrados!");
        else {
			Animal a = escolheAnimal();
			a.setDono(cadastrarDonos());
		}
	}

	// Opção 7
	public void cadastrarEnderecoDono() {
		if (sistema.getQuantVeterinarios() == 0)
            System.out.println("Nao há veterinarios cadastrados!");
        else {
			Dono d = escolheDono();
			d.setEndereco(cadastrarEndereco());
		}
	}

	public static void main(String args[]) {
		Main main = new Main();
		int opcao = main.menu();
		
		while(opcao != 0 ) {
			switch (opcao) {
				case 1: main.cadastrarVeterinario();
						break;
				case 2: main.mostrarVeterinarios();
						break;
				case 3: main.cadastrarEnderecoVeterinario();
						break;
				case 4:	main.cadastrarAnimal();
						break;
				case 5: main.mostrarAnimais();
						break;
				case 6: main.cadastrarDono();
						break;
				case 7: main.cadastrarEnderecoDono();
						break;
				default: 
					System.out.println("Opção inválida!");
			}
			opcao = main.menu();
		}	
	}
}
