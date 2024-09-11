package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Commande permettant d'ajouter du texte dans un document.
 */
public class CommandeAjouter extends CommandeDocument {

    /**
     * Constructeur de la commande d'ajout de texte.
     * @param document Le document dans lequel le texte sera ajouté.
     * @param parameters Les paramètres de la commande, où le second élément est le texte à ajouter.
     */
    public CommandeAjouter(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Exécute la commande d'ajout de texte.
     * Vérifie que les paramètres sont corrects, puis ajoute le texte au document.
     * <p>Format attendu pour les paramètres : "ajouter;texte"</p>
     */
    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : ajouter;texte");
            return;
        }
        String texte = parameters[1];
        this.document.ajouter(texte);
        super.executer();
    }
}
