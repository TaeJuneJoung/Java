package Chater6.Abstract;

public class ComputerTest {
    public static void main(String[] args) {
//        Computer computer = new Computer(); //인스턴스화 할 수 없음
        Computer computer = new DeskTop();
        computer.display(); //DeskTop display
        computer.turnOff();

        Notebook notebook = new MyNotebook();
        notebook.typing();
        notebook.display();
        notebook.turnOff();
    }
}
