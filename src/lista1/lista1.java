package lista1;

public class lista1 {

	public static void main(String[] args) {
		
		int A = 20;
		int B = 22;
		
		System.out.println("Variáveis usadas A:" + A + " B:" + B);
				
		// exercício 1
		System.out.println("\nExercício 1\n");	
		if (A > 10) 
			System.out.println("A > 10");
		if (A + B == 20) 
			System.out.println("A + B == 20");
		else
			System.out.println("Número não válido");
		
		// exercicio 2
		System.out.println("\nExercício 2 \n");
		if (A < 10 && !(A + B == 20)) 
			System.out.println("A < 10");
		else if (A + B == 20 && !(A < 10)) 
			System.out.println("A + B == 20");
		else
			System.out.println("Número não válido");
		
		// exercicio 3
		System.out.println("\nExercício 3 \n");
		if (A == 10) 
			System.out.println("A == 10");
		if (A + B == 20) 
			System.out.println("A + B == 20");
		if (B == 10)
			System.out.println("B == 10");
		
		// exercicio 4
		System.out.println("\nExercício 4 \n");
		if (A > 10 || A + B == 20)
			System.out.println("Número válido");
		else if (A == B)
			System.out.println("A é igual B; A e B são diferentes de 10; A é menor que 10");
		else 
			System.out.println("Número não válido");	
				
				
		// exercicio 5
		System.out.println("\nExercício 5 \n");
		if (A > 10 || A + B == 20)
			System.out.println("Número válido");
		else
			System.out.println("Número não válido");
		
		// exercício 6
		System.out.println("\nExercício 6 \n");
		if (A > 10)
			System.out.println("A > 10");
		else
			System.out.println("A <= 10");
		if (A + B == 20)
			System.out.println("A + B == 20");
		else 
			System.out.println("A + B != 20");
				
				
		// exercício 7
		System.out.println("\nExercício 7 \n");
		if (A > 10)	{
			if (A + B == 20)
				System.out.println("Números válidos");
		} else 
			System.out.println("Número não válido");
						
		// exercício 8
		System.out.println("\nExercício 8 \n");
		if (A > 10 )
			System.out.println("A > 10");
		else
			System.out.println("Número não válido");
		if (A + B == 20) 
			System.out.println("A + B == 20");
		else
			System.out.println("Número não válido");
		
		// exercício 9
		System.out.println("\nExercício 9 \n");
		if (A > 10 && A + B == 20)
			System.out.println("A + B == 20");
		else
			System.out.println("Número não válido");
		
		// exercício 10
		System.out.println("\nExercício 10 \n");
		if (!(A > 10))
			System.out.println("Número menor que 10");
		if (!(A + B == 20))
			System.out.println("Número diferente de 20");
		
		// exercício 11
		System.out.println("\nExercício 11 \n");
		if (!(A > 10)) {
			if (A + B == 20)
				System.out.println("A + B == 20");
			else 
				System.out.println("Número não válido");
		}
			
		// exercício 12
		System.out.println("\nExercício 12 \n");
		if (A > 10 ) {
			System.out.println("A > 10");
			if (A + B == 20) 
				System.out.println("A + B == 20");
		}else if (A + B == 20)
			System.out.println("A + B == 20");
		else
			System.out.println("Números não válidos");
		System.out.println("Sejam bem-vindos à disciplina de Técnicas de Programação \n");
		
		// exercício 13
		System.out.println("\nExercício 13 \n");
		if (A > 10) {
			System.out.println("A > 10");
			if (A + B == 20)
				System.out.println("A + B == 20");
		} else if (!(A + B == 20))
			System.out.println("Números não válidos");
		
		// exercício 14
		System.out.println("\nExercício 14 \n");
		if (A > 10) {
			System.out.println("A > 10");
			if (A + B == 20)
				System.out.println("A + B == 20");
			else 
				System.out.println("Número não válido");
		}
		
		// exercício 15
		System.out.println("\nExercício 15 \n");
		if (A < 10 ) {
			System.out.println("A < 10");
			if (A + B == 20) 
				System.out.println("A + B == 20");
		}else if (A + B == 20)
			System.out.println("A + B == 20");
		else
			System.out.println("Números não válidos");
		
		// exercício 16
		System.out.println("\nExercício 16 \n");
		if (A == 10)
			System.out.println("A == 10");
		if (A + B == 20)
			System.out.println("A + B == 20");
		if (B == 10)
			System.out.println("B == 10");
		
		// exercício 17
		System.out.println("\nExercício 17 \n");
		if (A > 10 || A + B == 20)
			System.out.println("Número válido");
		else {
			if (A == B)
				System.out.println("A == B");
			if (B != 10 && A < 10)
				System.out.println("A é menor que 10");
			else
				System.out.println("Número não válido");
		}
		
		// exercício 18
		System.out.println("\nExercício 18 \n");
		if (A > 10 || A + B == 20)
			System.out.println("Número válido");
		else 
			System.out.println("Número não válido");
	
		// exercício 19
		System.out.println("\nExercício 19 \n");
		if (A > 10)
			System.out.println("A > 10");
		else
			System.out.println("A <= 10");
		if (A + B == 20)
			System.out.println("A + B == 20");
		else
			System.out.println("A + B != 20");
		
		// exercício 20
		System.out.println("\nExercício 20 \n");
		if (A > 10 || A + B == 20)
			System.out.println("Números válidos");
		else 
			System.out.println("Número não válido");
		System.out.println("Sejam bem-vindos à disciplina de Técnicas de Programação.");
		
		
	}

}
