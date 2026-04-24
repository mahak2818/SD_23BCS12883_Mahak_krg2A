
package com.editor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Document {

    @Id
    private String id;

    @Lob
    private String content;

    public Document() {}

    public Document(String id, String content) {
        this.id = id;
        this.content = content;
    }

    public String getId() { return id; }
    public String getContent() { return content; }

    public void setId(String id) { this.id = id; }
    public void setContent(String content) { this.content = content; }
}
