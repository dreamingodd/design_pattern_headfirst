package iteratorComposite.test;

import iteratorComposite.collection.Doctors;
import iteratorComposite.collection.People;
import iteratorComposite.collection.Programmers;
import iteratorComposite.constant.Gender;
import iteratorComposite.constant.Occupation;
import iteratorComposite.entity.Doctor;
import iteratorComposite.entity.PeopleComponent;
import iteratorComposite.entity.Person;
import iteratorComposite.entity.Programmer;

public class Test {
    public static void main(String[] args) {
        PeopleComponent people = mockupPeople();
        people.print();
    }

    public static People mockupPeople() {
        // Collections
        People people = new People();
        PeopleComponent programmers = new Programmers();
        PeopleComponent doctors = new Doctors();

        // Entities
        PeopleComponent person1 = new Person("Mark", Gender.MALE, "01", 23,
                Occupation.CARPENTER);
        PeopleComponent person2 = new Person("Dan", Gender.FEMALE, "02", 32,
                Occupation.LAWYER);
        Programmer programmer1 = new Programmer("Sam", Gender.MALE, "P1", 28,
                Occupation.PROGRAMMER);
        Programmer programmer2 = new Programmer("Ron", Gender.FEMALE, "P2", 25,
                Occupation.PROGRAMMER);
        PeopleComponent doctor1 = new Doctor("Suz", "D1", "");
        PeopleComponent doctor2 = new Doctor("Carter", "D2", "");

        people.add(person1);
        people.add(person2);
        people.add(programmers);
        people.add(doctors);
        programmers.add(programmer1);
        programmers.add(programmer2);
        doctors.add(doctor1);
        doctors.add(doctor2);

        return people;
    }
}
