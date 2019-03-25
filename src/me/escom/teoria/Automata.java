package me.escom.teoria;

import java.util.ArrayList;

public class Automata {

	private ArrayList<Estado> estados;
	private ArrayList<Integer> estados_finales;
	
	public Automata(){
		estados = new ArrayList<Estado>();
		estados_finales = new ArrayList<Integer>();
	}
	
	public boolean probar(String cadena){
		if(cadena == null)
			return false;
		if(cadena.length() == 0)
			return false;
		
		int actual = 0;
		int num_estado = 0;
		while(actual < cadena.length()) {
			num_estado = estados.get(num_estado).test(cadena.charAt(actual));
			if(num_estado == -1)
				return false;
			actual++;
		}
		
		//Probar si quedó en estado final
		for(int i = 0; i < estados_finales.size(); i++) {
			if(num_estado == estados_finales.get(i))
				return true;
		}
		
		return false;
	}
	
	public void addEstado(Estado estado){
		estados.add(estado);
	}
	
	public Estado getEstado(int indice) {
		return estados.get(indice);
	}
	
	public void agregarEstadoFinal(int estado_final) {
		estados_finales.add(estado_final);
	}
}
