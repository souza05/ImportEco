package com.itb.tcc.ImportEco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.tcc.ImportEco.model.Usuario;
import com.itb.tcc.ImportEco.repository.UsuarioRepository;

@Controller
@RequestMapping("/importeco/usuario")
public class UsuarioController {
	
	@Autowired  // Injeção de dependência (O spring vai criar objeto e deixar à disposição)
	private UsuarioRepository usuarioRepository;
	
	
	    // Carregar o formulário de cadastro do usuário (método)
	
	
	@GetMapping("/novo-usuario")
	public String formUsuarioCadastro(Usuario usuario, Model model) {
	    	   
	    	   model.addAttribute("usuario", usuario);
	    	   
	    	   return "Cadastro";
	       }
	
		// Inserir usuário (método)
	    
	    @PostMapping("/add-usuario")
	    String addUsuario(Usuario usuario, Model model) {
	    	
	    	usuario.setCodStatusUsuario(true);
	    	Usuario usuarioDb = usuarioRepository.save(usuario);
	    	
	    	
	    	return "redirect:/importeco/usuario/Home"; // Redirecionar para próxima página
	    }
	
	    
	    // Página desfecho após cadastro do usuário
	    
	    
	    @GetMapping("/Home")
	    public String showPagePosCadastroUsuario() {
	    	
	    	
	    	return "Home";
	    }
	    
	    
	    
	    
	    
		
		// Carregar o formulário de atualização do usuário (método)
		// Atualizar usuário (método)
		
		// Tabela de seleção do usuário
		// Selecionar usuário (método)
		
		//Excluir usuário (método)
	

}
