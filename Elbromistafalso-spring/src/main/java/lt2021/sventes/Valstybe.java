package lt2021.sventes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name= "VALSTYBES")
public class Valstybe {
	
	@Id
	@Column(name="PAVADINIMAS", nullable=false, unique=true)
	private String pavadinimas;
	@Column(name="PAVEIKSLIUKAS", nullable=false)
	private String paveiksliukas;
	@Column(name="PRESIDENTAS", nullable=false)
	private String presidentas;
	@Temporal(value=TemporalType.DATE)
	@Column(name="DATA")
	private Date data;
	@ManyToMany
	private List<Svente> sventesV;
	
	public Valstybe() {}
	
	public Valstybe(String pavadinimas, String paveiksliukas, String presidentas) {
		super();
		this.pavadinimas = pavadinimas;
		this.paveiksliukas = paveiksliukas;
		this.presidentas = presidentas;
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
	
	public void addSvente(Svente svente) {
		
		if(this.sventesV == null) {
				
			this.sventesV = new ArrayList<>();
		}
			
			this.sventesV.add(svente);	
	}	

}
