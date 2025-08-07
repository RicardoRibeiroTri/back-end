package dia6do8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Pessoa p1 = new Pessoa();
		
		System.out.print("Bem Vindo! Define seu nome: ");
		p1.setNome(sc.nextLine());

		System.out.print("Agora defina sua idade: ");
		p1.setIdade(sc.nextInt());
		
		sc.close();
		
	}

}
