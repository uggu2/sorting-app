package com.test.uniquex.sortingapp.algorithm;

import com.test.uniquex.sortingapp.algorithm.impl.BubbleSort;
import com.test.uniquex.sortingapp.algorithm.impl.HeapSort;
import com.test.uniquex.sortingapp.algorithm.impl.MergeSort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AlgorithmStrategyFactory {

    @Autowired
    private BubbleSort bubbleSort;
    @Autowired
    private MergeSort mergeSort;
    @Autowired
    private HeapSort heapSort;

    public SortingAlghorithm getSortingAlgorithm(AlgorithmType algorithmType) {
        switch (algorithmType) {
            case MERGE: {
                return mergeSort;
            }
            case HEAP: {
                return heapSort;
            }
            default: {
                return bubbleSort;
            }
        }
    }
}
