package com.practicaldemo.model;

import java.util.List;

public class TitleBean {
                /**
                 * value : Why Did the World Shut Down for Covid-19 but Not Ebola, SARS or Swine Flu?
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