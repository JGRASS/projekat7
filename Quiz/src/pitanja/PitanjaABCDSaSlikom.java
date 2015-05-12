package pitanja;

import java.awt.Image;

public class PitanjaABCDSaSlikom {
	
	private PitanjaABCD pitanje;
	private Image odgovorA;
	private Image odgovorB;
	private Image odgovorC;
	private Image odgovorD;
	
	public PitanjaABCDSaSlikom(PitanjaABCD pitanje, Image odgovorA,
			Image odgovorB, Image odgovorC, Image odgovorD) {
		super();
		this.pitanje = pitanje;
		//To-Do!!!
		//Treba pitati da li mozemo da unosimo slike preko Image ili 
		//nam treba direktan url ili kako vec radi sa serijalizovanim 
		//fajlovima
		this.odgovorA = odgovorA;
		this.odgovorB = odgovorB;
		this.odgovorC = odgovorC;
		this.odgovorD = odgovorD;
	}

	public PitanjaABCD getPitanje() {
		return pitanje;
	}

	public void setPitanje(PitanjaABCD pitanje) {
		//mozda treba menjati videti da li je dovoljan konstruktor direktno iz pitnja
		this.pitanje = pitanje;
	}

	public Image getOdgovorA() {
		return odgovorA;
	}

	public void setOdgovorA(Image odgovorA) {
		if (odgovorA == null) {
			throw new RuntimeException("Nemoguce doci do slike!!!");
		}
		this.odgovorA = odgovorA;
	}

	public Image getOdgovorB() {
		return odgovorB;
	}

	public void setOdgovorB(Image odgovorB) {
		if (odgovorB == null) {
			throw new RuntimeException("Nemoguce doci do slike!!!");
		}
		this.odgovorB = odgovorB;
	}

	public Image getOdgovorC() {
		return odgovorC;
	}

	public void setOdgovorC(Image odgovorC) {
		if (odgovorC == null) {
			throw new RuntimeException("Nemoguce doci do slike!!!");
		}
		this.odgovorC = odgovorC;
	}

	public Image getOdgovorD() {
		return odgovorD;
	}

	public void setOdgovorD(Image odgovorD) {
		if (odgovorD == null) {
			throw new RuntimeException("Nemoguce doci do slike!!!");
		}
		this.odgovorD = odgovorD;
	}

	
	

}
