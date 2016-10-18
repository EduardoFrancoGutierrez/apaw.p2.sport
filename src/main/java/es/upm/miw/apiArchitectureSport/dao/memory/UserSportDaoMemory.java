package es.upm.miw.apiArchitectureSport.dao.memory;

import java.util.HashMap;
import java.util.List;

import es.upm.miw.apiArchitectureSport.dao.UserSportDao;
import es.upm.miw.apiArchitectureSport.entities.User;
import es.upm.miw.apiArchitectureSport.entities.UserSport;



public class UserSportDaoMemory extends GenericDaoMemory<UserSport> implements UserSportDao {
    
    public UserSportDaoMemory(){
        this.setMap(new HashMap<String,UserSport>());
    }

    @Override
    public List<User> nickUsersBySport(String sport) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean addSportInUser(String nick, String sport) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected String getId(UserSport entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected void setId(UserSport entity, Integer id) {
        // TODO Auto-generated method stub
        
    }

  

   
}
