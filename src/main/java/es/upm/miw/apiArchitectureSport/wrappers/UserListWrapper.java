package es.upm.miw.apiArchitectureSport.wrappers;

import java.util.ArrayList;
import java.util.List;

public class UserListWrapper {
    List<UserWrapper> userListWrapper;

    public UserListWrapper() {
        this.userListWrapper = new ArrayList<>();
    }

    public List<UserWrapper> getUserListWrapper() {
        return userListWrapper;
    }

    public void addUserListWrapper(UserWrapper userWrapper) {
        this.userListWrapper.add(userWrapper);
    }

    @Override
    public String toString() {
        String result = "{\"userListWrapper\":[ ";
        for (UserWrapper userWrapper : userListWrapper) {
            result += userWrapper.toString() + ",";
        }
        return result.substring(0, result.length() - 1) + "]}";
    }

}
