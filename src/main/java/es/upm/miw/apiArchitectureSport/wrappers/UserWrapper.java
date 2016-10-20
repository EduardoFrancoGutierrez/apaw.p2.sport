package es.upm.miw.apiArchitectureSport.wrappers;

public class UserWrapper {
    private String nick;

    private String mail;

    public UserWrapper(){
        super();
    }
    public UserWrapper(String nick, String mail) {
        super();
        this.nick = nick;
        this.mail = mail;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "{\"nick\":" + nick + ",\"mail\":\"" + mail + "\"}";
    }
    
    
    
}
