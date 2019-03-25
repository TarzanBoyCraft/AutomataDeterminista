package me.escom.teoria;

public class Principal {
	
	public static void main(String [] args){
		System.out.println("INICIO");
		Estado estado0 = (char a)->{
			if(a == '0')
				return 1;
			if(a == '+' || a == '-')
				return 7;
			if(a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9')
				return 8;
			return -1;
		};
		
		Estado estado1 = (char a)->{
			if(a == '.')
				return 2;
			return -1;
		};
		
		Estado estado2 = (char a)->{
			if(a == '0' || a == '1' || a == '2' || a == '3' || a == '4' || a == '5' ||a == '6' ||a == '7' || a == '8' || a == '9')
				return 3;
			return -1;
		};
		
		Estado estado3 = (char a)->{
			if(a == '0' || a == '1' || a == '2' || a == '3' || a == '4' || a == '5' ||a == '6' ||a == '7' || a == '8' || a == '9')
				return 3;
			if(a == 'e' || a == 'E')
				return 4;
			return -1;
		};
		
		Estado estado4 = (char a)->{
			if(a == '+' || a == '-')
				return 5;
			return -1;
		};
		
		Estado estado5 = (char a)->{
			if(a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9')
				return 6;
			return -1;
		};
		
		Estado estado6 = (char a)->{
			if(a == '0' || a == '1' || a == '2' || a == '3' || a == '4' || a == '5' ||a == '6' ||a == '7' || a == '8' || a == '9')
				return 6;
			return -1;
		};
		Estado estado7 = (char a)->{
			if(a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9')
				return 8;
			if(a == '0')
				return 9;
			return -1;
		};
		
		Estado estado8 = (char a)->{
			if(a == '0' || a == '1' || a == '2' || a == '3' || a == '4' || a == '5' ||a == '6' ||a == '7' || a == '8' || a == '9')
				return 8;
			if(a == '.')
				return 2;
			return -1;
		};
		
		Estado estado9 = (char a)->{
			if(a == '.')
				return 10;
			return -1;
		};
		
		Estado estado10 = (char a)->{
			if(a == '0' || a == '1' || a == '2' || a == '3' || a == '4' || a == '5' ||a == '6' ||a == '7' || a == '8' || a == '9')
				return 11;
			return -1;
		};
		
		Estado estado11 = (char a)->{
			if(a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9')
				return 12;
			return -1;
		};
		
		Estado estado12 = (char a)->{
			if(a == '0' || a == '1' || a == '2' || a == '3' || a == '4' || a == '5' ||a == '6' ||a == '7' || a == '8' || a == '9')
				return 12;
			if(a == 'e' || a == 'E')
				return 4;
			return -1;
		};
		
		Automata automata = new Automata();
		
		automata.addEstado(estado0);
		automata.addEstado(estado1);
		automata.addEstado(estado2);
		automata.addEstado(estado3);
		automata.addEstado(estado4);
		automata.addEstado(estado5);
		automata.addEstado(estado6);
		automata.addEstado(estado7);
		automata.addEstado(estado8);
		automata.addEstado(estado9);
		automata.addEstado(estado10);
		automata.addEstado(estado11);
		automata.addEstado(estado12);
		
		automata.agregarEstadoFinal(3);
		automata.agregarEstadoFinal(6);
		automata.agregarEstadoFinal(8);
		automata.agregarEstadoFinal(12);
		String cadenita = "0.0E+0.0";
		System.out.println("Cadena a probar:" + cadenita);
		boolean pasa = automata.probar(cadenita);
		if(pasa) {
			System.out.println("Es real");			
		}else {
			System.out.println("No es real");
		}
		System.out.println("FIN");
	}

}
