package com.practicaldemo.model;

import java.util.List;

public class HighlightResultBean {
            /**
             * title : {"value":"Why Did the World Shut Down for Covid-19 but Not Ebola, SARS or Swine Flu?","matchLevel":"none","matchedWords":[]}
             * url : {"value":"https://fivethirtyeight.com/features/why-did-the-world-shut-down-for-covid-19-but-not-ebola-sars-or-swine-flu/","matchLevel":"none","matchedWords":[]}
             * author : {"value":"lordmax","matchLevel":"none","matchedWords":[]}
             */

            private TitleBean title;
            private UrlBean url;
            private AuthorBean author;

            public TitleBean getTitle() {
                return title;
            }

            public void setTitle(TitleBean title) {
                this.title = title;
            }

            public UrlBean getUrl() {
                return url;
            }

            public void setUrl(UrlBean url) {
                this.url = url;
            }

            public AuthorBean getAuthor() {
                return author;
            }

            public void setAuthor(AuthorBean author) {
                this.author = author;
            }


        }