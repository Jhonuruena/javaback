package com.javaback.javaback.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.javaback.javaback.entity.Especialidad;

@RepositoryRestResource(collectionResourceRel = "especialidades" , path = "especialidades")
@CrossOrigin(origins = "http://localhost:3000")
public interface EspecialidadRepo extends CrudRepository<Especialidad, Long> {
    
}
