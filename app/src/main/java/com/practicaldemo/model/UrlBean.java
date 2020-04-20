package com.practicaldemo.model;

import java.util.List;

public class UrlBean {
    /**
     * value : https://fivethirtyeight.com/features/why-did-the-world-shut-down-for-covid-19-but-not-ebola-sars-or-swine-flu/
     * matchLevel : none
     * matchedWords : []
     */

    private String value;
    private String matchLevel;
    private List<?> matchedWords;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getMatchLevel() {
        return matchLevel;
    }

    public void setMatchLevel(String matchLevel) {
        this.matchLevel = matchLevel;
    }

    public List<?> getMatchedWords() {
        return matchedWords;
    }

    public void setMatchedWords(List<?> matchedWords) {
        this.matchedWords = matchedWords;
    }
}