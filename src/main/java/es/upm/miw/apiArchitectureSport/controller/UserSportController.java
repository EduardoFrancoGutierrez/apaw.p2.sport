package es.upm.miw.apiArchitectureSport.controller;

import es.upm.miw.apiArchitectureSport.expetions.NotFoundSportException;
import es.upm.miw.apiArchitectureTheme.exceptions.InvalidThemeFieldException;

public class UserSportController {

    public String nickUsersBySport(String Sport) throws InvalidThemeFieldException{
        throw new InvalidThemeFieldException("nickUsersBySport="+Sport);
    }
    
    public Boolean addSportInUser(String nick, String sport ) throws NotFoundSportException{
        throw new NotFoundSportException("addSportInUser="+nick+","+sport);
    }
}
