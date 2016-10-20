package es.upm.miw.apiArchitectureSport.entities;

public class User {

    private String nick;

    private String mail;
    
    private int id;

    public User(String nick, String mail) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User [nick=" + nick + ", mail=" + mail + ", id=" + id + "]";
    }

   

}
