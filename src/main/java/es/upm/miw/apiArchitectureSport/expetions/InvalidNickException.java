package es.upm.miw.apiArchitectureSport.expetions;

public class InvalidNickException extends Exception {
    private static final long serialVersionUID = -642045799876625537L;
    public static final String DESCRIPTION = "Nick de usuario ya existente";

    public InvalidNickException(String detail) {
        super(DESCRIPTION + ". " + detail);
    }

    public InvalidNickException() {
        this("");
    }
}
