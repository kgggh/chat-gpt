package com.gpt.service;

import com.gpt.infra.ChatGptClient;
import com.gpt.model.ChatGptChatRequestDto;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatGptService {

    @Value("${open-ai.secret-key}")
    private String secretKey;

    private final ChatGptClient chatGptClient;

    public Map<String, Object> chat(String message) {
        ChatGptChatRequestDto chatGptChatRequestDto = new ChatGptChatRequestDto(message);
        return chatGptClient.chat("Bearer " + secretKey, chatGptChatRequestDto);
    }
}
