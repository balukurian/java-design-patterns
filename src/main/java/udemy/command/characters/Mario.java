package udemy.command.characters;

public class Mario {
    private String name;

    public Mario(String name) {
        this.name = name;
    }

    public void jumpUp() {
        System.out.println(this.name + " Jumping up!");
    }

    public void moveLeft() {
        System.out.println(this.name + " Move Left!");
    }

    public void moveRight() {
        System.out.println(this.name + " Move Right!");
    }

    public void duck() {
        System.out.println(this.name + " Duck");
    }



    public String getName() {
        return name;
    }
}
