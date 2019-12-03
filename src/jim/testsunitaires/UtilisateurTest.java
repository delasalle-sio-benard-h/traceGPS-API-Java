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
		fail("Not yet implemented");	
	}

	@Test
	public void testSetId() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPseudo() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPseudo() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMdpSha1() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetMdpSha1() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAdrMail() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAdrMail() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNumTel() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetNumTel() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNiveau() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetNiveau() {
		fail("Not yet implemented");
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
