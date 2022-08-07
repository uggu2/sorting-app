package com.test.uniquex.sortingapp.service.sorting;

import com.test.uniquex.sortingapp.algorithm.AlgorithmType;
import com.test.uniquex.sortingapp.data.UserInput;

import java.util.TreeMap;

public interface SortingService {

     TreeMap<String, Double> sort(AlgorithmType algorithmType, UserInput inputData);

}
