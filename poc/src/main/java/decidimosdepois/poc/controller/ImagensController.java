package decidimosdepois.poc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ImagensController {

    @GetMapping("/imagens")
    public String exibirImagens() {
        return "html/paginaLogin.html";
    }
}