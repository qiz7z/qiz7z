package Lambda;

public class Hero {
    private String name;
    private String job;
    private int blood;

    public Hero() {
    }

    public Hero(String name, String job, int blood) {
        this.name = name;
        this.job = job;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", blood=" + blood +
                '}';
    }
}
