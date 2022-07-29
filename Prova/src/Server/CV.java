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
	
	public String getNome() {
		return this.nome;
	}
	
	public String getIndirizzo() {
		return this.indirizzoLoc;
	}
	
	public int getCap() {
		return this.cap;
	}
	
	public String getComune() {
		return this.comune;
	}
	
	public String getProvincia() {
		return this.provincia;
	}
	
	public String getRegione() {
		return this.regione;
	}
	
	public String getTipo() {
		return this.tipo;
	}
}
