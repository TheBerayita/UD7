package UD7;

import java.util.*;

import javax.swing.JOptionPane;

public class Ej1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		crearTable();
	}

	public static void crearNotas(Hashtable notas) {
		int primerEx[] = new int[notas.size()];
		int segundoEx[] = new int[notas.size()];
		int index = 0;
		Enumeration<String> nombres = notas.keys();
		while (nombres.hasMoreElements()) {
			String nomActu = nombres.nextElement();
			int nota1 = Integer
					.parseInt(JOptionPane.showInputDialog("Introduce la nota del primer examen de " + nomActu));
			primerEx[index] = nota1;
			int nota2 = Integer
					.parseInt(JOptionPane.showInputDialog("Introduce la nota del segundo examen de " + nomActu));
			segundoEx[index] = nota2;
			notas.replace(nomActu, calcularMedia(primerEx[index], segundoEx[index]));
			index++;
		}
		mostarNotas(notas);
	}

	public static void mostarNotas(Hashtable notas) {
		Enumeration<String> nombres = notas.keys();
		Enumeration<Integer> nota = notas.elements();
		for (int i = 0; i < notas.size(); i++) {
			System.out.println("Nota media de " + nombres.nextElement() + " es: " + nota.nextElement());
		}
	}

	public static int calcularMedia(int nota, int nota2) {
		int notaMedia = (nota + nota2) / 2;
		return notaMedia;
	}

	public static void crearTable() {
		Hashtable<String, Integer> notas = new Hashtable<String, Integer>();
		int cantidadAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Introduce cuantosa alumnos hay "));
		for (int i = 0; i < cantidadAlumnos; i++) {
			notas.put(JOptionPane.showInputDialog("Nombre del alumno "), 0);
		}
		crearNotas(notas);
	}

}
