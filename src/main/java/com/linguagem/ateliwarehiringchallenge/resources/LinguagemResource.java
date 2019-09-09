package com.linguagem.ateliwarehiringchallenge.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.linguagens.ateliwarehiringchallenge.models.Linguagem;
import com.linugagens.ateliwarehiringchallenge.repository.LinguagemRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Linguagens")
@CrossOrigin(origins="*")
public class LinguagemResource {

	@Autowired
	LinguagemRepository linguagemRepository;
	
	@GetMapping("/linguagens")
	@ApiOperation(value="Retorna lista de linguagens")
	public List<Linguagem> listaLinguagens(){
	 return linguagemRepository.findAll();
	
	}
	
	@GetMapping("/linguagens/{id}")
	@ApiOperation(value="Retorna uma unica linguagem")
	public Linguagem listaLinguagemUnica(@PathVariable(value="id")long id){
	 return linguagemRepository.findById(id);
	
	}
	
	@PostMapping("/linguagem")
	@ApiOperation(value="Salva uma linuguagem")
	public Linguagem salvaLinguagem(@RequestBody Linguagem linguagem ) {
		return linguagemRepository.save(linguagem);
		 
	}
	
	@DeleteMapping("/linguagem")
	@ApiOperation(value="Deleta uma linugagem")
	public void DeletaLinguagem(@RequestBody Linguagem linguagem ) {
		linguagemRepository.delete(linguagem);
		
	}
	
	@PutMapping("/linguagem")
	@ApiOperation(value="Atualiza uma linguagem")
	public Linguagem atualizaLinguagem(@RequestBody Linguagem linguagem ) {
		return linguagemRepository.save(linguagem);
		
	}
}
