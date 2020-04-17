package test;

/**
 * description:
 * @author :刘俊新(junxin.liu@ucarinc.com)
 * @version :V1.0
 * @date :2020-04-07 16:03:41
 */
public class SuperClass {
    private String name;
    private String school;

    public SuperClass(String name, String school) {
        this.name = name;
        this.school = school;
    }

    public SuperClass() {
    }

    public SuperClass(student student) {
        this.name = student.getName();
        this.school = student.getSchool();
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

    @Override
    public String toString() {
        return "SuperClass{" +
                "name='" + name + '\'' +
                ", school='" + school + '\'' +
                '}';
    }


}
