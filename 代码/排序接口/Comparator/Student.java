package 排序接口;

public class Student {
    private String name;
    private int height;
    private int score;

    public Student(String name, int height,int score) {
        this.name = name;
        this.height = height;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", score=" + score +
                '}';
    }
}
