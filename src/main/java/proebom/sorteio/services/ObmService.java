package proebom.sorteio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proebom.sorteio.dtos.ObmDto;
import proebom.sorteio.models.Obm;
import proebom.sorteio.repository.ObmRepository;


@Service

     @Autowired
    private ObmRepository repository;

    public List<Obm> listarObms() {
      List<Obm> obmsList = repository.findAll();

      if(obmsList.isEmpty()){
        throw new RuntimeException("Nenhuma OBM encontrada.");
      }
      return obmsList;
    }



    public ObmDto cadastrarNovaObm(ObmDto dto) {
      Obm entity = new Obm();
      entity.setCodigo(dto.getCodigo());
      entity.setTelefone(dto.getTelefone());
      entity.setCrbm(dto.getCrbm());
      entity.setEndereco(dto.getEndereco());

      entity = repository.save(entity);

      return new ObmDto();
    }

    
  
}
