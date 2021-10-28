package com.fiap.smartinventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fiap.smartinventory.model.Cliente;
import com.fiap.smartinventory.repository.ClienteRepository;

@Controller
public class ClienteController {

	@Autowired
	ClienteRepository clienteRepository;
	
	@GetMapping("/list")
	public String getHome(Model model) {
		
		model.addAttribute("clientes", clienteRepository.findAll());
		return "cliente";
	}
	
	@PostMapping("/add")
    public String addCliente(Cliente cliente, BindingResult result, RedirectAttributes redirectAttributes) {

        if (result.hasErrors()) {
            redirectAttributes.addFlashAttribute("errors", result.getAllErrors());
            return "redirect:list";
        }

        clienteRepository.save(cliente);
        return "redirect:list";
    }
	
	@PostMapping("/delete")
	public String deletaCliente(Long id, RedirectAttributes redirectAttributes) {
		
		clienteRepository.deleteById(id);
		redirectAttributes.addFlashAttribute("msg", "Cliente deletado com sucesso!");
		return "redirect:list";
	}
}
