package domain.model;

import domain.model.guide.BuildOfChampion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author : Lelental on 07.02.2017
 */
@Component
public class User {

    private String nick;
    private String password;
    private String email;
    private List<BuildOfChampion> buildOfChampions;

    public User() {
    }

    public List<BuildOfChampion> getBuildOfChampions() {
        return buildOfChampions;
    }

    @Autowired
    public void setBuildOfChampions(List<BuildOfChampion> buildOfChampions) {
        this.buildOfChampions = buildOfChampions;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
