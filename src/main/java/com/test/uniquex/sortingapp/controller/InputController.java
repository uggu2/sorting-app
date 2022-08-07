package com.test.uniquex.sortingapp.controller;

import com.test.uniquex.sortingapp.service.input.InputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

@Controller
@SessionAttributes("userInput")
public class InputController {

    @Autowired
    InputService inputService;

    @PostMapping(path = "/", params = "action=Submit")
    public String uploadFile(Model model, @RequestParam("file") MultipartFile file) {
        inputService.readInput(model, file);
        return "index";
    }

}

