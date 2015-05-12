package pitanja;

public class PitanjaABCDsaTextualna {
	
	PitanjaABCD pitanje;
	String odgovorA;
	String odgovorB;
	String odgovorC;
	String odgovorD;
	
	
	
	public PitanjaABCDsaTextualna(PitanjaABCD pitanje, String odgovorA,
			String odgovorB, String odgovorC, String odgovorD) {
		super();
		this.pitanje = pitanje;
		this.odgovorA = odgovorA;
		this.odgovorB = odgovorB;
		this.odgovorC = odgovorC;
		this.odgovorD = odgovorD;
	}
	public PitanjaABCD getPitanje() {
		return pitanje;
	}
	public void setPitanje(PitanjaABCD pitanje) {
		//isto kako i u klasi ABCD sa slikom pitati
		this.pitanje = pitanje;
	}
	public String getOdgovorA() {
		return odgovorA;
	}
	public void setOdgovorA(String odgovorA) {
		if (odgovorA==null || odgovorA == "") {
			throw new RuntimeException("Nemoguce je uneti prazno pitanje!");
		}
		this.odgovorA = odgovorA;
	}
	public String getOdgovorB() {
		return odgovorB;
	}
	public void setOdgovorB(String odgovorB) {
		if (odgovorB==null || odgovorB == "") {
			throw new RuntimeException("Nemoguce je uneti prazno pitanje!");
		}
		this.odgovorB = odgovorB;
	}
	public String getOdgovorC() {
		return odgovorC;
	}
	public void setOdgovorC(String odgovorC) {
		if (odgovorC==null || odgovorC == "") {
			throw new RuntimeException("Nemoguce je uneti prazno pitanje!");
		}
		this.odgovorC = odgovorC;
	}
	public String getOdgovorD() {
		return odgovorD;
	}
	public void setOdgovorD(String odgovorD) {
		if (odgovorD==null || odgovorD == "") {
			throw new RuntimeException("Nemoguce je uneti prazno pitanje!");
		}
		this.odgovorD = odgovorD;
	}

	
	

}
