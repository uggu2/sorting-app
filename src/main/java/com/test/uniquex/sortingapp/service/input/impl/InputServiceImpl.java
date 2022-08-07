package com.test.uniquex.sortingapp.service.input.impl;

import com.test.uniquex.sortingapp.data.UserInput;
import com.test.uniquex.sortingapp.service.input.InputService;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

@Service
class InputServiceImpl implements InputService {

    public void readInput(Model model, MultipartFile file) {
        HashMap<String, Double> map = getData(file);
        UserInput userInput = new UserInput();
        userInput.setData(map);
        model.addAttribute("userInput", userInput);
    }

    private HashMap<String, Double> getData(MultipartFile file) {
        HashMap<String, Double> map = new HashMap<>();
        String line;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
            while ((line = reader.readLine()) != null) {
                String[] keyValuePair = line.split(",");
                String key = keyValuePair[0];
                Double value = Double.parseDouble(keyValuePair[1]);
                map.put(key, value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}
