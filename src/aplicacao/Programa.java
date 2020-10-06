package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Colaborador;
import entidades.ColaboradorTerceiro;

public class Programa {

	public static void main(String[] args) {
	
	 Locale.setDefault(Locale.getDefault());
	 Scanner sc = new Scanner(System.in);
	 
	 List<Colaborador> list = new ArrayList<>();
	 
	 System.out.print("Insira a quantidade de colaboradores: ");
	 int n = sc.nextInt();
	 
	 for (int i=1; i<=n; i++) {
		 System.out.println( i + "# Colaborador: ");
		 System.out.print("É terceiro (s/n)? ");
		 char ch = sc.next().charAt(0);
		 System.out.print("Nome: ");
		 sc.nextLine();
		 String nome = sc.nextLine();
		 System.out.print("Horas: ");
		 int horas = sc.nextInt();
		 System.out.print("Valor por hora: ");
	     double valorPorHora = sc.nextDouble();
	     
		 if (ch == 's') {
			 System.out.println("Hora Adicionals: ");
			 double horaAdicional = sc.nextDouble();
			 list.add(new ColaboradorTerceiro(nome, horas, valorPorHora, horaAdicional));
		 }
		 else {
			 list.add(new Colaborador(nome, horas, valorPorHora));
		 }
	 }
	 System.out.println();
	 System.out.println("PAGAMENTOS: ");
	 for (Colaborador terceiro: list) {
		 System.out.println(terceiro.getNome() + " - $ " + String.format("%.2f", terceiro.pagamento()));
	 }
	 
	 sc.close();
	}
}
