package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    public void effacer(int debut, int fin) {
        this.remplacer(debut, fin, "");
    }

    public void clear() {
        this.texte = "";
    }

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }
    public void majuscules(int debut, int fin) {
        remplacer(debut, fin, texte.substring(debut, fin + 1).toUpperCase());
    }

    @Override
    public String toString() {
        return this.texte;
    }
}
