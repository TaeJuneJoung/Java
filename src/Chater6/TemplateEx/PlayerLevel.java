package Chater6.TemplateEx;

public abstract class PlayerLevel {
    protected abstract void run();
    protected abstract void jump();
    protected abstract void turn();
    public abstract void showLevelMessage();

    final public void go(int count) {
        run();
        for(int i=0; i < count; i++) {
            jump();
        }
        turn();
    }
}
