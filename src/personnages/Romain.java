package personnages;

public class Romain {
	private String nom;
	private int force;
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println("Le romain "+nom + ":«" + texte + "»");
	}
	public void recevoirCoup(int force) {
		this.force= this.force - force;
		if (this.force<0) {
			this.force=0;
			
		}
		if (this.force==0) {
			parler("j'abondonne");
		}
		else {
			parler("Aie!");
		}
	}
}
