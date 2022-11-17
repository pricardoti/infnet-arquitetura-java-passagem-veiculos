package br.edu.infnet.passagemveiculos.controllers.veiculos;

import br.edu.infnet.passagemveiculos.model.domain.veiculos.Carga;
import br.edu.infnet.passagemveiculos.model.domain.veiculos.CarroceriaEnum;
import br.edu.infnet.passagemveiculos.model.service.veiculos.CargaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CargaController {

    private final CargaService cargaService;

    public CargaController(CargaService cargaService) {
        this.cargaService = cargaService;
    }

    @GetMapping(value = "/veiculos/carga/incluir")
    public String incluir(Model model) {
        model.addAttribute("carrocerias", CarroceriaEnum.values());
        return "/veiculos/carga/cadastro";
    }

    @PostMapping(value = "/veiculos/carga/incluir")
    public String incluir(Carga carga) {
        cargaService.incluir(carga);
        return "redirect:/veiculos/carga/lista";
    }

    @GetMapping(value = "/veiculos/carga/lista")
    public String telaLista(Model model) {
        model.addAttribute("veiculos", cargaService.obterLista());
        return "/veiculos/carga/lista";
    }

    @GetMapping(value = "/veiculos/carga/{id_carga}/excluir")
    public String excluir(@PathVariable("id_carga") Integer id) {
        cargaService.excluir(id);
        return "redirect:/veiculos/carga/lista";
    }
}
