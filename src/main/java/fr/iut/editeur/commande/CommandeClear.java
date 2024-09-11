package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Commande permettant de vider entièrement le contenu d'un document.
 */
public class CommandeClear extends CommandeDocument {

    /**
     * Constructeur de la commande pour effacer tout le contenu d'un document.
     * @param document Le document à vider de son contenu.
     * @param parameters Les paramètres de la commande (non utilisés ici mais nécessaires pour la structure générale des commandes).
     */
    public CommandeClear(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Exécute la commande de vidage du document.
     * Cette méthode appelle la fonction `clear` du document pour supprimer tout son contenu.
     */
    @Override
    public void executer() {
        this.document.clear(); // Efface tout le contenu du document
        super.executer();
    }
}
