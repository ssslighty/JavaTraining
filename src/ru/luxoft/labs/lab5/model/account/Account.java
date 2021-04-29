package ru.luxoft.labs.lab5.model.account;

import ru.luxoft.labs.lab5.model.score.Score;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

public class Account {
    private Principal principal;
    private String login;
    private String password;
    private Map<Integer, Score> scoreMap;

    public Account(Principal principal, String login, String password) {
        this.principal = principal;
        this.login = login;
        this.password = password;
        scoreMap = new HashMap<>();
    }

    public Map<Integer, Score> getScoreMap() {
        return scoreMap;
    }

    public void setScoreMap(Map<Integer, Score> scoreMap) {
        this.scoreMap = scoreMap;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
