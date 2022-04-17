package com.dio_class.devweek.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dio_class.devweek.Entity.Incidencia;
import com.dio_class.devweek.Repo.IncidenciaRepo;


@RestController

public class ControllerIncidencia {
	
	private final IncidenciaRepo increpository;
	
    public ControllerIncidencia(IncidenciaRepo increpository) {
        this.increpository = increpository;
    }

    @GetMapping("/incidencia")
    public ResponseEntity<List<Incidencia>> findIncidencia(){
        List<Incidencia> listaIncidencia = increpository.findAll();
        if (listaIncidencia.isEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(listaIncidencia, HttpStatus.OK);
    }

    @GetMapping("/incidencia/{id}")
    public ResponseEntity<Incidencia> findIncidenciaById(@PathVariable Long id){
        Optional<Incidencia> incidenciaOptional = increpository.findById(id);
        if (incidenciaOptional.isPresent()){
        	Incidencia incidenciaUnid = incidenciaOptional.get();
            return new ResponseEntity<>(incidenciaUnid, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @PostMapping("/incidencia/novo")
    public Incidencia newIncidencia(@RequestBody Incidencia newIncidencia) {
    	return increpository.save(newIncidencia);
    }
    
}
 