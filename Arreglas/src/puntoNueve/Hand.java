package puntoNueve;


public class Hand {
	
	Card[] cardArray = new Card[5];
	public int numeroCartas = 0;
	public Hand(Card c1,Card c2){
		cardArray[0] = c1;
		cardArray[1] = c2;
		numeroCartas=2;
	
	}
	
	public int getPuntos(){
		
		int puntos = 0;
		for(int i = 0; i < numeroCartas; i++)
			puntos += cardArray[i].puntos;
		if(puntos > 21) {
			puntos = 0;
		boolean aceFound = false;
		for(int i = 0; i < numeroCartas; i++){
				if(!aceFound){
					String a = "Ace";
		if(a.equals(cardArray[i].name) && cardArray[i].puntos == 11){
			cardArray[i].puntos =1;
			aceFound=true;
			}
		}
		
		puntos += cardArray[i].puntos;
		
		}
		
		}return puntos;
		
	}
	
	public void display(){
		for(int i = 0; i < numeroCartas; i++)
			System.out.println(cardArray[i]);
		}
	
	public void maxCartas(Card c){
		if(numeroCartas >= 5){
			System.out.println("El número máximo de tarjetas es 5.");
			return;
			
		}
		cardArray[numeroCartas] = c;numeroCartas++;}
	}

	
	