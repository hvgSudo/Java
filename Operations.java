import java.util.ArrayList;

public class Operations {
    private ArrayList<Student> list;
    private ArrayList<DOB> list1;
    private DOB d = new DOB();

    Operations() {
        list = new ArrayList<Student>();
        list1 = new ArrayList<DOB>();
    }

    void printStudents() {
        System.out.println("Student list");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Student "+
                    (i+1) +". \n"+ "PRN -> "+
                    list.get(i).getPrn() +"\t"+
                    "Name -> "+
                    list.get(i).getName());
            System.out.println("Date of Birth -> "+
                    list1.get(i).getDate() +"-"+
                    list1.get(i).getMonth() +"-"+
                    list1.get(i).getYear());
            System.out.println("Total marks -> "+
                    list.get(i).getTotal() +" out of 500");
            System.out.println("Percentage obtained -> "+
                    list.get(i).getPercentage());
            System.out.println("GPA obtained -> "+
                    list.get(i).getGPA());
            System.out.println("Grade obtained -> "+
                    list.get(i).getGrade());
        }
    }

    boolean addStudent(Student student, DOB dob) {
        if (findStudent(student.getName()) >= 0)
            return false;
        list.add(student);
        list1.add(dob);
        return true;
    }

    boolean removeStudent(Student student) {
        int foundStudent = findStudent(student);
        if (foundStudent < 0) {
            System.out.println(student.getName() +
                    ", was not found in the list");
            return false;
        }
        this.list.remove(foundStudent);
        this.list1.remove(foundStudent);
        System.out.println(student.getName() +
                ", was deleted");
        return false;
    }

    boolean updateStudent(Student oldDetail, Student newDetail,
                          DOB d) {
        int foundStudent = findStudent(oldDetail);
        if (foundStudent < 0) {
            System.out.println(oldDetail.getName() +
                    ", was not found");
            return false;
        } else if (findStudent(newDetail.getName()) != -1) {
            System.out.println(newDetail.getName() +
                    "already exists");
            return false;
        }
        this.list.set(foundStudent, newDetail);
        this.list1.set(foundStudent, d);
        System.out.println(oldDetail.getName() +", was"+
                " replaced with "+ newDetail.getName());
        return true;
    }

    Student specificStudentName (String name) {
        int position = findStudent(name);
        if (position >= 0)
            return this.list.get(position);
        return null;
    }

    Student specificStudentPRN (String prn) {
        int position = findStudentPRN(prn);
        if (position >= 0)
            return this.list.get(position);
        return null;
    }

    Student specificStudentMarks (int choice, double marks) {
        int position = findStudentMarks(choice, marks);
        if (position >= 0)
            return this.list.get(position);
        return null;
    }

    void gradeCount() {
        System.out.println("Grade -> Number of students who "+
                "obtained that grade");
        String grade;
        int a = 0, bPlus = 0, b = 0, cPlus = 0, c = 0, f = 0;
        for (int i = 0; i < list.size(); i++) {
            grade = list.get(i).getGrade();
            if (grade.equals("A"))
                a += 1;
            else if (grade.equals("B+"))
                bPlus += 1;
            else if (grade.equals("B"))
                b += 1;
            else if (grade.equals("C+"))
                cPlus += 1;
            else if (grade.equals("C"))
                c += 1;
            else
                f += 1;
        }
        System.out.println("A -> "+ a);
        System.out.println("B+ -> "+ bPlus);
        System.out.println("B -> "+ b);
        System.out.println("C+ -> "+ cPlus);
        System.out.println("C -> "+ c);
        System.out.println("F -> "+ f);
    }

    private int findStudent (Student student) {
        return this.list.indexOf(student);
    }

    private int findStudent (String studentName) {
        for (int i = 0; i < this.list.size(); i++) {
            Student student = this.list.get(i);
            if (student.getName().equals(studentName))
                return i;
        }
        return -1;
    }

    private int findStudentPRN (String studentPRN) {
        for (int i = 0; i < this.list.size(); i++) {
            Student student = this.list.get(i);
            if (student.getPrn().equals(studentPRN))
                return i;
        }
        return -1;
    }

    private int findStudentMarks (int choice, double marks) {
        for (int i = 0; i < this.list.size(); i++) {
            Student student = this.list.get(i);
            if (choice == 1)
                if (student.getPercentage() == marks)
                    return i;
            else if (choice == 2)
                if (student.getGPA() == marks)
                    return i;
            else if (choice == 3)
                if (student.getTotal() == marks)
                    return i;
        }
        return -1;
    }
}