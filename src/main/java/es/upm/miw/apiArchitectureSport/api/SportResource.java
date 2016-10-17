package es.upm.miw.apiArchitectureSport.api;

import es.upm.miw.apiArchitectureSport.expetions.InvalidSportException;

public class SportResource {
    
    public String createSport (String name) throws InvalidSportException{
        throw new InvalidSportException("createSport="+name);
    }
}
