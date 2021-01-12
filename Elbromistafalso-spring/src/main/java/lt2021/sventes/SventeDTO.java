package lt2021.sventes;

public class SventeDTO {
	
	private String pavadinimas;
	private String aprasymas;
	private String paveiksliukas;
	private String sventeTipas;
	private String veliavosIskelimas;
	
	public SventeDTO() {}

	public SventeDTO(String pavadinimas, String aprasymas, String paveiksliukas, String sventeTipas,
			String veliavosIskelimas) {
		super();
		this.pavadinimas = pavadinimas;
		this.aprasymas = aprasymas;
		this.paveiksliukas = paveiksliukas;
		this.sventeTipas = sventeTipas;
		this.veliavosIskelimas = veliavosIskelimas;
	}

	public String getPavadinimas() {
		return pavadinimas;
	}

	public String getAprasymas() {
		return aprasymas;
	}

	public String getPaveiksliukas() {
		return paveiksliukas;
	}

	public String getSventeTipas() {
		return sventeTipas;
	}

	public String getVeliavosIskelimas() {
		return veliavosIskelimas;
	}

	protected void setPavadinimas(String pavadinimas) {
		this.pavadinimas = pavadinimas;
	}

	protected void setAprasymas(String aprasymas) {
		this.aprasymas = aprasymas;
	}

	protected void setPaveiksliukas(String paveiksliukas) {
		this.paveiksliukas = paveiksliukas;
	}

	protected void setSventeTipas(String sventeTipas) {
		this.sventeTipas = sventeTipas;
	}

	protected void setVeliavosIskelimas(String veliavosIskelimas) {
		this.veliavosIskelimas = veliavosIskelimas;
	}
	
	
	
	

}
