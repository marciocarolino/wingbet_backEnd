package br.com.betmanager.betmanager.controller;

import br.com.betmanager.betmanager.model.CreateUerModel;
import br.com.betmanager.betmanager.service.user.CreateUserService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/createUser")
public class CreateUserController {

    private CreateUserService createUserService;

    public CreateUserController(CreateUserService createUserService) {
        this.createUserService = createUserService;
    }

    @GetMapping
    public List<CreateUerModel> getAll() {
        return createUserService.findAll();
    }


}
