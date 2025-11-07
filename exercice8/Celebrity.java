package exercice8;

import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Celebrity {
	
	
	// Créer une hashmap vide avec des clé Integer contenant des listes.
	static HashMap<Integer, List<Integer>> guests = new HashMap<>();
	
    // Créer une liste vide d'Integer de celebrities
    static List<Integer> celebrities = new ArrayList<>();
    
 // Créer une liste vide d'Integer de quidam
    static List<Integer> quidam = new ArrayList<>();
	
	
	public static void main(String[] args) {
		
		

        guests.put(1, Arrays.asList(1, 2, 3, 4, 5, 6, 7,  8));        // Albert
        guests.put(2, Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));		 // Bénédicte
        guests.put(3, Arrays.asList(1, 2, 3, 4, 5, 6, 7,  8));     // Christophe
        guests.put(4, Arrays.asList(1, 2, 3, 4, 5, 6, 7,  8));  // Delphine
        guests.put(5, Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));  // Edouard
        guests.put(6, Arrays.asList(1, 2, 3, 4, 5, 6, 7,  8));              	 // Françoise
        guests.put(7, Arrays.asList(1, 2, 3, 4, 5, 6, 7,  8));  				 // Gaston
        guests.put(8, Arrays.asList(1, 2, 3, 4, 5, 6, 7,  8));  	 // Héloïse
        

        
        
        // Boucle dans les clés des guests puis reboucle a chaque itération encore dans guests.
        // Pour tous les guests non identiques vérifie si un guest contient un autre guest. Si oui augmente le compteur de 1.
        for (Integer guest1 : guests.keySet() ) {
        	int counter = 0;
        	for (Integer guest2 : guests.keySet()) {
        		if (!guest1.equals(guest2)) { // Car ne peut pas se contenir lui-même.
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
        
        addAndRemoveCelebrityAndQuidam(celebrities, quidam);
        

        System.out.println("Celebrities:" + celebrities);
        System.out.println("Quidam:" + quidam);
	}
	
	public static boolean checkCelebrity(Integer celebrity, List<Integer> quidam, HashMap<Integer, List<Integer>> guests) {
		
		boolean isCelebrity = true;
		
			for (int i = 0; i < quidam.size(); i++) {
				if (guests.get(celebrity).contains(quidam.get(i))) {
					isCelebrity = false;
				}
			}
		return isCelebrity;
	}
	
	public static void addAndRemoveCelebrityAndQuidam(List<Integer> celebrities, List<Integer> quidam) {
		for (int i = 0; i < celebrities.size(); i++) {
        	if (!checkCelebrity(celebrities.get(i), quidam, guests)) {
        		quidam.add(celebrities.get(i));
        		celebrities.remove(i);
        		addAndRemoveCelebrityAndQuidam(celebrities, quidam);
        	}
        }
	}
}
