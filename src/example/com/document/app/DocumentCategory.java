package example.com.document.app;

public enum DocumentCategory {
    INVOICE("faktura", 1),
    CONTRACT("kontrakt", 2),
    NOTARIAL_ACT("akt notarialny", 3),
    CERTYFICATE("certyfikat", 4);

    private String document;
    private int id;

    DocumentCategory(String document, int id) {
        this.document = document;
        this.id = id;
    }

    DocumentCategory(String document) {
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public int getId() {
        return id;
    }
}
