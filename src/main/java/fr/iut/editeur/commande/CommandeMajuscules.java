package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Commande permettant de convertir en majuscules une partie du texte d'un document entre deux positions spécifiées.
 */
public class CommandeMajuscules extends CommandeDocument {

    /**
     * Constructeur de la commande de conversion en majuscules.
     * @param document Le document dans lequel une partie du texte sera convertie en majuscules.
     * @param parameters Les paramètres de la commande, où le premier est la position de début et le second est la position de fin de la zone à convertir.
     */
    public CommandeMajuscules(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Exécute la commande de conversion en majuscules.
     * Vérifie que les positions de début et de fin sont bien fournies, puis convertit le texte entre ces deux positions en majuscules.
     * <p>Format attendu : "majuscules;debut;fin"</p>
     */
    @Override
    public void executer() {
        if (parameters.length < 3) {
            System.err.println("Format attendu : majuscules;debut;fin");
            return;
        }

        int debut = Integer.parseInt(parameters[1]); // Récupère la position de début
        int fin = Integer.parseInt(parameters[2]);   // Récupère la position de fin
        this.document.majuscules(debut, fin);        // Convertit la partie du texte en majuscules
        super.executer();
    }
}
