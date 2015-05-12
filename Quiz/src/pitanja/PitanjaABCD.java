package pitanja;

public class PitanjaABCD {
	
	private String textPitanja;
	private String tezinaPitanja;
	
	public String getTezinaPitanja(){
		return tezinaPitanja;
	}
	public void setTezinaPitanja(TezinaPitanja tezinaPitanja){
		//ne treba da li je == null ili ne jer kada dodajemo pitanja bice preko
		//checkbox-a
		 switch (tezinaPitanja) {
         case LAKO:
        	 this.tezinaPitanja = "LAKO";
             break;
                 
         case SREDNJE:
        	 this.tezinaPitanja = "SREDNJE";
             break;
                      
         default:
        	 this.tezinaPitanja = "TESKO";
             break;
     }
	}
	public String getTextPitanja() {
		return textPitanja;
	}

	public void setTextPitanja(String textPitanja) {
		if (textPitanja==null || textPitanja == "") {
			throw new RuntimeException("Nemoguce je uneti prazno pitanje!");
		}
		this.textPitanja = textPitanja;
	}
	
	

}
