package sistema;

import dados.*;

public class SistemaPetShop {
    private Veterinario veterinarios[];
    private int quantVeterinarios = 0;

    public void cadastrarVeterinario(Veterinario v) {
        if (quantVeterinarios < veterinarios.length) {
            veterinarios[quantVeterinarios] = v;
            quantVeterinarios++;
        }
    }
	public Veterinario[] getVeterinarios() {
		return veterinarios;
	}
    public SistemaPetShop(int quantVeterinarios) {
        veterinarios = new Veterinario[quantVeterinarios];
    }
	public int getQuantVeterinarios() {
		return quantVeterinarios;
	}
}
