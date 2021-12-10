package com.RestAPI.TutorialsRestApi.repository;

import com.RestAPI.TutorialsRestApi.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario,Integer> {
}
