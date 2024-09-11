package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

import java.util.Objects;

/**
 * Commande permettant de remplacer une partie du texte d'un document entre deux positions spécifiées.
 * Si aucun texte de remplacement n'est fourni, le texte est remplacé par une chaîne vide (équivalent à un effacement).
 */
public class CommandeRemplacer extends CommandeDocument {

    /**
     * Constructeur de la commande de remplacement de texte.
     * @param document Le document dans lequel une partie du texte sera remplacée.
     * @param parameters Les paramètres de la commande, où le premier est la position de début, le second est la position de fin, et le troisième (facultatif) est le texte de remplacement.
     */
    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Exécute la commande de remplacement de texte.
     * Récupère les positions de début et de fin ainsi que le texte de remplacement (ou une chaîne vide si absent), puis remplace le texte correspondant dans le document.
     * <p>Format attendu : "remplacer;debut;fin;[texte]"</p>
     * Si le texte de remplacement n'est pas fourni, le texte entre les positions est effacé.
     */
    @Override
    public void executer() {
        int debut = Integer.parseInt(parameters[1]); // Récupère la position de début
        int fin = Integer.parseInt(parameters[2]);   // Récupère la position de fin

        if (parameters.length < 3 || Objects.equals(parameters[3], "")) {
            this.document.remplacer(debut, fin, ""); // Remplace par une chaîne vide (effacement)
            super.executer();
        } else {
            String remplacement = parameters[3];      // Récupère le texte de remplacement
            this.document.remplacer(debut, fin, remplacement); // Remplace le texte dans le document
            super.executer();
        }
    }
}
