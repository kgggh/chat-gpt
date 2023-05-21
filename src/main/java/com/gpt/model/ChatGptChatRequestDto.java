package com.gpt.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ChatGptChatRequestDto extends ChatGptBase {

    private List<Messages> messages;

    public ChatGptChatRequestDto(String messages) {
        this.messages = List.of(new Messages("user", messages));
    }

    @Override
    public String getModel() {
        return "gpt-3.5-turbo";
    }

    @Data
    @AllArgsConstructor
    static class Messages {

        private String role;
        private String content;
    }
}
