package es.upm.miw.apiArchitectureSport.controller;

import java.util.List;

import es.upm.miw.apiArchitectureSport.dao.DaoFactory;
import es.upm.miw.apiArchitectureSport.entities.Sport;
import es.upm.miw.apiArchitectureSport.entities.User;
import es.upm.miw.apiArchitectureSport.entities.UserSport;
import es.upm.miw.apiArchitectureSport.expetions.NotFoundSportException;
import es.upm.miw.apiArchitectureTheme.exceptions.InvalidThemeFieldException;

public class UserSportController {

    public List<String> nickUsersBySport(String SportName) throws InvalidThemeFieldException{
        Sport sport= DaoFactory.getFactory().getSportDao().read(SportName);
        if (sport==null)
            throw new InvalidThemeFieldException("nickUsersBySport="+SportName);
        else
        {
           return DaoFactory.getFactory().getUserSportDao().nickUsersBySport(SportName);
        }
    }
    
    public void addSportInUser(String nick, String sport ) throws NotFoundSportException{
        if (validationAddSportInUser(nick,sport)){
            DaoFactory.getFactory().getUserSportDao().create(new UserSport(nick,sport));
        }
        else
            throw new NotFoundSportException("addSportInUser="+nick+","+sport);
    }
    
    private Boolean validationAddSportInUser(String nick, String sportName ){
        User user=DaoFactory.getFactory().getUserDao().read(nick); 
        Sport sport= DaoFactory.getFactory().getSportDao().read(sportName);
        if (sport==null || user==null)
            return false;
        return true;
    }
}
