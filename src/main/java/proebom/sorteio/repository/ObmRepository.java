package proebom.sorteio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proebom.sorteio.models.OBM;

@Repository
public interface ObmRepository extends JpaRepository<OBM, Long> {
  
}
