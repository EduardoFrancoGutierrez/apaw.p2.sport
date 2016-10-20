package es.upm.miw.apiArchitectureSport.dao;

import java.util.List;

import es.upm.miw.apiArchitectureSport.entities.*;

public interface UserSportDao extends GenericDao<UserSport, String> {
    List<String> nickUsersBySport(String sport);
}
