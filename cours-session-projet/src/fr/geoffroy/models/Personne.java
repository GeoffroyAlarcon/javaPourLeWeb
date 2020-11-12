package fr.geoffroy.models;

public class Personne {
private int num;
private String prenom;
private String nom;
public Personne(int num, String prenom, String nom) {
	super();
	this.num = num;
	this.prenom = prenom;
	this.nom = nom;
}
public Personne( String prenom, String nom) {
	super();
	this.num = 0;
	this.prenom = prenom;
	this.nom = nom;
}
	public Personne() {
		super();
}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "Personne [num=" + num + ", prenom=" + prenom + ", nom=" + nom + "]";
	}
	
}
