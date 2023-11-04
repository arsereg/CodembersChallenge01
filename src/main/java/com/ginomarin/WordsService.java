package com.ginomarin;

import java.util.LinkedHashMap;
import java.util.List;

public class WordsService {

    public String getWords(String text){
        StringBuilder sb = new StringBuilder();
        List<String> words = List.of(text.split(" "));
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        words.stream().map(String::toLowerCase).forEach(word -> {
            int count = map.getOrDefault(word, 0);
            map.put(word, ++count);
        });
        map.keySet().forEach( key -> {
            sb.append(key + map.get(key));
        });
        return sb.toString();
    }

}
