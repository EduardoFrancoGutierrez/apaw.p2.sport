package es.upm.miw.apiArchitectureSport.expetions;

public class InvalidUserSportException extends Exception {
    private static final long serialVersionUID = -642045799876625537L;
    public static final String DESCRIPTION = "Campo introducido no valido";

    public InvalidUserSportException(String detail) {
        super(DESCRIPTION + ". " + detail);
    }

    public InvalidUserSportException() {
        this("");
    }

}
