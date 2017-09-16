package iteratorComposite.entity;

public class Doctor extends PeopleComponent {
    private String name;
    private String code;
    private String department;

    public Doctor() {
    }

    public Doctor(String name, String code, String department) {
        super();
        this.name = name;
        this.code = code;
        this.department = department;
    }

    @Override
    public void print() {
        System.out.println("Doctor [name=" + name + ", code=" + code
                + ", department=" + department + "]");
    }

    @Override
    public String toString() {
        return "Doctor [name=" + name + ", code=" + code + ", department="
                + department + "]";
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
