package com.javaback.javaback.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.javaback.javaback.entity.Paciente;

@RepositoryRestResource(collectionResourceRel = "pacientes", path ="pacientes" )
@CrossOrigin(origins = "http://localhost:3000")
public interface PacienteRepo extends CrudRepository<Paciente, Long>{
    
}
