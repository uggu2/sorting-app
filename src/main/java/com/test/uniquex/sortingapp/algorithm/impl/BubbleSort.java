package com.test.uniquex.sortingapp.algorithm.impl;

import com.test.uniquex.sortingapp.algorithm.SortingAlghorithm;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

@Component
public class BubbleSort implements SortingAlghorithm {

    @Override
    public TreeMap<String, Double> sort(HashMap<String, Double> inputData) {
       return inputData.entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> newValue,
                        TreeMap::new));
    }

}
