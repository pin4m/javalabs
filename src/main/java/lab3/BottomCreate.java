package lab3;

/**
 * Created by pin4m on 11.11.2020.
 */

import lab3.monitor.*;
import lab3.type.*;
import lab3.kind.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BottomCreate {
    Univer createUniver() {

        Univer univerType = this.retrieveUniverFromDatabase();


        UniverKind univerKind = new UniverKind();
        UniverMonitor univerMonitor = new UniverMonitor(univerType, univerKind);

        univerMonitor.updateUniverKind();
        return univerType;
    }


    public BottomCreate() {

    }

    private Univer retrieveUniverFromDatabase() {
        String name;

        Scanner scanner = new Scanner(System.in);
        Univer univer = new Univer();

        System.out.print(Colours.ANSI_RESET + "Enter UNIVER NAME: ");
        name = scanner.next();
        univer.setUniverName(name);

        Boss univerBoss = retrieveBossFromDatabase(name);
        BossKind bossKind = new BossKind();
        BossMonitor bossMonitor = new BossMonitor(univerBoss, bossKind);
        bossMonitor.updateBossKind();

        System.out.print(Colours.ANSI_RESET + "Enter UNIVER LOCATION: ");
        univer.setLocation(scanner.next());


        ArrayList<Faculty> faculties = (ArrayList<Faculty>) createFaculty(scanner);
        univer.setFaculties(faculties);

        return univer;
    }

    private List<Faculty> createFaculty(Scanner scanner) {
        ArrayList<Faculty> faculties = new ArrayList<Faculty>();
        boolean listCreateFlag = true;

        while (listCreateFlag) {
            Faculty facultyType = retrieveFacultyFromDatabase();
            faculties.add(facultyType);

            FacultyKind facultyKind = new FacultyKind();
            FacultyMonitor facultyMonitor = new FacultyMonitor(facultyType, facultyKind);

            facultyMonitor.updateFacultyKind();

            System.out.println(Colours.ANSI_RED + "\nYou've " + faculties.size() + " FACULTIES in This UNIVER");
            System.out.print(Colours.ANSI_RED + "Do You Want to Add More FACULTIES? [Yep/Nope]: ");
            listCreateFlag = "Yep".equals(scanner.next());
        }

        return faculties;
    }

    private Faculty retrieveFacultyFromDatabase() {
        String name;

        Scanner scanner = new Scanner(System.in);
        Faculty faculty = new Faculty();

        System.out.print(Colours.ANSI_RESET + "Enter FACULTY NAME: ");
        name = scanner.next();
        faculty.setFacultyName(name);

        Boss facultyBoss = retrieveBossFromDatabase(name);
        BossKind bossKind = new BossKind();
        BossMonitor bossMonitor = new BossMonitor(facultyBoss, bossKind);
        bossMonitor.updateBossKind();

        ArrayList<Department> departments = (ArrayList<Department>) createDepartment(scanner);
        faculty.setDepartments(departments);

        return faculty;
    }

    private List<Department> createDepartment(Scanner scanner) {
        ArrayList<Department> departments = new ArrayList<Department>();
        boolean listCreateFlag = true;

        while (listCreateFlag) {
            Department departmentType = retrieveDepartmentFromDatabase();
            departments.add(departmentType);

            DepartmentKind departmentKind = new DepartmentKind();
            DepartmentMonitor departmentMonitor = new DepartmentMonitor(departmentType, departmentKind);

            departmentMonitor.updateDepartmentKind();

            System.out.println(Colours.ANSI_RED + "\nYou've " + departments.size() + " Departments in This FACULTY");
            System.out.print(Colours.ANSI_BLACK + "Do You Want to Add more DEPARTMENTS? [Yep/Nope]: ");
            listCreateFlag = "Yep".equals(scanner.next());
        }

        return departments;
    }

    private Department retrieveDepartmentFromDatabase() {
        String name;

        Scanner scanner = new Scanner(System.in);
        Department department = new Department();

        System.out.print(Colours.ANSI_RESET + "Enter DEPARTMENT NAME: ");
        name = scanner.next();
        department.setDepartmentName(name);

        Boss departmentBoss = retrieveBossFromDatabase(name);
        BossKind bossKind = new BossKind();
        BossMonitor bossMonitor = new BossMonitor(departmentBoss, bossKind);
        bossMonitor.updateBossKind();

        ArrayList<Group> groups = (ArrayList<Group>) createGroup(scanner);
        department.setGroups(groups);

        return department;
    }

    private List<Group> createGroup(Scanner scanner) {
        ArrayList<Group> groups = new ArrayList<Group>();
        boolean listCreateFlag = true;

        while (listCreateFlag) {
            Group groupType = retrieveGroupFromDatabase();
            groups.add(groupType);

            GroupKind groupKind = new GroupKind();
            GroupMonitor groupMonitor = new GroupMonitor(groupType, groupKind);

            groupMonitor.updateGroupeKind();

            System.out.println(Colours.ANSI_RED + "\nYou've " + groups.size() + " Groups in This DEPARTMENT");
            System.out.print(Colours.ANSI_BLACK + "Do u wanna add more group? [yes/no]: ");
            listCreateFlag = "yes".equals(scanner.next());
        }

        return groups;
    }

    private Group retrieveGroupFromDatabase() {
        String number;

        Scanner scanner = new Scanner(System.in);
        Group group = new Group();

        System.out.print(Colours.ANSI_RESET + "Enter GROUP NUMBER: ");
        number = scanner.next();
        group.setGroupNumber(number);

        Boss groupBoss = retrieveBossFromDatabase(number);
        BossKind bossKind = new BossKind();
        BossMonitor bossMonitor = new BossMonitor(groupBoss, bossKind);
        bossMonitor.updateBossKind();

        ArrayList<Student> students = (ArrayList<Student>) createStudent(scanner);
        group.setStudents(students);

        return group;
    }

    private List<Student> createStudent(Scanner scanner) {
        ArrayList<Student> students = new ArrayList<Student>();
        boolean listCreateFlag = true;

        while (listCreateFlag) {
            Student studentType = retrieveStudentFromDatabase();
            students.add(studentType);

            StudentKind studentKind = new StudentKind();
            StudentMonitor studentMonitor = new StudentMonitor(studentType, studentKind);

            studentMonitor.updateStudentKind();
            System.out.println(Colours.ANSI_RED + "\nYou've " + students.size() + " Students in This GROUP");
            System.out.print(Colours.ANSI_BLACK + "Do You Want to Add More STUDENTS? [Yep/Nope]: ");
            listCreateFlag = "Yep".equals(scanner.next());
        }

        return students;
    }

    private Student retrieveStudentFromDatabase() {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.print(Colours.ANSI_RESET + "Enter STUDENT NAME: ");
        student.setName(scanner.next());
        System.out.print(Colours.ANSI_RESET + "Enter STUDENT SURNAME: ");
        student.setSurname(scanner.next());
        System.out.print(Colours.ANSI_RESET + "Enter STUDENT PATRONYMIC: ");
        student.setPatronymic(scanner.next());
        System.out.print(Colours.ANSI_RESET + "Enter STUDENT GRADE: ");
        student.setGrade(scanner.nextInt());
        System.out.print(Colours.ANSI_RESET + "Enter STUDENT SEX: ");
        student.setSex(SexMonitor.sexChoose(scanner.next()));

        return student;
    }

    private Boss retrieveBossFromDatabase(String nameArea) {
        Scanner scanner = new Scanner(System.in);

        Boss boss = new Boss();
        System.out.println(Colours.ANSI_RED + "\nCreate BOSS " + nameArea);
        System.out.print(Colours.ANSI_RESET + "Enter BOSS NAME: ");
        boss.setName(scanner.next());
        System.out.print(Colours.ANSI_RESET + "Enter BOSS SURNAME: ");
        boss.setSurname(scanner.next());
        System.out.print(Colours.ANSI_RESET + "Enter BOSS PATRONYMIC: ");
        boss.setPatronymic(scanner.next());
        System.out.print(Colours.ANSI_RESET + "Enter BOSS SEX: ");
        boss.setSex(SexMonitor.sexChoose(scanner.next()));
        boss.setAreaControl(nameArea);

        return boss;
    }
}
