package es.upm.miw.apiArchitectureSport.dao.memory;

import java.util.HashMap;

import es.upm.miw.apiArchitectureSport.dao.UserDao;
import es.upm.miw.apiArchitectureSport.entities.User;

public class UserDaoMemory extends GenericDaoMemory<User> implements UserDao {

    public UserDaoMemory() {
        this.setMap(new HashMap<String, User>());
    }

    @Override
    protected String getId(User entity) {
        return entity.getNick();
    }

    @Override
    protected void setId(User entity, Integer id) {
        entity.setId(id);
    }
    
    @Override
    public User read(String id) {
        return super.read(id);
    }

    @Override
    public void deleteById(String id) {
        super.deleteById(id);
        
    }

}
