package jim.testsunitaires;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import jim.classes.Outils;
import jim.classes.PasserelleServicesWebXML;
import jim.classes.Point;
import jim.classes.PointDeTrace;
import jim.classes.Trace;
import jim.classes.Utilisateur;

public class PasserelleServiceWebXMLTest {
	
	@Test
	public void testConnecter() {
		String msg = PasserelleServicesWebXML.connecter("admin", "adminnnnnnnn");
		assertEquals("Erreur : authentification incorrecte.", msg);
		
		msg = PasserelleServicesWebXML.connecter("admin", Outils.sha1("mdpadmin"));
		assertEquals("Administrateur authentifi�.", msg);
		
		msg = PasserelleServicesWebXML.connecter("europa", Outils.sha1("mdputilisateur"));
		assertEquals("Utilisateur authentifi�.", msg);
	}
		
	@Test
	public void testCreerUnUtilisateur() {
		String msg = PasserelleServicesWebXML.creerUnUtilisateur("test", "bergeault.nico@gmail.com", "0782542057");
		assertEquals("Erreur : pseudo trop court (8 car minimum) ou d�j� existant.", msg);
		

		msg = PasserelleServicesWebXML.creerUnUtilisateur("NicolasBergeault", "bergeault.nico@gmail.com", "0782542057");
		assertEquals("Enregistrement effectu� ; vous allez recevoir un courriel avec votre mot de passe.", msg);
	}
	
	@Test
	public void testSupprimerUnUtilisateur() {
	}
	
	@Test
	public void testChangerDeMdp() {
		fail("Not yet implemented");
	}	

	@Test
	public void testDemanderMdp() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testDemanderUneAutorisation() {
		fail("Not yet implemented");	
	}	
	
	@Test
	public void testRetirerUneAutorisation() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testEnvoyerPosition() throws ParseException {
		fail("Not yet implemented");
	}

	@Test
	public void testDemarrerEnregistrementParcours() {
		fail("Not yet implemented");
	}

	@Test
	public void testArreterEnregistrementParcours() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSupprimerUnUnParcours() {
		fail("Not yet implemented");
	}
	
} // fin du test
