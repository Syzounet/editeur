package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument{

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer(){
        if(parameters.length < 4) {
            System.err.println("Format attendu : remplacer;debut;fin;remplacement");
            return;
        }


        int debut = Integer.parseInt(parameters[1]); // permet de récupérer le premier paramètre de la commande
        int fin = Integer.parseInt(parameters[2]);   // permet de récupérer le deuxième paramètre de la commande
        String remplacement = parameters[3];
        this.document.remplacer(debut, fin, remplacement); // permet de remplacer le texte
        super.executer();

    }
}
