package com.gpt.model;

import lombok.Data;

@Data
public abstract class ChatGptBase {
    abstract String getModel();
}
