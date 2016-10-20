package es.upm.miw.apiArchitectureSport.expetions;

public class InvalidSportException extends Exception {
    private static final long serialVersionUID = -642045799876625537L;
    public static final String DESCRIPTION = "Deporte ya existente";

    public InvalidSportException(String detail) {
        super(DESCRIPTION + ". " + detail);
    }

    public InvalidSportException() {
        this("");
    }

}
