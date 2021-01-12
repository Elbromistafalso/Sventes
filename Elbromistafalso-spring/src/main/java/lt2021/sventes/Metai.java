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
@Table(name= "METAI")
public class Metai {
	
	@Id
	@Column(name="METU_SKAICIUS", nullable=false, unique=true)
	private Integer metuSkaicius;
	@Column(name="DIENU_SKAICIUS", nullable=false)
	private Integer dienuSkaicius;
	@Enumerated(EnumType.STRING)
	@Column(name="RYTU_HOROSKOPO_ZENKLAS", nullable=false)
	private HoroskopoZenklas horoskopoZenklas;
	@ManyToMany
	private List<Svente> sventesM;
	
	public Metai() {}

	public Metai(Integer metuSkaicius, Integer dienuSkaicius) {
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

	public HoroskopoZenklas getHoroskopoZenklas() {
		return horoskopoZenklas;
	}

	protected void setMetuSkaicius(Integer metuSkaicius) {
		this.metuSkaicius = metuSkaicius;
	}

	protected void setDienuSkaicius(Integer dienuSkaicius) {
		this.dienuSkaicius = dienuSkaicius;
	}

	protected void setHoroskopoZenklas(HoroskopoZenklas horoskopoZenklas) {
		this.horoskopoZenklas = horoskopoZenklas;
	}
	
}
