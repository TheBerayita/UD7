package UD7;

import java.util.*;
import javax.swing.JOptionPane;

public class Ej2 {
	public static ArrayList<Integer> carrito = new ArrayList<Integer>();

	public static void main(String[] args) {

		crearCarrito();
	}

	public static void crearCarrito() {
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos comprados"));
		for (int i = 0; i < cantidad; i++) {
			int precio = Integer.parseInt(JOptionPane.showInputDialog("Precio del producto " + (i + 1)));
			carrito.add(precio);
		}
		mostrar();
	}

	public static double iva(int producto, String ivaAplicado) {
		double precioCalculado = 0;
		switch (ivaAplicado) {
		case "21%":
			precioCalculado = producto + (producto * 0.21);
			break;
		case "4%":
			precioCalculado = producto + (producto * 0.04);
			break;
		default:
			System.out.println("Introduce un porcentaje valido");
			break;
		}
		return precioCalculado;
	}

	public static void mostrar() {
		String ivaAplicado = JOptionPane.showInputDialog("IVA aplicado: 21% o 4%");
		for (int i = 0; i < carrito.size(); i++) {
			System.out.println("Producto " + (i + 1) + " tiene un precio bruto de " + carrito.get(i)
					+ " y un precio con iva de " + iva(carrito.get(i), ivaAplicado));
		}
		System.out.println("Numero de productos comprados: " + carrito.size());
		cobrar();
	}

	public static void cobrar() {
		int total = 0;
		for (int i = 0; i < carrito.size(); i++) {
			total = total + carrito.get(i);
		}
		System.out.println("Total a pagar: " + total);
		int pagar = Integer.parseInt(JOptionPane.showInputDialog("Cantidad pagada"));
		System.out.println("Cambio a devolver: " + (pagar - total));
	}
}
