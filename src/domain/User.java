package domain;

import java.util.Arrays;
import java.util.List;

public class User {
    private String user_name;
    private String user_age;
    private String hobby[];
    private Dog dog;
    private List<Dog> dogs;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_age() {
        return user_age;
    }

    public void setUser_age(String user_age) {
        this.user_age = user_age;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(List<Dog> dogs) {
        this.dogs = dogs;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_name='" + user_name + '\'' +
                ", user_age='" + user_age + '\'' +
                ", hobby=" + Arrays.toString(hobby) +
                ", dog=" + dog +
                ", dogs=" + dogs +
                '}';
    }
}
