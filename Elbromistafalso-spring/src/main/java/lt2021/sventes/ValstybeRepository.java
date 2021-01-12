package lt2021.sventes;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ValstybeRepository extends JpaRepository<Valstybe, String> {
	
	Valstybe findByPavadinimas(String pavadinimas);

}
