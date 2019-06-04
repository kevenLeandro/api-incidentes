package br.com.uol.controller;

import br.com.uol.model.Devs;
import br.com.uol.repository.DevsRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController

public class DevsController {
	
	@Autowired
	public DevsController() {
		super();
	}
	
    @Autowired
    DevsRepository devsRepository;
   
    @ApiOperation(value="Lista Desenvolvedores")
    @CrossOrigin
    @GetMapping("/users")
    public List<Devs> getAllUsers() {
        return (List<Devs>) devsRepository.findAll();
    }
    
    @ApiOperation(value="Cria novo Desenvolvedor")
    @CrossOrigin   
    @PostMapping("/users")
    public Devs createUser(@Valid @RequestBody Devs dev) {
        return devsRepository.save(dev);
    }
 
}
