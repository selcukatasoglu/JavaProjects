class Course {
    String name;
    String code;
    String prefix;
    double note;
    Teacher teacher;
    double oralPercentage; // Sözlü notunun ortalamaya etkileme yüzdesi

    public Course() {
    }

    public Course(String name, String code, String prefix, double oralPercentage) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.oralPercentage = oralPercentage;
    }

    public void addTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void printTeacher() {
        System.out.println("Course: " + name + " Teacher: " + teacher.name);
    }
}

class Teacher {
    String name;
    String mpno;
    String branch;

    public Teacher() {
    }

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
}

class Student {
    String name;
    int stuNo;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    double average;
    boolean isPass;

    public Student() {
    }

    public Student(String name, int stuNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0.0;
        this.isPass = false;
    }

    public void addBulkExamNote(int note1, int note2, int note3) {
        // Sınav notu ile sözlü notunun hesaplanması
        double course1Note = (note1 * (1 - course1.oralPercentage)) + (course1.note * course1.oralPercentage);
        double course2Note = (note2 * (1 - course2.oralPercentage)) + (course2.note * course2.oralPercentage);
        double course3Note = (note3 * (1 - course3.oralPercentage)) + (course3.note * course3.oralPercentage);

        // Ders notlarının ortalamasının hesaplanması
        this.average = (course1Note + course2Note + course3Note) / 3;

        // Geçme notunun belirlenmesi (ortalama 55 ve üzeri ise geçer)
        this.isPass = this.average >= 55;
    }

    public void printNote() {
        System.out.println("Student Name: " + name);
        System.out.println(course1.name + " Note: " + course1.note);
        System.out.println(course2.name + " Note: " + course2.note);
        System.out.println(course3.name + " Note: " + course3.note);
        System.out.println("Avarage: " + average);
        System.out.println("Pass: " + isPass);
    }
}

public class Main {
    public static void main(String[] args) {
        Teacher mathTeacher = new Teacher("John Doe", "12345", "Mathematics");
        Teacher physicsTeacher = new Teacher("Jane Smith", "67890", "Physics");

        Course mathCourse = new Course("Math 101", "MATH101", "MATH", 0.15);
        mathCourse.addTeacher(mathTeacher);
        mathCourse.note = 80;

        Course physicsCourse = new Course("Physics 101", "PHY101", "PHY", 0.20);
        physicsCourse.addTeacher(physicsTeacher);
        physicsCourse.note = 80;

        Course chemistryCourse = new Course("Chemistry 101", "CHEM101", "CHEM", 0.10);
        chemistryCourse.note = 80;

        Student student = new Student("Alice", 123456, "Science",
                mathCourse, physicsCourse, chemistryCourse);

        student.addBulkExamNote(80, 80, 80);
        student.printNote();
    }
}
