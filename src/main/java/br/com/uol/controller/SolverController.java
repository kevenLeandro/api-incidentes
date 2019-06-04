package br.com.uol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.uol.model.Solver;
import br.com.uol.service.ISolverService;
import io.swagger.annotations.ApiOperation;

@RestController
public class SolverController {

	@Autowired
	ISolverService service;
	@ApiOperation(value="Retorna lista de Resolvedores de Incidentes e Datas ")
	@CrossOrigin
	@GetMapping("im-day")
	public ResponseEntity<List<Solver>> getAllSolvers() {
		List<Solver> list = service.getAllSolvers();
		return new ResponseEntity<List<Solver>>(list, HttpStatus.OK);
	}
		
}
