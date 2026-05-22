package proebom.sorteio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proebom.sorteio.models.OBM;
import proebom.sorteio.repository.ObmRepository;


@Service
public class ObmService {

     @Autowired
    private ObmRepository repository;

    public List<OBM> listarTodas(){

        return repository.findAll();
    }
  
}
