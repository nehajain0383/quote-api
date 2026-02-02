package com.neha.quoteapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {

    private final List<String> quotes = List.of(
            "Code is like humor. When you have to explain it, it’s bad.",
            "First, solve the problem. Then, write the code.",
            "Experience is the name everyone gives to their mistakes.",
            "In order to be irreplaceable, one must always be different.",
            "One should always learn from his mistakes.",
            "Java today, leader tomorrow."
    );

    private final Random random = new Random();


    @GetMapping("/")
    public String home() {
        return "Quote API is running 🚀";
    }

    @GetMapping("/quote")
    public String getQuote() {
        return quotes.get(random.nextInt(quotes.size()));
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
