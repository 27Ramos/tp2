package TP2.app;

public class DocumentoID{
    private final String codigo;
    private  final TipoDocumento tipo;

    public  DocumentoID(String codigo,TipoDocumento tipo){
        this.codigo = codigo;
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public TipoDocumento getTipo() {
        return tipo;
    }

    public  DocumentoID(DocumentoID doc){
        this.codigo = doc.codigo;
        this.tipo = doc.tipo;
    }


}
