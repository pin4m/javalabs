package lab3.monitor;

/**
 * Created by pin4m on 11.11.2020.
 */

import lab3.type.Student;
import lab3.kind.StudentKind;

public class StudentMonitor {
    private Student studentType;
    private StudentKind studentKind;

    public StudentMonitor(Student studentType, StudentKind studentKind){
        this.studentType = studentType;
        this.studentKind = studentKind;
    }

    public Student getStudentType() {
        return studentType;
    }

    public void setStudentType(Student studentType) {
        this.studentType = studentType;
    }

    public StudentKind getStudentKind() {
        return studentKind;
    }

    public void setStudentKind(StudentKind studentKind) {
        this.studentKind = studentKind;
    }

    public void updateStudentKind(){
        studentKind.printStudentDetails(studentType.getName(), studentType.getSurname(), studentType.getPatronymic(), studentType.getGrade(), studentType.getSex());
    }
}
