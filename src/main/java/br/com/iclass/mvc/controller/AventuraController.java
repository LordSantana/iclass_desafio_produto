package br.com.iclass.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.iclass.mvc.entity.Aventura;
import br.com.iclass.mvc.repository.AventuraRepository;

@Controller(value = "aventuras")
@RequestMapping("/")
public class AventuraController {
	
	private AventuraRepository aventuraRepository;
	private Aventura aventura;
	
	
	@Autowired
	public AventuraController(AventuraRepository prAventuraRepository) {
		this.aventuraRepository = prAventuraRepository;
	}
	
	@RequestMapping(value = "/adicionaAventura", method = RequestMethod.POST)
	public void adicionaAventura(@ModelAttribute Aventura aventura , BindingResult errors, Model model) {
		aventuraRepository.save(aventura);
	}
	
	@RequestMapping(value = "/listarAventuras", method = RequestMethod.GET)
	public void listarAventuras(Model model) {
		Aventura aventura = new Aventura();
		model.addAttribute("aventura",aventura);
		
		List<Aventura> listaAventuras = aventuraRepository.findAll();
		if(listaAventuras.size() > 0) {
			model.addAllAttributes(listaAventuras);
		}
	}
}
