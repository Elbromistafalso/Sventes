package lt2021.sventes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MainController {
	
	@Autowired
	private MainService service;

	public MainController(MainService service) {
		
		this.service = service;
	}
	
	@RequestMapping(path = "/Elbromistafalso-spring", method = RequestMethod.GET)
	public List<SventeDTO> getAllSventes(){
		
		return service.getSventes();
	}
	
	@RequestMapping(path = "/allValstybes", method = RequestMethod.GET)
	public List<ValstybeDTO> getAllValstybes(){
		
		return service.getValstybes();
	}
	
	@RequestMapping(path = "/allMetai", method = RequestMethod.GET)
	public List<MetaiDTO> getAllMetai(){
		
		return service.getMetai();
	}
	
	@RequestMapping(path = "/deleteValstybe/{pavadinimas}", method = RequestMethod.DELETE)
	public void deleteValstybe(@PathVariable final String pavadinimas) {
		
		service.deleteValstybe(pavadinimas);
	}
	
	@RequestMapping(path = "/updateValstybe/{pavadinimas}", method = RequestMethod.PUT)
	public void updateValstybe(@RequestBody final ValstybeDTO valstybe ,@PathVariable final String pavadinimas) {
		
		service.updateValstybe(valstybe, pavadinimas);
	}
	
	@RequestMapping(path = "/addHoroscope/{metuSkaicius}/{horoscopeAnimal}", method = RequestMethod.POST)
	public void addHoroscopeToMetai(@PathVariable Integer metuSkaicius, @PathVariable String horoscopeAnimal) {
		
		service.setHoroscope(metuSkaicius, horoscopeAnimal);
	}
	
	@RequestMapping(path = "/newSvente}", method = RequestMethod.POST)
	public void createSvente(@RequestBody final SventeDTO svente) {
		
		service.createSvente(svente);
	}
	
		

}
