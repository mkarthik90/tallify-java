package edu.asu.diging.tallify.service;

import java.util.Map;

public interface ICountWordService {

    
    public Map<String,Integer> calculateCount(String text,String stopWords);
    
}
