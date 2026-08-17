package com.example.gaebviewer.domain;

public class GaebTextComplement {

    private String markLabel;
    private String caption;
    private String body = "";
    private String placeholder;
    private String tail;
    private boolean required;

    public String getMarkLabel() {
        return markLabel;
    }

    public void setMarkLabel(String markLabel) {
        this.markLabel = markLabel;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body == null ? "" : body;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public boolean hasValue() {
        return body != null && !body.isBlank();
    }

    public boolean isMissingRequiredValue() {
        return required && !hasValue();
    }
}
