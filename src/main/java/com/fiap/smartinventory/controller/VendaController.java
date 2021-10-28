package com.fiap.smartinventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fiap.smartinventory.model.Venda;
import com.fiap.smartinventory.repository.VendaRepository;

@Controller
public class VendaController {

	@Autowired
	VendaRepository vendaRepository;
	
	@GetMapping("/list2")
	public String getHome(Model model) {
		
		model.addAttribute("vendas", vendaRepository.findAll());
		return "venda";
	}
	
	@PostMapping("/add2")
    public String addVenda(Venda venda, BindingResult result, RedirectAttributes redirectAttributes) {

        if (result.hasErrors()) {
            redirectAttributes.addFlashAttribute("errors", result.getAllErrors());
            return "redirect:list2";
        }

        vendaRepository.save(venda);
        return "redirect:list2";
    }
	
	@PostMapping("/delete2")
	public String deletaVenda(Long id, RedirectAttributes redirectAttributes) {
		
		vendaRepository.deleteById(id);
		redirectAttributes.addFlashAttribute("msg", "Venda deletada com sucesso!");
		return "redirect:list2";
	}
}
