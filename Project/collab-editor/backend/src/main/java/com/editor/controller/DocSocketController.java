
package com.editor.controller;

import com.editor.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.*;
import org.springframework.stereotype.Controller;

@Controller
public class DocSocketController {

    @Autowired
    private DocumentService service;

    @MessageMapping("/edit/{docId}")
    @SendTo("/topic/document/{docId}")
    public String edit(@DestinationVariable String docId, String content) {
        service.save(docId, content);
        return content;
    }
}
