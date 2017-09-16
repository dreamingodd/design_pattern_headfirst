package iteratorComposite.entity;

import iteratorComposite.constant.Gender;
import iteratorComposite.constant.Occupation;

public class Programmer extends Person {
    public Programmer() {
    }

    public Programmer(String name, Gender gender, String code, int age,
            Occupation occupation) {
        super(name, gender, name, age, occupation);
    }
}
