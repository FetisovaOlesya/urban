package org.example.module1;

public class Gamer {
    private String nickname;
    private boolean isActive;


    public Gamer(String nickname, boolean isActive) {
        this.nickname = nickname;
        this.isActive = isActive;
    }


    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getNickname() {
        return this.nickname;
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "nickname='" + nickname + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
