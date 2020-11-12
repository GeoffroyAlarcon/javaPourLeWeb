package fr.geoffroy.services;

import java.util.ArrayList;
import java.util.List;
import fr.geoffroy.models.Personne;
public class PersonneService {
	private ArrayList<Personne> personnes = new ArrayList<>();
	public PersonneService() {
		this.personnes.addAll(List.of(
				new Personne(1,"mitro", "glou"),
				new Personne(2,  "florian","thauvin"),
				new Personne(3,  "kylian","mbappé")
		));
	}
	public ArrayList<Personne> findAll() {
		return this.personnes;
	}
	public void save(Personne personne) {
		this.personnes.add(personne);
	}
	public void update(Personne p) {
		for (int i = 0; i < personnes.size(); i++) {
			if (personnes.get(i).getNum() == p.getNum()) {
				personnes.set(i, p);
			}
		}
	}

	
	
	public Personne findById(int num) {
		for (int i = 0; i < personnes.size(); i++) {
			if (personnes.get(i).getNum() == num) {
				return personnes.get(i);
			}
		}
		return null;
	}
	public void remove(int num) {
	for (int i = 0; i < personnes.size(); i++) {
		if (personnes.get(i).getNum() == num) {
			personnes.remove(personnes.get(i));
		}
	}
	
}
	public boolean findByNomAndPrenom(String nom, String prenom) {
		for (int i = 0; i < personnes.size(); i++) {
			if (personnes.get(i).getNom().equals(nom) && personnes.get(i).getPrenom().equals(prenom)) {
				return true;
			} ;
		}
		return false;
	}
}