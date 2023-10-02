package StreamAPI;
//王者荣耀
//英雄，名字，血量
//将所有血量值小于5000的英雄取出
public class Hero {
    private String name;
    private int blood;

    public Hero() {
    }

    public Hero(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", blood=" + blood +
                '}';
    }
}

