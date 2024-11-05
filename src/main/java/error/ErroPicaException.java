package error;

public class ErroPicaException extends RuntimeException {

    private String nomeDoAtributo;

    ErroPicaException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return nomeDoAtributo;
    }


}
