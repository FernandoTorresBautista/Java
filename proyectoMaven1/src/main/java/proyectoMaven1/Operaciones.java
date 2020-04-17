package proyectoMaven1;

import java.util.Scanner;

public class Operaciones {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int num1, num2;
		System.out.println("Suma dos numeros, de cada uno a continuación: ");
		num1 = reader.nextInt();
		num2 = reader.nextInt();
		Suma s = new Suma(num1, num2);
		System.out.println("La suma: " + s.sumar());
	}

}
