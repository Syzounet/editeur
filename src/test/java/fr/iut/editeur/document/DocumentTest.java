package fr.iut.editeur.document;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DocumentTest {


    @Test
    public void testAjouter() {
        Document doc = new Document();
        doc.ajouter("Bonjour");
        Assert.assertEquals("Bonjour", doc.getTexte());
        doc.ajouter(" tout le monde !");
        Assert.assertEquals("Bonjour tout le monde !", doc.getTexte());
    }

    @Test
    public void testEffacer() {
        Document doc = new Document();
        doc.ajouter("Bonjour tout le monde !");
        doc.effacer(8, 15);
        Assert.assertEquals("Bonjour monde !", doc.getTexte());
    }

    @Test
    public void testClear() {
        Document doc = new Document();
        doc.ajouter("Bonjour tout le monde !");
        doc.clear();
        Assert.assertEquals("", doc.getTexte());
    }

    @Test
    public void testRemplacer() {
        Document doc = new Document();
        doc.ajouter("Bonjour tout le monde !");
        doc.remplacer(8, 20, "les gens");
        Assert.assertEquals("Bonjour les gens !", doc.getTexte());
    }

}
