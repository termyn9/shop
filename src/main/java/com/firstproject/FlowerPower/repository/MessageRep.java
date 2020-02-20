package com.firstproject.FlowerPower.repository;

import com.firstproject.FlowerPower.domain.Message;
import org.springframework.data.repository.CrudRepository;

//получение списка полей или по идентификатору
public interface MessageRep extends CrudRepository<Message, Long> {
}
