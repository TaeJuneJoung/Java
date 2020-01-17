package Chater6.TemplateEx;

public class Player {
//    BeginnerLevel blevel;
//    AdvancedLevel alevel;
//    SuperLevel slevel;
    /*위와 같이 만들 경우 객체지향 프로그래밍이 아니다.*/

    PlayerLevel level;

    public Player() {
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return this.level;
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int count) {
        level.go(count);
    }
}
