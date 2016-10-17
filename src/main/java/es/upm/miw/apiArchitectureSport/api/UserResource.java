package es.upm.miw.apiArchitectureSport.api;

import es.upm.miw.apiArchitectureSport.expetions.InvalidNickException;
import es.upm.miw.apiArchitectureTheme.exceptions.InvalidThemeFieldException;

public class UserResource {

    public String createUser (String nick, String email) throws InvalidNickException{
        throw new InvalidNickException("createUser="+nick+":"+email);
    }
    
    public String allUsers() throws InvalidThemeFieldException{
        throw new InvalidThemeFieldException("allUsersEdu");
    }
    

   
}
