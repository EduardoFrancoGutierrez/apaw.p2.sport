package es.upm.miw.apiArchitectureSport.api;

import es.upm.miw.apiArchitectureSport.controller.SportController;
import es.upm.miw.apiArchitectureSport.expetions.InvalidSportException;
import es.upm.miw.apiArchitectureSport.expetions.InvalidUserSportException;

public class SportResource {
    
    public void createSport (String name) throws InvalidSportException, InvalidUserSportException{
        this.validateField(name);
        new SportController().createSport(name);
    }
    
    private void validateField(String field) throws InvalidUserSportException {
        if (field == null || field.isEmpty()) {
            throw new InvalidUserSportException(field);
        }
    }
}
