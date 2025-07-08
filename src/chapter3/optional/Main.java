package chapter3.optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Camp camp = new Camp();
        // student = null
//        Student student = camp.getStudent();
//        System.out.println("student = " + student);

        // 직접적인 null 처리 방법
//        String studentName;
//        if (student != null) {
//            studentName = student.getName();
//        } else {
//            studentName = "등록된 학생이 아닙니다.";
//        }
//        System.out.println("student name = " + studentName);

        //Optional 객체 활용
        Optional<Student> optional = camp.getStudent();
        boolean flag = optional.isPresent();

        if (flag) {
            Student stud = optional.get();
            String studentName = stud.getName();
            System.out.println("studentName = " + studentName);
        }else{
            System.out.println("학생 데이터가 없습니다.");
        }

        // NullpointException
//        String studentName = student.getName();
//        System.out.println("studentName = " + studentName);
    }
}
