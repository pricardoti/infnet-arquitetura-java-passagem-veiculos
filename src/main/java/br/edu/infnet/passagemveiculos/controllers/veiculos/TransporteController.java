package br.edu.infnet.passagemveiculos.controllers.veiculos;

import br.edu.infnet.passagemveiculos.model.domain.veiculos.Transporte;
import br.edu.infnet.passagemveiculos.model.service.veiculos.TransporteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TransporteController {

    private final TransporteService transporteService;

    public TransporteController(TransporteService transporteService) {
        this.transporteService = transporteService;
    }

    @GetMapping(value = "/veiculos/transporte/incluir")
    public String incluir() {
        return "/veiculos/transporte/cadastro";
    }

    @PostMapping(value = "/veiculos/transporte/incluir")
    public String incluir(Transporte transporte) {
        transporteService.incluir(transporte);
        return "redirect:/veiculos/transporte/lista";
    }

    @GetMapping(value = "/veiculos/transporte/lista")
    public String telaLista(Model model) {
        model.addAttribute("veiculos", transporteService.obterLista());
        return "/veiculos/transporte/lista";
    }

    @GetMapping(value = "/veiculos/transporte/{id_transporte}/excluir")
    public String excluir(@PathVariable("id_transporte") Integer id) {
        transporteService.excluir(id);
        return "redirect:/veiculos/transporte/lista";
    }
}
