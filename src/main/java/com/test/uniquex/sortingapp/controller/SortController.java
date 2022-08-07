package com.test.uniquex.sortingapp.controller;

import com.test.uniquex.sortingapp.algorithm.AlgorithmType;
import com.test.uniquex.sortingapp.data.UserInput;
import com.test.uniquex.sortingapp.service.sorting.SortingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.TreeMap;

@Controller
@SessionAttributes("userInput")
public class SortController {

    @Autowired
    private SortingService sortingService;

    @PostMapping(path = "/", params="action=sort")
    public String sortInput(@ModelAttribute("algorithmType") AlgorithmType algorithmType, Model model) {
        TreeMap<String, Double> sortedStudents =
                sortingService.sort(algorithmType, (UserInput) model.getAttribute("userInput"));
        model.addAttribute("sortedStudents", sortedStudents);
        return "index";
    }
}
