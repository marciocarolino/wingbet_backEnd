package br.com.betmanager.betmanager.service.user;

import br.com.betmanager.betmanager.model.CreateUerModel;
import br.com.betmanager.betmanager.repository.ICreateUerRepository;

import java.util.List;
import java.util.Optional;

public class CreateUserImpl implements ICreateUserService {

    private ICreateUerRepository createUerRepository;

    @Override
    public CreateUerModel save(CreateUerModel createUerModel) {
        return null;
    }

    @Override
    public List<CreateUerModel> findAll() {
        return null;
    }

    @Override
    public Optional<CreateUerModel> findById(Long id) {

        if (Optional.empty().isEmpty()) {
            return Optional.empty();
        }
        return createUerRepository.findById(id);

    }

    @Override
    public CreateUerModel update(CreateUerModel createUerModel) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
