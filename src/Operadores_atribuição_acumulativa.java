import java.util.Locale;
import java.util.Scanner;

public class Operadores_atribuição_acumulativa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		double conta = 50.0;
		
		if (minutos > 100) {
			// conta = conta + (minutos - 100) * 2.0;
			conta += (minutos - 100) * 2.0;
		}

			System.out.printf("O valor da conta é R$ %.2f" , conta);

		/*
		 a += b;  == a = a + b;
		 a -= b;  == a = a - b;
		 a *= b;  == a = a * b;
		 a /= b;  == a = a / b;
		 a %= b;  == a = a % b;
		 */
	}

}
