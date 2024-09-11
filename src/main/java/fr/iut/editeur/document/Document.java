package fr.iut.editeur.document;

/**
 * Classe représentant un document contenant du texte manipulable.
 * Permet l'ajout, la suppression, la modification, et la mise en majuscules de parties du texte.
 */
public class Document {

    /**
     * Le texte contenu dans le document.
     */
    private String texte;

    /**
     * Constructeur de la classe Document initialisant le texte à une chaîne vide.
     */
    public Document() {
        this.texte = "";
    }

    /**
     * Récupère le texte du document.
     * @return Le texte actuel du document.
     */
    public String getTexte() {
        return texte;
    }

    /**
     * Remplace le texte du document par un nouveau texte.
     * @param texte Le nouveau texte à définir.
     */
    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * Ajoute du texte à la fin du document.
     * @param texte Le texte à ajouter.
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    /**
     * Efface une partie du texte entre deux positions spécifiées.
     * @param debut La position de début (incluse) dans le texte.
     * @param fin La position de fin (incluse) dans le texte.
     */
    public void effacer(int debut, int fin) {
        this.remplacer(debut, fin, "");
    }

    /**
     * Vide entièrement le contenu du document.
     */
    public void clear() {
        this.texte = "";
    }

    /**
     * Remplace une portion du texte entre deux positions par un nouveau texte.
     * @param debut La position de début (incluse) de la portion à remplacer.
     * @param fin La position de fin (incluse) de la portion à remplacer.
     * @param remplacement Le texte de remplacement.
     */
    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    /**
     * Convertit en majuscules une partie du texte entre deux positions.
     * @param debut La position de début (incluse) de la portion à convertir en majuscules.
     * @param fin La position de fin (incluse) de la portion à convertir en majuscules.
     */
    public void majuscules(int debut, int fin) {
        remplacer(debut, fin, texte.substring(debut, fin + 2).toUpperCase());
    }

    /**
     * Insère un texte à une position donnée dans le document.
     * @param position La position où insérer le texte.
     * @param texteAInserer Le texte à insérer.
     */
    public void inserer(int position, String texteAInserer) {
        String partieGauche = texte.substring(0, position);
        String partieDroite = texte.substring(position);
        texte = partieGauche + texteAInserer + partieDroite;
    }

    /**
     * Retourne le contenu actuel du document sous forme de chaîne de caractères.
     * @return Le texte du document.
     */
    @Override
    public String toString() {
        return this.texte;
    }
}
