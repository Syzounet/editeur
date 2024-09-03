package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument{

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer(){
        if(parameters.length < 3) {
            System.err.println("Format attendu : remplacer;debut;fin;remplacement");
            return;
        }


        int debut = Integer.parseInt(parameters[1]); // permet de récupérer le premier paramètre de la commande
        int fin = Integer.parseInt(parameters[2]);   // permet de récupérer le deuxième paramètre de la commande
        if (parameters[3].equals("")){
            this.document.remplacer(debut, fin, "");
            super.executer();
        }else {
            String remplacement = parameters[3]; // permet de récupérer le troisième paramètre de la commande
            this.document.remplacer(debut, fin, remplacement); // permet de remplacer le texte
            super.executer();
        }

    }
}
