package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Classe abstraite représentant une commande manipulant un document.
 * Cette classe sert de base pour toutes les commandes qui modifient un document.
 */
public abstract class CommandeDocument implements Commande {

    /**
     * Le document sur lequel la commande agit.
     */
    protected Document document;

    /**
     * Les paramètres de la commande, sous forme de tableau de chaînes de caractères.
     */
    protected String[] parameters;

    /**
     * Constructeur de la commande de document.
     * @param document Le document sur lequel la commande sera appliquée.
     * @param parameters Les paramètres de la commande, spécifiques à chaque type de commande.
     */
    public CommandeDocument(Document document, String[] parameters) {
        this.document = document;
        this.parameters = parameters;
    }

    /**
     * Exécute la commande de document.
     * Par défaut, cette méthode affiche le contenu actuel du document.
     */
    @Override
    public void executer() {
        System.out.println(this.document);
    }
}
