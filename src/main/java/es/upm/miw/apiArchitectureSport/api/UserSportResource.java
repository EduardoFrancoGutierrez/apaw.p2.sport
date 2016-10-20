package es.upm.miw.apiArchitectureSport.api;

import es.upm.miw.apiArchitectureSport.controller.UserSportController;
import es.upm.miw.apiArchitectureSport.expetions.NotFoundSportException;
import es.upm.miw.apiArchitectureSport.wrappers.UserDoSportWrapper;

public class UserSportResource {
    
    public String nickUsersBySport(String Sport) throws NotFoundSportException {
         UserDoSportWrapper userDoSport= new UserDoSportWrapper (new UserSportController().nickUsersBySport(Sport));
         return userDoSport.toString();
    }
    
    public void addSportInUser(String nick, String sport ) throws NotFoundSportException{
        new UserSportController().addSportInUser(nick, sport);
    }
}
