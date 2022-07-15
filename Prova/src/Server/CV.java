package Server;

public class CV {
	private String nome;
	private String indirizzoLoc;
	private int cap;
	private String comune;
	private String provincia;
	private String regione;
	private String tipo;
		
	CV(String n, String i, int ca, String c, String p, String r, String t){
		nome = n;
		indirizzoLoc = i;
		cap = ca;
		comune = c;
		provincia = p;
		regione = r;
		tipo = t;		
	}
	
	String getNome() {
		return this.nome;
	}
	
	String getIndirizzo() {
		return this.indirizzoLoc;
	}
	
	int getCap() {
		return this.cap;
	}
	
	String getComune() {
		return this.tipo;
	}
	
	String getProvincia() {
		return this.tipo;
	}
	
	String getRegione() {
		return this.regione;
	}
	
	String getTipo() {
		return this.tipo;
	}
}
