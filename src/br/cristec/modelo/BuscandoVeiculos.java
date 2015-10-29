package br.cristec.modelo;

import javax.persistence.EntityManager;

import br.cristec.util.JpaUtil;

public class BuscandoVeiculos {
	
	public static void main(String[] args) {
		
		EntityManager manager = JpaUtil.getEntityManager();
		
		Veiculo veiculo = manager.find(Veiculo.class, 1L);
		
		System.out.println("O veiculo: " + veiculo.getCodigo() +
				" é um " + veiculo.getModelo());
		
		manager.close();
	}

}
