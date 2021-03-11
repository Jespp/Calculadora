import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner reader= new Scanner (System.in);
		String com="HELP";
		do{
		
		
		if (com.equals("QUIT")){
			reader.close();
			break;
		}else if (com.isEmpty()){
			System.out.println("Debe escribir algo... ");
		}else if (com.equals("HELP")) {
			System.out.println("╔═══════════════════════════════════╗");
			System.out.println("║    Comandos de la calculadora     ║");
			System.out.println("╠═══════════════════════════════════╣");
			System.out.println("║ SUM    para sumar                 ║");
			System.out.println("║ RES    para restar                ║");
			System.out.println("║ MUL    para multiplicar           ║");
			System.out.println("║ DIV    para dividir               ║");
			System.out.println("║ MOD    para módulo de la división ║");
			System.out.println("║ POT    para potencia              ║");
			System.out.println("║ HELP   Ayuda                      ║");
			System.out.println("║ QUIT   Salir                      ║");
			System.out.println("╚═══════════════════════════════════╝");
			
		}else if (com.equals("SUM")) {
			System.out.print("Primer sumando: ");
			Float op1=Float.parseFloat(reader.nextLine());
			System.out.print("Segundo sumando: ");
			Float op2=Float.parseFloat(reader.nextLine());
			System.out.println(op1+" + "+op2+" = "+(op1+op2));
		}else if (com.equals("RES")) {
			System.out.print("Minuendo: ");
			Float op1=Float.parseFloat(reader.nextLine());
			System.out.print("Sustraendo: ");
			Float op2=Float.parseFloat(reader.nextLine());
			System.out.println(op1+" - "+op2+" = "+(op1-op2));
		}else if (com.equals("MUL")) {
			System.out.print("Multiplicando: ");
			Float op1=Float.parseFloat(reader.nextLine());
			System.out.print("Multiplicador: ");
			Float op2=Float.parseFloat(reader.nextLine());
			System.out.println(op1+" X "+op2+" = "+(op1*op2));
		}else if (com.equals("DIV")) {
			System.out.print("Dividendo: ");
			Float op1=Float.parseFloat(reader.nextLine());
			System.out.print("Divisor: ");
			Float op2=Float.parseFloat(reader.nextLine());
			System.out.println(op1+" / "+op2+" = "+(op1/op2));
		}else if (com.equals("MOD")) {
			System.out.print("Dividendo: ");
			Float op1=Float.parseFloat(reader.nextLine());
			System.out.print("Divisor: ");
			Float op2=Float.parseFloat(reader.nextLine());
			System.out.println("Al dividir "+op1+" entre "+op2+" da resto "+(op1%op2));
		}else if (com.equals("POT")) {
			System.out.print("Base: ");
			Float op1=Float.parseFloat(reader.nextLine());
			System.out.print("Exponente: ");
			Float op2=Float.parseFloat(reader.nextLine());
			System.out.println(op1+" a la "+op2+" = "+(Math.pow(op1,op2)));
		}else{
			System.out.println("Escriba un comando válido (Help para ayuda)");
		}
		
		System.out.print("\nIntroduzca comando: ");
		com=reader.nextLine();
		com=com.toUpperCase();
		
		
		}while (true);
	}

}
