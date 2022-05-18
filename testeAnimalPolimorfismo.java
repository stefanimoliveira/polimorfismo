package heranca;

public class testeAnimalPolimorfismo {

	public static void main(String[] args) {
		cachorro pet= new cachorro("bob",5,"auau","perfeita");
		pet.imprimir();
		pet.info();
		pet.som();
		
		cavalo horse = new cavalo("tornado",3,"relicha","veloz");
		horse.imprimir();
		horse.info();
		horse.som();
		
		preguica preguica=new preguica("bela",4,"aaaa","lentamente");
		preguica.imprimir();
		preguica.info();
		preguica.som();
		
	}

}
