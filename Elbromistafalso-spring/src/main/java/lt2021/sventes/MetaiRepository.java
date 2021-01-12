package lt2021.sventes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MetaiRepository extends JpaRepository<Metai, Integer>{
	
	Metai findByMetuSkaicius(Integer metuSkaicus);

}
