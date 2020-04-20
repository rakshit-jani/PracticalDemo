package com.practicaldemo.model;

import java.util.List;

public class HitsBean {
        /**
         * created_at : 2020-04-20T06:33:44.000Z
         * title : Why Did the World Shut Down for Covid-19 but Not Ebola, SARS or Swine Flu?
         * url : https://fivethirtyeight.com/features/why-did-the-world-shut-down-for-covid-19-but-not-ebola-sars-or-swine-flu/
         * author : lordmax
         * points : 3
         * story_text : null
         * comment_text : null
         * num_comments : 0
         * story_id : null
         * story_title : null
         * story_url : null
         * parent_id : null
         * created_at_i : 1587364424
         * _tags : ["story","author_lordmax","story_22921676"]
         * objectID : 22921676
         * _highlightResult : {"title":{"value":"Why Did the World Shut Down for Covid-19 but Not Ebola, SARS or Swine Flu?","matchLevel":"none","matchedWords":[]},"url":{"value":"https://fivethirtyeight.com/features/why-did-the-world-shut-down-for-covid-19-but-not-ebola-sars-or-swine-flu/","matchLevel":"none","matchedWords":[]},"author":{"value":"lordmax","matchLevel":"none","matchedWords":[]}}
         */

        private String created_at;
        private String title;
        private String url;
        private String author;
        private int points;
        private String story_text;
        private String comment_text;
        private int num_comments;
        private String story_id;
        private String story_title;
        private String story_url;
        private String parent_id;
        private int created_at_i;
        private String objectID;
        private HighlightResultBean _highlightResult;
        private List<String> _tags;

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getPoints() {
            return points;
        }

        public void setPoints(int points) {
            this.points = points;
        }

        public String getStory_text() {
            return story_text;
        }

        public void setStory_text(String story_text) {
            this.story_text = story_text;
        }

        public String getComment_text() {
            return comment_text;
        }

        public void setComment_text(String comment_text) {
            this.comment_text = comment_text;
        }

        public int getNum_comments() {
            return num_comments;
        }

        public void setNum_comments(int num_comments) {
            this.num_comments = num_comments;
        }

        public String getStory_id() {
            return story_id;
        }

        public void setStory_id(String story_id) {
            this.story_id = story_id;
        }

        public String getStory_title() {
            return story_title;
        }

        public void setStory_title(String story_title) {
            this.story_title = story_title;
        }

        public String getStory_url() {
            return story_url;
        }

        public void setStory_url(String story_url) {
            this.story_url = story_url;
        }

        public String getParent_id() {
            return parent_id;
        }

        public void setParent_id(String parent_id) {
            this.parent_id = parent_id;
        }

        public int getCreated_at_i() {
            return created_at_i;
        }

        public void setCreated_at_i(int created_at_i) {
            this.created_at_i = created_at_i;
        }

        public String getObjectID() {
            return objectID;
        }

        public void setObjectID(String objectID) {
            this.objectID = objectID;
        }

        public HighlightResultBean get_highlightResult() {
            return _highlightResult;
        }

        public void set_highlightResult(HighlightResultBean _highlightResult) {
            this._highlightResult = _highlightResult;
        }

        public List<String> get_tags() {
            return _tags;
        }

        public void set_tags(List<String> _tags) {
            this._tags = _tags;
        }

    }