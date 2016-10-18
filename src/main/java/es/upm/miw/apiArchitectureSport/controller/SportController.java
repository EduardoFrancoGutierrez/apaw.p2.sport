package es.upm.miw.apiArchitectureSport.controller;

import es.upm.miw.apiArchitectureSport.dao.DaoFactory;
import es.upm.miw.apiArchitectureSport.entities.Sport;
import es.upm.miw.apiArchitectureSport.expetions.InvalidSportException;



public class SportController {
    
    public void createSport (String name) throws InvalidSportException{
        int sizeOld=DaoFactory.getFactory().getSportDao().size();
        DaoFactory.getFactory().getSportDao().create(new Sport(name));
        int sizeNew=DaoFactory.getFactory().getSportDao().size();
        if (sizeOld==sizeNew)
            throw new InvalidSportException(name);
    }

}
