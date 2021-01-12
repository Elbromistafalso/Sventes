package lt2021.sventes;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {
	
	@Autowired
	private SventeRepository sventeRepository;
	@Autowired
	private ValstybeRepository valstybeRepository;
	@Autowired
	private MetaiRepository metaiRepository;
	
	public MainService(SventeRepository sventeRepository, ValstybeRepository valstybeRepository,
			MetaiRepository metaiRepository) {
		
		this.sventeRepository = sventeRepository;
		this.valstybeRepository = valstybeRepository;
		this.metaiRepository = metaiRepository;
	}
	
	@Transactional
	public List<SventeDTO> getSventes(){
		
		return sventeRepository.findAll().stream()
				.map(svente -> new SventeDTO(svente.getPavadinimas(), svente.getAprasymas(), svente.getPaveiksliukas(), svente.getSventeTipas().name(),
						svente.getVeliavosIskelimas())).collect(Collectors.toList());
	}
	
	@Transactional
	public List<ValstybeDTO> getValstybes(){
		
		return valstybeRepository.findAll().stream()
				.map(valstybe -> new ValstybeDTO(valstybe.getPavadinimas(), valstybe.getPaveiksliukas(),
						valstybe.getPresidentas(), valstybe.getData())).collect(Collectors.toList());
	}
	
	@Transactional
	public List<MetaiDTO> getMetai(){
		
		return metaiRepository.findAll().stream()
				.map(metai -> new MetaiDTO(metai.getMetuSkaicius(), metai.getDienuSkaicius())).collect(Collectors.toList());
	}
	
	@Transactional
	public void deleteValstybe(String pavadinimas) {
		
		valstybeRepository.delete(valstybeRepository.findByPavadinimas(pavadinimas));
	}
	
	@Transactional
	public void updateValstybe(ValstybeDTO valstybe, String pavadinimas) {
		
		Valstybe targetValstybe = valstybeRepository.findByPavadinimas(pavadinimas);
		targetValstybe.setPaveiksliukas(valstybe.getPaveiksliukas());
		targetValstybe.setPresidentas(valstybe.getPresidentas());
		targetValstybe.setData(valstybe.getData());
		valstybeRepository.save(targetValstybe);
	}
	
	@Transactional
	public void setHoroscope(Integer metuSkaicius, String horoscopeAnimal) {
		
		Metai targetMetai = metaiRepository.findByMetuSkaicius(metuSkaicius);
		targetMetai.setHoroskopoZenklas(HoroskopoZenklas.valueOf(horoscopeAnimal));
		metaiRepository.save(targetMetai);
	}
	
	@Transactional
	public void createSvente(SventeDTO sventeDto) {
		
		Svente svente = new Svente(sventeDto.getPavadinimas(), sventeDto.getAprasymas(),
				sventeDto.getPaveiksliukas(), SventeTipas.valueOf(sventeDto.getSventeTipas()),
				sventeDto.getVeliavosIskelimas());
		
		sventeRepository.save(svente);
	}
	
	

}
