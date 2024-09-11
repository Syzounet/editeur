package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Commande permettant d'insérer du texte à une position spécifique dans un document.
 */
public class CommandeInserer extends CommandeDocument {

    /**
     * Constructeur de la commande d'insertion de texte.
     * @param document Le document dans lequel le texte sera inséré.
     * @param parameters Les paramètres de la commande, où le premier élément est la position et le second est le texte à insérer.
     */
    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Exécute la commande d'insertion de texte.
     * Récupère la position d'insertion et le texte à partir des paramètres, puis insère le texte au bon emplacement dans le document.
     */
    @Override
    public void executer() {
        int position = Integer.parseInt(parameters[1]); // permet de récupérer la position d'insertion
        String texte = parameters[2]; // permet de récupérer le texte à insérer

        this.document.inserer(position, texte); // insère le texte à la position spécifiée dans le document
        super.executer();
    }
}
