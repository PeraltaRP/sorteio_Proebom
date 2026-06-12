package proebom.sorteio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import proebom.sorteio.models.EditalObm;

public interface EditalObmRepository extends JpaRepository<EditalObm, Long> {
  
 List<EditalObm> findByEditalId(Long idEdital);

    boolean existsByEditalIdAndObmId(
            Long idEdital,
            Long idObm
    );
  }
