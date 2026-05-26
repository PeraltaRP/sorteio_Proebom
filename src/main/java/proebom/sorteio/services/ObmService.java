package proebom.sorteio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proebom.sorteio.dtos.ObmDto;
import proebom.sorteio.models.Crbm;
import proebom.sorteio.models.Obm;
import proebom.sorteio.repository.CrbmRepository;
import proebom.sorteio.repository.ObmRepository;


@Service
public class ObmService {
    @Autowired
    private ObmRepository repositoryObm;

    @Autowired
    private CrbmRepository repositoryCrbm;

    public List<Obm> listarObms() {
      List<Obm> obmsList = repositoryObm.findAll();
      if(obmsList.isEmpty()){
        throw new RuntimeException("Nenhuma OBM encontrada.");
      }
      return obmsList;
    }

    public ObmDto insert(ObmDto dto) {
      Obm entity = new Obm();

      entity.setCodigo(dto.getCodigo());
      entity.setTelefone(dto.getTelefone());

      // Verificar se o CRBM existe antes de associar
      Crbm crbm = repositoryCrbm.findById(dto.getCrbmId())
          .orElseThrow(() -> new RuntimeException("CRBM com ID " + dto.getCrbmId() + " não encontrado."));
      entity.setCrbm(crbm);
      
      entity.setEndereco(dto.getEndereco());

      entity = repositoryObm.save(entity);
      
      return new ObmDto(entity);
    }

      
    
  
}
