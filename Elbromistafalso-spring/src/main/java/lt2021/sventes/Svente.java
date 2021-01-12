package lt2021.sventes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "SVENTES")
public class Svente {
	
	@Id
	@Column(name="PAVADINIMAS", nullable=false, unique=true)
	private String pavadinimas;
	@Column(name="APRASYMAS", nullable=false)
	private String aprasymas;
	@Column(name="PAVEIKSLIUKAS", nullable=false)
	private String paveiksliukas;
	@Enumerated(EnumType.STRING)
	private SventeTipas sventeTipas;
	@Column(name="VELIAVOS_ISKELIMAS", nullable=false)
	private String veliavosIskelimas;
	@ManyToMany(mappedBy="sventesV")
	private List<Valstybe> valstybes;
	@ManyToMany(mappedBy="sventesM")
	private List<Metai> metai;
	
	public Svente() {}
	
	public Svente(String pavadinimas, String aprasymas, String paveiksliukas, SventeTipas sventeTipas,
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

	public SventeTipas getSventeTipas() {
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

	protected void setSventeTipas(SventeTipas sventeTipas) {
		this.sventeTipas = sventeTipas;
	}

	protected void setVeliavosIskelimas(String veliavosIskelimas) {
		this.veliavosIskelimas = veliavosIskelimas;
	}
	
    public void addValstybe(Valstybe valstybe) {
    	
		valstybe.addSvente(this);
		this.valstybes.add(valstybe);
	}
	
	
	
	
	
	

}
