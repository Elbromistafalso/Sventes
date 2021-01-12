package lt2021.sventes;

import java.util.Date;

public class ValstybeDTO {
	
	private String pavadinimas;
	private String paveiksliukas;
	private String presidentas;
	private Date data;
	
	public ValstybeDTO() {}
	
	

	public ValstybeDTO(String pavadinimas, String paveiksliukas, String presidentas, Date data) {
		super();
		this.pavadinimas = pavadinimas;
		this.paveiksliukas = paveiksliukas;
		this.presidentas = presidentas;
		this.data = data;
	}



	public String getPavadinimas() {
		return pavadinimas;
	}

	public String getPaveiksliukas() {
		return paveiksliukas;
	}

	public String getPresidentas() {
		return presidentas;
	}

	public Date getData() {
		return data;
	}

	protected void setPavadinimas(String pavadinimas) {
		this.pavadinimas = pavadinimas;
	}

	protected void setPaveiksliukas(String paveiksliukas) {
		this.paveiksliukas = paveiksliukas;
	}

	protected void setPresidentas(String presidentas) {
		this.presidentas = presidentas;
	}

	protected void setData(Date data) {
		this.data = data;
	}
	
	

}
