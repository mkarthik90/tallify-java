package edu.asu.diging.tallify.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class CountWordsService implements ICountWordService {

    Set<String> stopWords = new LinkedHashSet<String>();

    public Map<String, Integer> calculateCount(String inputText, String stopWords) {

        if (stopWords != null && stopWords.trim().equalsIgnoreCase("")) {
            setStopWords(stopWords);
        }

        String[] inputWords = inputText.split(" ");
        Map<String, Integer> wordCount = new HashMap<String, Integer>();
        for (String inputWord : inputWords) {
            if (!stopWords.contains(inputWord)) {

                if (wordCount.keySet().contains(inputWord)) {
                    wordCount.put(inputWord, wordCount.get(inputWord) + 1);
                } else {
                    wordCount.put(inputWord, 1);
                }
            }
        }
        return wordCount;

    }

    private void setStopWords(String stopWordString) {
        stopWords = new LinkedHashSet<String>(Arrays.asList(stopWordString.split(",")));
    }

}
