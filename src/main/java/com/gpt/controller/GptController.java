package com.gpt.controller;

import com.gpt.service.ChatGptService;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GptController {

    private final ChatGptService chatGptService;

    @GetMapping("/chat")
    public Map<String, Object> answer(@RequestParam String message) {
        return chatGptService.chat(message);
    }
}
