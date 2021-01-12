package lt2021.sventes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SventeRepository extends JpaRepository<Svente, String> {
	
	Svente findByPavadinimas(String pavadinimas);

}
