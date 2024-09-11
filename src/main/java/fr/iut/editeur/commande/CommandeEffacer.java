package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Commande permettant d'effacer une partie du texte d'un document entre deux positions spécifiées.
 */
public class CommandeEffacer extends CommandeDocument {

    /**
     * Constructeur de la commande d'effacement de texte.
     * @param document Le document dans lequel une partie du texte sera effacée.
     * @param parameters Les paramètres de la commande, où le premier élément est la position de début et le second est la position de fin de la zone à effacer.
     */
    public CommandeEffacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Exécute la commande d'effacement de texte.
     * Vérifie que les paramètres sont bien fournis (positions de début et de fin), puis efface le texte entre ces deux positions dans le document.
     * <p>Format attendu : "effacer;debut;fin"</p>
     */
    @Override
    public void executer() {
        if (parameters.length < 3) {
            System.err.println("Format attendu : effacer;debut;fin");
            return;
        }
        int debut = Integer.parseInt(parameters[1]); // Récupère la position de début
        int fin = Integer.parseInt(parameters[2]);   // Récupère la position de fin
        this.document.effacer(debut, fin);           // Efface le texte entre les positions début et fin
        super.executer();
    }
}
