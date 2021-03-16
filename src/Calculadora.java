import java.util.Scanner;
import java.util.ArrayList;
public class Calculadora {

	public static void main(String[] args) {
		
		Scanner reader= new Scanner (System.in);
		ArrayList keywords= new ArrayList();
		keywords.add("SUM");
		keywords.add("RES");
		keywords.add("MUL");
		keywords.add("DIV");
		keywords.add("MOD");
		keywords.add("POT");
		
		String com="HELP";
		
		do{
			if (com.isEmpty()) {
				System.out.println("Debe escribir algo... ");
			}else if(com.equals("QUIT")){
					reader.close();
					break;
			}else if(com.equals("HELP")){
				getHelp();
			}else if(keywords.contains(com)) {
				getOperators(com);
				
			}else { 
				System.out.println("Escriba un comando válido (Help para ayuda)");
			}
			
			System.out.print("\nOperación : ");
			com=reader.nextLine();
			com=com.toUpperCase();
		
		}while (true);
	} //end Main
	
	
	
	// METHODS
	
public static void getHelp(){
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
}
public static void getOperators(String com) {
	Scanner reader= new Scanner(System.in);
	System.out.print("Primer operador: ");
	Float op1=Float.parseFloat(reader.nextLine());
	System.out.print("Segundo operador: ");
	Float op2=Float.parseFloat(reader.nextLine());
	switch (com) {
	
	case "SUM":
		doSum(op1,op2);
		break;

	case "RES":
		doRes(op1,op2);
		break;

	case "MUL":
		doMul(op1,op2);
		break;

	case "DIV":
		doDiv(op1,op2);
		break;

	case "MOD":
		doMod(op1,op2);
		break;

	case "POT":
		doPot(op1,op2);
		break;
	}
}
public static void doSum(float op1, float op2){
	System.out.println(op1+" + "+op2+" = "+(op1+op2));
}

public static void doRes(float op1, float op2){
	System.out.println(op1+" - "+op2+" = "+(op1-op2));
}

public static void doMul(float op1, float op2){
	System.out.println(op1+" X "+op2+" = "+(op1*op2));
}

public static void doDiv(float op1, float op2){
	if (op2==0) {
		System.out.println("División por cero!!");
	}else{
		System.out.println(op1+" / "+op2+" = "+(op1/op2));
	}
}

public static void doMod(float op1, float op2){
	if (op2==0) {
		System.out.println("División por cero!!");
	}else{
		System.out.println("Al dividir "+op1+" entre "+op2+" da resto "+(op1%op2));
	}
}

public static void doPot(float op1, float op2){	
	System.out.println(op1+" a la "+op2+" = "+(Math.pow(op1,op2)));
}

}
