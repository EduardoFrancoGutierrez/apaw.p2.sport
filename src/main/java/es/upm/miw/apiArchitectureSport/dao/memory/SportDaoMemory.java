package es.upm.miw.apiArchitectureSport.dao.memory;

import java.util.HashMap;

import es.upm.miw.apiArchitectureSport.dao.SportDao;
import es.upm.miw.apiArchitectureSport.entities.Sport;

public class SportDaoMemory extends GenericDaoMemory<Sport> implements SportDao {

    public SportDaoMemory(){
        this.setMap(new HashMap<String,Sport>());
    }

    @Override
    public Sport read(String id) {
        return super.read(id);
    }

    @Override
    public void deleteById(String id) {
        super.deleteById(id);
        
    }

    @Override
    protected String getId(Sport entity) {
        return entity.getName();
    }

    @Override
    protected void setId(Sport entity, Integer id) {
        entity.setId(id);
        
    }
    
   
}
