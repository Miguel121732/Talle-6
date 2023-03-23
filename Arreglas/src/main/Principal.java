package main;
import puntoSiete.Promedios;

import java.util.Scanner;

import puntoNueve.Deck;
import puntoNueve.Hand;
import puntoOcho.Algebra;

public class Principal {
	
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("--Punto 7--\n");
		Promedios cp = new Promedios();
		cp.CalcularPromedio();
		
		System.out.println("\n--Punto 8--\n");
		Algebra ag = new Algebra();
		ag.Calculadora();
		
		System.out.println("\n--Punto 9--\n");
		Deck deck = new Deck(); 
		deck.barajar();
		
		Hand crupier = new Hand(deck.reparto(),deck.reparto());
		Hand jugador = new Hand(deck.reparto(),deck.reparto());
		int puntosJugador=0,puntosCrupier=0;
		
		System.out.println("Este es tu mazo.");
		jugador.display();puntosJugador=jugador.getPuntos();
		System.out.println("\nTu tienes " + puntosJugador + " puntos.");
		int choice = 1;while(choice == 1 && puntosJugador < 21 && jugador.numeroCartas < 5){
			System.out.println("Quieres otra tarjeta?");
			System.out.println("1. Si");
			System.out.println("2. No");
			choice = in.nextInt();
		
		if(choice == 1){
			jugador.maxCartas(deck.reparto());
		System.out.println("Este es tu mazo.");
		    jugador.display();puntosJugador = jugador.getPuntos();
		System.out.println("\nTu tienes " + puntosJugador + " puntos.");
		}
		
		}
		
		puntosCrupier = crupier.getPuntos();
		
		while(puntosCrupier < 16 && crupier.numeroCartas < 5){
			crupier.maxCartas(deck.reparto());
			puntosCrupier=crupier.getPuntos();
			
		}
		
		System.out.println("El repartidos tiene: ");
		crupier.display();
		System.out.println("El repartidor tiene " + puntosCrupier + " puntos.\n");
		
		
		if(puntosJugador > 21)
			System.out.println("**Jugador arrestado. Gana el crupier.**");
		else if(puntosCrupier > 21)
			System.out.println("**Crupier arrestado. Jugador gana.**");
		else if(puntosCrupier>puntosJugador)
			System.out.println("**Crupier gana.**");
		else if(puntosCrupier<puntosJugador)
			System.out.println("**Jugador gana.**");
		else if(puntosCrupier==puntosJugador)
			System.out.println("**Crupier y jugador empatados.**");
		
		}
			
	}

 