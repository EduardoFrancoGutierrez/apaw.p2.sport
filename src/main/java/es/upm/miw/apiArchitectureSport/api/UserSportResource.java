package es.upm.miw.apiArchitectureSport.api;

import es.upm.miw.apiArchitectureSport.controller.UserSportController;
import es.upm.miw.apiArchitectureSport.expetions.NotFoundSportException;
import es.upm.miw.apiArchitectureTheme.exceptions.InvalidThemeFieldException;

public class UserSportResource {
    
    public String nickUsersBySport(String Sport) throws InvalidThemeFieldException{
        return new UserSportController().nickUsersBySport(Sport);
    }
    
    public String addSportInUser(String nick, String sport ) throws NotFoundSportException{
        return new UserSportController().addSportInUser(nick, sport).toString();
    }
}
