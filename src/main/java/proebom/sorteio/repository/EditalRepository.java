package proebom.sorteio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proebom.sorteio.models.Edital;

public interface EditalRepository extends JpaRepository<Edital, Long> {
  
}
