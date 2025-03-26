package example.com.document;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<Document> documents = new ArrayList<>();
        documents.add(new Document("faktura", "rok", 39, DocumentType.INVOICE, 1));
        documents.add(new Document("kontrakt", "dwa lata", 50, DocumentType.CONTRACT, 2));
        documents.add(new Document("akt notarialny", "dwa miesiące", 319, DocumentType.NOTARIAL_ACT, 3));
        documents.add(new Document("certyfikat", "pięć miesięcy", 2, DocumentType.CERTYFICATE, 4));
        for(Document document : documents) System.out.println(document);

        System.out.println("Wprowadz nazwę");
        String name = scanner.nextLine();
        System.out.println("Wprowadź czas");
        String duration = scanner.nextLine();
        System.out.println("Podaj ilość stron");
        int pages = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Wprowadz typ dokumentu");
        String type = scanner.nextLine();

        DocumentType documentType = getDocumentType(type);

        if (documentType != null){
            documents.add(new Document(name, duration, pages, documentType, documentType.getId()));
            System.out.println("Utworzono obiekt");
        }
        else System.out.println("Wprowadzono wartość z poza Enum'a");
        for (Document document: documents){
            System.out.println(document);
        }

        System.out.println("Wprowadź id dokumentu");
        int id = scanner.nextInt();
        Document document = getDocumentById(documents, id);
        if (document != null) {
            System.out.println("Znaleziono dokument: " + document);
        } else {
            System.out.println("Nie znaleziono dokumentu o podanym id");
        }
    }

    public static DocumentType getDocumentType(String documentName){
        switch(documentName){
            case "faktura" ->{
                return DocumentType.INVOICE;
            }
            case "kontrakt" ->{
                return DocumentType.CONTRACT;
            }
            case "akt notarialny" ->{
                return DocumentType.NOTARIAL_ACT;
            }
            case "certyfikat" -> {
                return DocumentType.CERTYFICATE;
            }
            default -> {
                return null;
            }
        }
    }

    public static Document getDocumentById(List<Document> documents, int id) {
        for (Document document : documents) {
            if (document.getId() == id) {
                return document;
            }
        }
        return null;
    }
}