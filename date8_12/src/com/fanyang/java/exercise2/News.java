package com.fanyang.java.exercise2;

import java.util.Objects;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-12 16:46
 */
public class News<S1, S2, S3> {
    private S1 Title;
    private S2 author;
    private S3 content;

    public News() {
    }

    public News(S1 title, S2 author, S3 content) {
        Title = title;
        this.author = author;
        this.content = content;
    }

    public S1 getTitle() {
        return Title;
    }

    public void setTitle(S1 title) {
        Title = title;
    }

    public S2 getAuthor() {
        return author;
    }

    public void setAuthor(S2 author) {
        this.author = author;
    }

    public S3 getContent() {
        return content;
    }

    public void setContent(S3 content) {
        this.content = content;
    }
    public void spilt(S1 title){

    }

    @Override
    public String toString() {
        return "Title=" + Title ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof News)) return false;
        News<?, ?, ?> news = (News<?, ?, ?>) o;
        return Objects.equals(getTitle(), news.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle());
    }
}
