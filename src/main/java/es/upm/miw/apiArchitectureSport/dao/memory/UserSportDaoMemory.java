package es.upm.miw.apiArchitectureSport.dao.memory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import es.upm.miw.apiArchitectureSport.dao.UserSportDao;
import es.upm.miw.apiArchitectureSport.entities.UserSport;



public class UserSportDaoMemory extends GenericDaoMemory<UserSport> implements UserSportDao {
    
    public UserSportDaoMemory(){
        this.setMap(new HashMap<String,UserSport>());
    }

    @Override
    public List<String> nickUsersBySport(String sport) {
        List<UserSport>  listUser=  this.findAll();
        List<String> listUserDoSport= new ArrayList <String>();
        for (UserSport user: listUser){
            if (sport.equals(user.getNameSport()))
                listUserDoSport.add(user.getNickUser());
        }
        return listUserDoSport;
    }



    @Override
    protected String getId(UserSport entity) {
        return entity.getNickUser()+":"+entity.getNameSport();
    }

    @Override
    protected void setId(UserSport entity, Integer id) {
        
    }

  

   
}
