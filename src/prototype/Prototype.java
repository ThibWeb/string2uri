package prototype;


/**
 * Temporary main test class.
 * 
 * @author Thibaud Colas
 * @version 05042012
 */
public class Prototype {
	
	public static void main(String[] args) {
		//App test = new AppSesame("http://localhost:8080/openrdf-sesame/", "geo-insee-all", "passim-propre");
		App test = new AppRDF("./rdf/insee/","./rdf/Brute3.rdf", "regions", "");
		test.setLiaisonTypee("geo:nom", "tt:Région", "geo:Region", "");
		test.setSPARQLOutput();
		test.initiateInterconnexion(false);
		System.out.println(test.getOutput());
		test.shutdown();
	}
}
