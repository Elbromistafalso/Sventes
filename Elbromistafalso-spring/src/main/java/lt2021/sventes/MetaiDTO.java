package lt2021.sventes;

public class MetaiDTO {
	
	private Integer metuSkaicius;
	private Integer dienuSkaicius;
	private String horoskopoZenklas;
	
	public MetaiDTO() {}

	public MetaiDTO(Integer metuSkaicius, Integer dienuSkaicius) {
		super();
		this.metuSkaicius = metuSkaicius;
		this.dienuSkaicius = dienuSkaicius;
	}

	public Integer getMetuSkaicius() {
		return metuSkaicius;
	}

	public Integer getDienuSkaicius() {
		return dienuSkaicius;
	}

	public String getHoroskopoZenklas() {
		return horoskopoZenklas;
	}

	protected void setMetuSkaicius(Integer metuSkaicius) {
		this.metuSkaicius = metuSkaicius;
	}

	protected void setDienuSkaicius(Integer dienuSkaicius) {
		this.dienuSkaicius = dienuSkaicius;
	}

	protected void setHoroskopoZenklas(String horoskopoZenklas) {
		this.horoskopoZenklas = horoskopoZenklas;
	}
	
	

}
