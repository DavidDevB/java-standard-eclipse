package exercice8;

import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Celebrity {
	
	public static void main(String[] args) {
		
		// Créer une hashmap vide avec des clé Integer contenant des listes.
		HashMap<Integer, List<Integer>> guests = new HashMap<>();

        guests.put(1, Arrays.asList(2, 5, 6));        // Albert
        guests.put(2, Arrays.asList(3, 5, 6));		  // Bénédicte
        guests.put(3, Arrays.asList(2, 4, 5, 6));     // Christophe
        guests.put(4, Arrays.asList(1, 2, 5, 6, 8));  // Delphine
        guests.put(5, Arrays.asList(6));              // Edouard
        guests.put(6, Arrays.asList(5));              // Françoise
        guests.put(7, Arrays.asList(2, 3, 5, 6, 8));  // Gaston
        guests.put(8, Arrays.asList(2, 4, 5, 6, 7));  // Héloïse
        
        // Créer une liste vide d'Integer de celebrities
        List<Integer> celebrities = new ArrayList<>();
        
     // Créer une liste vide d'Integer de quidam
        List<Integer> quidam = new ArrayList<>();
        
        
        // Boucle dans les clés des guests puis reboucle a chaque itération encore dans guests.
        // Pour tous les guests non identiques vérifie si un guest contient un autre guest. Si oui augmente le compteur de 1.
        for (Integer guest1 : guests.keySet() ) {
        	int counter = 0;
        	for (Integer guest2 : guests.keySet()) {
        		if (!guest1.equals(guest2)) {
        			if (guests.get(guest2).contains(guest1)) {
        				counter++;
        			}
        		}
        	}
        	
        	// Compare le compteur au total de guests moins le guest en question.
        	// Si égal ajoute le guest à celebrities, sinon l'ajoute aux quidam.
        	int totalOfKeys = guests.size() - 1;
        	if (totalOfKeys == counter) {
        		celebrities.add(guest1);
        	} else {
        		quidam.add(guest1);
        	}
        }
        System.out.println("Celebrities:" + celebrities);
        System.out.println("Quidam:" + quidam);
	}
}
