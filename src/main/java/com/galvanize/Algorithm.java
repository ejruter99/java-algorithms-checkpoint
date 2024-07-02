package com.galvanize;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Algorithm {

    public boolean allEqual(String input) {
        if (input.isEmpty()) {
            return false;
        }
        String firstLetter = String.valueOf(input.charAt(0)).toLowerCase();
        for (int x = 0; x < input.length(); x++){
            if (!String.valueOf(input.charAt(x)).toLowerCase().equals(firstLetter)) {
                return false;
            }
        }
        return true;
    }

    public Map<String, Long> letterCount(String input) {
        LinkedHashMap<String, Long> results = new LinkedHashMap<>();
        for (int x = 0; x < input.length(); x++){
            String letter = String.valueOf(input.charAt(x)).toLowerCase();
            if (results.containsKey(letter)){
                results.put(letter, results.get(letter) + 1L);
            } else {
                results.put(letter, 1L);
            }
        }
        return results;
    }

    public String interleave(List<String> input1, List<String> input2){
        String result = "";
        for (int x = 0; x < input1.size(); x++) {
            result += input1.get(x) + input2.get(x);
        }
        return result;
    }


}
