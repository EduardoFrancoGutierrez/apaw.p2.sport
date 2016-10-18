package es.upm.miw.apiArchitectureSport.controller;

import java.util.List;

import es.upm.miw.apiArchitectureSport.dao.DaoFactory;
import es.upm.miw.apiArchitectureSport.entities.User;
import es.upm.miw.apiArchitectureSport.expetions.InvalidNickException;
import es.upm.miw.apiArchitectureSport.wrappers.UserListWrapper;
import es.upm.miw.apiArchitectureSport.wrappers.UserWrapper;

public class UserController {

    public void createUser(String nick, String email) throws InvalidNickException {
        int sizeOld=DaoFactory.getFactory().getUserDao().size();
        DaoFactory.getFactory().getUserDao().create(new User(nick, email));
        int sizeNew=DaoFactory.getFactory().getUserDao().size();
        if (sizeOld==sizeNew)
            throw new InvalidNickException(nick);
    }

    public String allUsers() {
        List<User> usuarios = DaoFactory.getFactory().getUserDao().findAll();
        //String cantidadUsuarios = "[Total de usuarios=" + usuarios.size() + "]";
        UserListWrapper userListWrapper= new UserListWrapper();
        for (User user: usuarios){
            userListWrapper.addUserListWrapper(new UserWrapper(user.getNick(),user.getMail()));
        }
        return userListWrapper.toString();
    }

}
