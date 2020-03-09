package com.firstproject.FlowerPower;

import com.firstproject.FlowerPower.domain.Message;
import com.firstproject.FlowerPower.repository.MessageRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class GreetingController { //слушает запросы от пользователя по map
    @Autowired
    MessageRep messageRep;

    @RequestMapping("/")      //и возвращает данные
    public String greeting(
            //Полное описание RequestParam c написанеим от руки ()
            @RequestParam(name = "name", required = false, defaultValue = "World") String name,
            Map<String, Object> model //то, куда складыать данные, вовзращаемые пользователю
    ) { //Map-стр-ра java с ключем string, значением object
        model.put("name", name);
        return "greeting"; //возвращаемый файл-шаблон, описываемый далее
    }

    @GetMapping
    public String main(Map<String, Object> model) {
        Iterable<Message> messages = messageRep.findAll();
        model.put("messages", messages);
        return "main";
    }

    @PostMapping //RequestParam дёргает значение из описанных полей (краткое)
    public String add(@RequestParam String text, @RequestParam String tag, Map<String, Object> model) {
        Message message = new Message(text, tag); //сохранение
        messageRep.save(message);

        Iterable<Message> messages = messageRep.findAll(); //берем из репо
        model.put("messages", messages); //кладём в модель

        return "main"; //отдали пользователю
    }

    @PostMapping("filter")
    public String filter(@RequestParam String filter, Map<String, Object> model) {
        List<Message> messages = messageRep.findByTag(filter);

        model.put("messages", messages);

        return "main";
    }
}
