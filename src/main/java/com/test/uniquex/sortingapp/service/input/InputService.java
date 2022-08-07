package com.test.uniquex.sortingapp.service.input;

import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

public interface InputService {

    void readInput(Model model, MultipartFile file);
}
