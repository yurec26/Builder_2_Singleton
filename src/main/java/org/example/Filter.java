package org.example;

import java.util.*;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (Integer x : source) {
            if (x >= treshold) {
                logger.log(STR."Элемент \{x} проходит");
                result.add(x);
            } else {
                logger.log(STR."Элемент \{x} не проходит");
            }
        }
        logger.log(STR."Прошло фильтр \{result.size()} элемента из \{source.size()}");
        return result;
    }
}