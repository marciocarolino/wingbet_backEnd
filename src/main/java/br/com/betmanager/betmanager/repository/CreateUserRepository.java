package br.com.betmanager.betmanager.repository;

import br.com.betmanager.betmanager.model.CreateUerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreateUserRepository extends JpaRepository<CreateUerModel, Long> {
}
