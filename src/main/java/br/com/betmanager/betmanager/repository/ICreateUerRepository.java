package br.com.betmanager.betmanager.repository;

import br.com.betmanager.betmanager.model.CreateUerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICreateUerRepository extends JpaRepository<CreateUerModel, Long> {
}
