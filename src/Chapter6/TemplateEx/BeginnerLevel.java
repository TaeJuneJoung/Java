package Chapter6.TemplateEx;

public class BeginnerLevel extends PlayerLevel {
    @Override
    protected void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    protected void jump() {
        System.out.println("Jump할 줄 모르지롱.");
    }

    @Override
    protected void turn() {
        System.out.println("Turn할 줄 모르지롱.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** 초보자 레벨 입니다. *****");
    }
}
