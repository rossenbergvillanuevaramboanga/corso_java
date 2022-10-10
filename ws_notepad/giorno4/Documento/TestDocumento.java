public class TestDocumento {

    public static void main(String[] args){

        Documento doc1 = new Documento();
        Documento doc2 = new Documento();
        Documento docCarta = new CartaIdentita();
        Documento docPatente = new Patente();

        Documento[] cartella = {doc1, doc2, docCarta, docPatente};

        System.out.println(Documento.quantiDocumenti(cartella));

    }
    
}
