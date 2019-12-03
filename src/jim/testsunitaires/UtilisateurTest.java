package jim.testsunitaires;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import jim.classes.Outils;
import jim.classes.Utilisateur;

public class UtilisateurTest {
	
	private Utilisateur utilisateur1;
	private Utilisateur utilisateur2;
	
	@Before
	public void setUp() throws Exception {
		utilisateur1 = new Utilisateur();
		
		int unId = 111;
		String unPseudo = "toto";
		String unMdpSha1 = "abcdef";
		String uneAdrMail = "toto@free.fr";
		String unNumTel = "1122334455";
		int unNiveau = 1;
		Date uneDateCreation = Outils.convertirEnDateHeure("21/06/2016 14:00:00");
		int unNbTraces = 3;
		Date uneDateDerniereTrace = Outils.convertirEnDateHeure("28/06/2016 14:00:00");
		utilisateur2 = new Utilisateur(unId, unPseudo, unMdpSha1, uneAdrMail, unNumTel, unNiveau, uneDateCreation, unNbTraces, uneDateDerniereTrace);
	}

	@Test
	public void testGetId() {		
		assertEquals(111, utilisateur2.getId());
	}

	@Test
	public void getSetId() {
		utilisateur1.setId(112);
		
		assertEquals(112, utilisateur1.getId());
	}

	@Test
	public void testGetPseudo() {
	    assertEquals("Test getPseudo", "toto", utilisateur2.getPseudo());
	}

	@Test
	public void testSetPseudo() {
		String Pseudo = "tata";
		utilisateur1.setPseudo(Pseudo);
	    assertEquals("Test setPseudo", Pseudo, utilisateur1.getPseudo());
	}

	@Test
	public void testGetMdpSha1() {
		assertEquals("abcdef",utilisateur2.getMdpSha1());
	}

	@Test
	public void testSetMdpSha1() {
		utilisateur1.setMdpSha1("MDP2ouf");
		assertEquals("Test SetMdpSha1", "MDP2ouf", utilisateur1.getMdpSha1());
	}

	@Test
	public void testGetAdrMail() {
		assertEquals("Test getAdresse", "", utilisateur1.getAdrMail());
		assertEquals("Test getPseudo", "toto@free.fr", utilisateur2.getAdrMail());;
	}

	@Test
	public void testSetAdrMail() {
		utilisateur1.setAdrMail("toto@free.fr");;
		assertEquals("Test setPseudo", "toto@free.fr", utilisateur1.getAdrMail());
	}

	@Test
	public void testGetNumTel() {
		assertEquals("Test GetNumTel", "", utilisateur1.getNumTel());
		assertEquals("Test GetNumTel", "11.22.33.44.55", utilisateur2.getNumTel());
	}

	@Test
	public void testSetNumTel() {
		utilisateur1.setNumTel("00.00.00.00.00");;
		assertEquals("Test setNumTel", "00.00.00.00.00", utilisateur1.getNumTel());
	}

	@Test
	public void testGetNiveau() {
		assertEquals(1,utilisateur2.getNiveau());
	}

	@Test
	public void testSetNiveau() {
<<<<<<< HEAD
		fail("Not yet implemented"); 
=======
		utilisateur1.setNiveau(2);
	    assertEquals("Test setpseudo", 2, utilisateur1.getNiveau());	
>>>>>>> b9d5d777c382cfbac42d1a5a070c7b28e428c62c
	}

	@Test
	public void testGetDateCreation() throws ParseException {
		Date uneDateCreation = Outils.convertirEnDateHeure("21/06/2016 14:00:00");
		assertEquals(uneDateCreation,utilisateur2.getDateCreation());
	}

	@Test
	public void testSetDateCreation() throws ParseException {
		Date uneDate = new Date();
		utilisateur2.setDateCreation(uneDate);
		
		assertEquals("Test SetDateDerniereTrace",uneDate,utilisateur2.getDateCreation());
	}

	@Test
	public void testGetNbTraces() {
		assertEquals("testSetNbTraces",3,utilisateur2.getNbTraces());
	}

	@Test
	public void testSetNbTraces() {
		utilisateur2.setNbTraces(5);
		assertEquals(5, utilisateur2.getNbTraces());
	}

	@Test
	public void testGetDateDerniereTrace() throws ParseException {
		Date uneDateDerniereTrace = Outils.convertirEnDateHeure("28/06/2016 14:00:00");
		assertEquals("testGetDateDerniereTrace",uneDateDerniereTrace,utilisateur2.getDateDerniereTrace());
	}

	@Test
	public void testSetDateDerniereTrace() throws ParseException {
		Date uneDate = new Date();
		utilisateur2.setDateDerniereTrace(uneDate);
		
		assertEquals("Test SetDateDerniereTrace",uneDate,utilisateur2.getDateDerniereTrace());
	}

	@Test
	public void testToString() {
		String msg = "";
	    msg += "id : " + "0" + "\n";
	    msg += "pseudo : " + "" + "\n";
	    msg += "mdpSha1 : " + "" + "\n";
	    msg += "adrMail : " + "" + "\n";
	    msg += "numTel : " + "" + "\n";
	    msg += "niveau : " + "0" + "\n";
	    msg += "nbTraces : " + "0" + "\n";
	    assertEquals("Test toString", msg, utilisateur1.toString());
	    
		msg = "";
	    msg += "id : " + "111" + "\n";
	    msg += "pseudo : " + "toto" + "\n";
	    msg += "mdpSha1 : " + "abcdef" + "\n";
	    msg += "adrMail : " + "toto@free.fr" + "\n";
	    msg += "numTel : " + "11.22.33.44.55" + "\n";
	    msg += "niveau : " + "1" + "\n";
	    msg += "dateCreation : " + "21/06/2016 14:00:00" + "\n";
	    msg += "nbTraces : " + "3" + "\n";
	    msg += "dateDerniereTrace : " + "28/06/2016 14:00:00" + "\n";
	    assertEquals("Test toString", msg, utilisateur2.toString());
	}

}
