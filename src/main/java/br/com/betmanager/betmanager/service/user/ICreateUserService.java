package br.com.betmanager.betmanager.service.user;

import br.com.betmanager.betmanager.model.CreateUerModel;

import java.util.List;
import java.util.Optional;

public interface ICreateUserService {


    CreateUerModel save(CreateUerModel createUerModel);

    List<CreateUerModel> findAll();

    Optional<CreateUerModel> findById(Long id);

    CreateUerModel update(CreateUerModel createUerModel);

    void deleteById(Long id);
}
