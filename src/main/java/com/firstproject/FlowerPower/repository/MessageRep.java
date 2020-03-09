package com.firstproject.FlowerPower.repository;

import com.firstproject.FlowerPower.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

//получение списка полей или по идентификатору
public interface MessageRep extends CrudRepository<Message, Long> {
    List<Message> findByTag(String tag);
}
