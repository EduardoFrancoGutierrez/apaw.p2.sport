package es.upm.miw.apiArchitectureSport.entities;

public class UserSport {
    private String nickUser;

    private String nameSport;

    private String id;

    public UserSport(String nickUser, String nameSport) {
        super();
        this.nickUser = nickUser;
        this.nameSport = nameSport;
    }

    public String getNickUser() {
        return nickUser;
    }

    public void setNickUser(String nickUser) {
        this.nickUser = nickUser;
    }

    public String getNameSport() {
        return nameSport;
    }

    public void setNameSport(String nameSport) {
        this.nameSport = nameSport;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserSport [nickUser=" + nickUser + ", nameSport=" + nameSport + ", id=" + id + "]";
    }

}
