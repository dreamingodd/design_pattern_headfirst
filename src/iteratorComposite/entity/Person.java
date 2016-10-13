package iteratorComposite.entity;

import iteratorComposite.constant.Gender;
import iteratorComposite.constant.Occupation;

/**
 * 
 * @author ywd
 * 
 */
public class Person extends PeopleComponent {
    // protected for child class
    protected String name;
    protected Gender gender;
    protected String code;
    protected int age;
    protected Occupation occupation;

    public Person() {
    }

    public Person(String name, Gender gender, String code, int age,
            Occupation occupation) {
        super();
        this.name = name;
        this.gender = gender;
        this.code = code;
        this.age = age;
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", gender=" + gender + ", code=" + code
                + ", age=" + age + ", occupation=" + occupation + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }

    @Override
    public void print() {
        System.out.println("Person [name=" + name + ", gender=" + gender
                + ", code=" + code + ", age=" + age + ", occupation="
                + occupation + "]");
    }

}
