package br.cristec.modelo;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.cristec.util.JpaUtil;

public class PersistindoVeiculo {
	
	public static void main(String[] args) 
	{
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		Veiculo veiculo = new Veiculo();
		veiculo.setFabricante("Toyota");
		veiculo.setAnoModelo(2014);
		veiculo.setAnoFabricacao(2014);
		veiculo.setModelo("Corola");
		veiculo.setValor(new BigDecimal(73000));
		
		manager.persist(veiculo);
		
		tx.commit();
		manager.close();		
	}

}
