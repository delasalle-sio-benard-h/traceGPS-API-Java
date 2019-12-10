package jim.testsvisuels;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import jim.classes.Outils;
import jim.classes.PasserelleServicesWebXML;
import jim.classes.PointDeTrace;
import jim.classes.Trace;
import jim.classes.Utilisateur;

public class TestPasserelleServicesWebXML {

	public static void main(String[] args) throws ParseException {
		
		String msg;
		
		// test visuel de la méthode connecter
		msg = PasserelleServicesWebXML.connecter("admin", "adminnnnnnnn");
		System.out.println(msg);
		
		msg = PasserelleServicesWebXML.connecter("admin", Outils.sha1("mdpadmin"));
		System.out.println(msg);
		
		msg = PasserelleServicesWebXML.connecter("europa", Outils.sha1("mdputilisateur"));
		System.out.println(msg);
	
		// test visuel de la méthode getTousLesUtilisateurs


		// test visuel de la méthode getLesUtilisateursQueJautorise


		// test visuel de la méthode getLesUtilisateursQuiMautorisent

		
		// test visuel de la méthode getLesParcoursDunUtilisateur

		
		// test visuel de la méthode getUnParcoursEtSesPoints

	
	} // fin Main
} // fin class
