package edu.asu.diging.tallify.model;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class CountWordsBean {
    private String textValue;
    private Map<String, Integer> listOfWords;
    private String stopWords;

    public String getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    public Map<String, Integer> getListOfWords() {
        return listOfWords;
    }

    public void setListOfWords(Map<String, Integer> listOfWords) {
        this.listOfWords = listOfWords;
    }

    public String getStopWords() {
        return stopWords;
    }

    public void setStopWords(String stopWords) {
        this.stopWords = stopWords;
    }

}
