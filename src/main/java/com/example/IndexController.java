package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(Model model){
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("사과", 1000));
        fruits.add(new Fruit("바나나", 2000));
        fruits.add(new Fruit("귤", 300));
        fruits.add(new Fruit("망고", 2500));
        fruits.add(new Fruit("오렌지", 800));

        model.addAttribute("fruits", fruits);

        return "index";
    }
}
