package es.upm.miw.apiArchitectureSport.api;

import es.upm.miw.apiArchitectureSport.controller.UserController;
import es.upm.miw.apiArchitectureSport.expetions.InvalidNickException;
import es.upm.miw.apiArchitectureSport.expetions.InvalidUserSportException;

public class UserResource {

    public void createUser (String nick, String email) throws InvalidUserSportException, InvalidNickException{
        this.validateField(nick);
        this.validateField(email);
        new UserController().createUser(nick, email);
    }
    
    public String allUsers() throws InvalidUserSportException{
        return new UserController().allUsers();
    }
    
    private void validateField(String field) throws InvalidUserSportException {
        if (field == null || field.isEmpty()) {
            throw new InvalidUserSportException(field);
        }
    }

   
}
