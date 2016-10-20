package es.upm.miw.apiArchitectureSport.wrappers;

import java.util.List;

public class UserDoSportWrapper {
    private List<String> listUserDoSport;

    public UserDoSportWrapper(List<String> listUserDoSport) {
        super();
        this.listUserDoSport = listUserDoSport;
    }

    public List<String> getListUserDoSport() {
        return listUserDoSport;
    }

    public void setListUserDoSport(List<String> listUserDoSport) {
        this.listUserDoSport = listUserDoSport;
    }
    
    public String toStringUser(String nick) {
        return "{\"nick\":" + nick + "\"}";
    }

    @Override
    public String toString() {
        String result = "{\"UserDoSportWrapper\":[ ";
        for(String user: this.listUserDoSport){
            result += this.toStringUser(user) + ",";
        }
        return  result.substring(0, result.length() - 1) + "]}";
    }
    
    

}
