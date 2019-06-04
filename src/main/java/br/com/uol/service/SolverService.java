package br.com.uol.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.uol.model.Devs;
import br.com.uol.controller.DevsController;
import br.com.uol.dates.*;
import br.com.uol.model.Solver;
import br.com.uol.repository.DevsRepository;
import br.com.uol.repository.SolverRepository;

@Service
public class SolverService implements ISolverService{

	@Autowired
	private SolverRepository solverRepository;
	
	@Autowired
	private DevsController devsController;
	
	//private Solver solver ;
		
	@Override
	public List<Solver> getAllSolvers() {
		List<Solver> list = new ArrayList<>();
		
		if (solverRepository.findAll() != null)
			solverRepository.findAll().forEach(e-> list.add(e));
		
		return list;
		
	}	       
	
	public List<Solver> updateSolvers() {
		List<Solver> list = new ArrayList<>();
		
		List<Day> day;
		List<Devs> devs = new ArrayList<>();
        BuildListDate b = new BuildListDate();
        day = b.buildDayRange();
        devs = devsController.getAllUsers();
        
        int count = 0;
        for (Day dia : day) {

            if(!(dia.getName().equals("Domingo") || dia.getName().equals("Sábado")))
            { System.out.println(dia.getName() + " "+devs.get(count).getName()  );
                count ++;
                solverRepository.save(new Solver(dia.toString(),devs.get(count).getName()));
            }
            else{
                System.out.println(dia.getName() +" " + devs.get(count).getPhoneNumber()) ;
               
                solverRepository.save(new Solver(dia.toString(),devs.get(count).getPhoneNumber()));
            }
            
        }
              
		solverRepository.findAll().forEach(e-> list.add(e));
		
		return list;
		
	}	
 }


