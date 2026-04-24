
package com.editor.controller;

import com.editor.model.Document;
import com.editor.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/docs")
public class DocumentController {

    @Autowired
    private DocumentService service;

    @GetMapping("/{id}")
    public Document get(@PathVariable String id) {
        return service.getDoc(id);
    }
}
