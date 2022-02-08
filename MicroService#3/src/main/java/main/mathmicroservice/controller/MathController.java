package main.mathmicroservice.controller;

import main.mathmicroservice.Question.Question;
import main.mathmicroservice.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Sergey Serdyuk
 */
@RestController
@RequestMapping("/api")
public class MathController {

    @Autowired
    private MathService mathService;

    @GetMapping("/questions")
    public List<Question> getRandomQuestions(@RequestParam("amount") int amount) {
        return  IntStream.range(0, amount)
                .mapToObj(i -> mathService.getRandom())
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
