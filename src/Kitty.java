public class Kitty extends Cat{
    private String nickname;

    public Kitty(String name, int age, String nickname) {
        super(name, age);
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

}
