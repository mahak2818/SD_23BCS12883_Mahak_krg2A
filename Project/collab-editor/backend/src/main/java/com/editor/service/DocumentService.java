
package com.editor.service;

import com.editor.model.Document;
import com.editor.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentService {

    @Autowired
    private DocumentRepository repo;

    public Document getDoc(String id) {
        return repo.findById(id).orElse(new Document(id, ""));
    }

    public void save(String id, String content) {
        repo.save(new Document(id, content));
    }
}
