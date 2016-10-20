package es.upm.miw.apiArchitectureSport.dao.memory;

import es.upm.miw.apiArchitectureSport.dao.DaoFactory;
import es.upm.miw.apiArchitectureSport.dao.SportDao;
import es.upm.miw.apiArchitectureSport.dao.UserDao;
import es.upm.miw.apiArchitectureSport.dao.UserSportDao;

public class DaoFactoryMemory extends DaoFactory {

    private SportDao sportDao;

    private UserDao userDao;

    private UserSportDao userSportDao;

    public DaoFactoryMemory() {
    }

    @Override
    public SportDao getSportDao() {
        if (this.sportDao == null)
            this.sportDao = new SportDaoMemory();
        return this.sportDao;
    }

    @Override
    public UserDao getUserDao() {
        if (this.userDao == null)
            this.userDao = new UserDaoMemory();
        return this.userDao;
    }

    @Override
    public UserSportDao getUserSportDao() {

        if (this.userSportDao == null)
            this.userSportDao = new UserSportDaoMemory();
        return this.userSportDao;
    }

}
