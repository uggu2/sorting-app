package com.test.uniquex.sortingapp.service.sorting.impl;

import com.test.uniquex.sortingapp.algorithm.AlgorithmStrategyFactory;
import com.test.uniquex.sortingapp.algorithm.AlgorithmType;
import com.test.uniquex.sortingapp.algorithm.SortingAlghorithm;
import com.test.uniquex.sortingapp.data.UserInput;
import com.test.uniquex.sortingapp.service.sorting.SortingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.TreeMap;

@Service
class SortingServiceImpl implements SortingService {

    @Autowired
    private AlgorithmStrategyFactory factory;

    @Override
    public TreeMap<String, Double> sort(AlgorithmType algorithmType, UserInput inputData) {
        SortingAlghorithm algorithm = factory.getSortingAlgorithm(algorithmType);
        return algorithm.sort(inputData.getData());
    }
}
