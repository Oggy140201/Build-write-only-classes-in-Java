public class Student {
    private String name = "john";
    private String className ="CO2";

    public Student(String name, String className) {
        this.name = name;
        this.className = className;
    }
    public Student(){
    }

    public String getClassName() {
        return className;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
