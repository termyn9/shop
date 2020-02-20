package com.firstproject.FlowerPower.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //сущность необходимая в бд
public class Message {
    @Id // объяснение framework, что id - идентификатор
    @GeneratedValue(strategy= GenerationType.AUTO) //самогенерация
    private Integer id;

    private String text;
    private String tag;

    public Message(){
    }

    public Message(String text, String tag) {
        this.text = text;
        this.tag = tag;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
