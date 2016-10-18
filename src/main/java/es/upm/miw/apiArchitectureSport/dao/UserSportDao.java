package es.upm.miw.apiArchitectureSport.dao;

import java.util.List;

import es.upm.miw.apiArchitectureSport.entities.*;

public interface UserSportDao extends GenericDao<UserSport, String> {
    List<User> nickUsersBySport(String sport);

    Boolean addSportInUser(String nick, String sport);
}
