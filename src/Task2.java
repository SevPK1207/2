public class Task2 {
    public static void main(String args[]) {
        Student studentIvan = new Student("Ivan", "Ivanov", "1851", 4.0);
        Student studentIvan3 = new Student("Ivan3", "Ivanov3", "1851", 5.0);
        Aspirant aspirantIvan2 = new Aspirant("Ivan2", "Ivanov2", "1851", 4.0, "Rabota1");
        Aspirant aspirantIvan4 = new Aspirant("Ivan4", "Ivanov4", "1851", 5.0, "Rabota1");
        Student aspirantIvan = new Aspirant("Ivan", "Ivanov", "1851", 4.0, "Rabota1");
        Student[] students = {studentIvan, studentIvan3, aspirantIvan2, aspirantIvan4, aspirantIvan};
        for (Student studentTest:students){
            System.out.println(studentTest.getScholarship());
        }
    }

}
