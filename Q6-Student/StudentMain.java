
public class StudentMain
 {
    public static void main(String[] args) {
        int[] marks1 ={85, 90, 78, 88, 92};
        int[] marks2 ={90, 95, 92, 88, 85};

        Student s1 = new Student("John", marks1);
        Student s2 = new Student("Peter", marks2);
        
        System.out.print("Student 1"+ " ");
        s1.getAverage();
        System.out.print("Student 2"+ " ");
        s2.getAverage();
    }
}