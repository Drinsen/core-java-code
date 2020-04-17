package test;

/**
 * description:
 * @author :刘俊新(junxin.liu@ucarinc.com)
 * @version :V1.0
 * @date :2020-04-07 16:02:32
 */

public class student {
    private String name;
    private String school;
    private int age;

    public student(String name, String school, int age) {
        this.name = name;
        this.school = school;
        this.age = age;
    }

    public student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", age=" + age +
                '}';
    }
}
