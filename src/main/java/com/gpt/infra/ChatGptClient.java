package com.gpt.infra;

import com.gpt.model.ChatGptChatRequestDto;
import java.util.Map;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "chat-gpt", url = "https://api.openai.com")
public interface ChatGptClient {

    @PostMapping("v1/chat/completions")
    Map<String, Object> chat(@RequestHeader("Authorization") String authorization,
        @RequestBody ChatGptChatRequestDto chatGptChatRequestDto);
}
