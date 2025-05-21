package com.bibliotech.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    // Mostrar formulario login
    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }

    // Procesar login (simulado)
    @PostMapping("/login")
    public String loginSubmit(@RequestParam String username, @RequestParam String password, Model model) {
        // Simulación simple: usuario = admin, pass = admin
        if ("admin".equals(username) && "admin".equals(password)) {
            model.addAttribute("username", username);
            return "dashboard";
        } else {
            model.addAttribute("error", "Usuario o contraseña incorrectos");
            return "login";
        }
    }

    // Mostrar dashboard (evitar sin login, aquí simple)
    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }
}
