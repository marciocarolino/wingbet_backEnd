package br.com.betmanager.betmanager.service.user;

import br.com.betmanager.betmanager.model.CreateUerModel;
import br.com.betmanager.betmanager.repository.CreateUserRepository;

import java.util.ArrayList;
import java.util.List;

public class CreateUserService {

    private CreateUserRepository createUserRepository;


    public List<CreateUerModel> findAll() {
        List<CreateUerModel> findAllUser = new ArrayList<>();
        findAllUser = createUserRepository.findAll();
        return findAllUser;
    }

}
