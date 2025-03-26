public class Wolf {
    private String gender;
    private String nickname;
    private float weight;
    private int age;
    private String color;

    void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    /* public void walk() {
        System.out.println("Идёт");
    }

    public void sit() {
        System.out.println("Сидит");
    }

    public void run() {
        System.out.println("Бежит");
    }

    public void howl() {
        System.out.println("Воет");
    }

    public void hunt() {
        System.out.println("Охотится");
    }*/
}