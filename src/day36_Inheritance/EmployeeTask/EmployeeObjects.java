package day36_Inheritance.EmployeeTask;

public class EmployeeObjects {

    public static void main(String[] args) {

        Tester tester = new Tester();
        tester.setInfo("William", "SDET", "CYDEO", 'M', 34, 4598, 110000);
        tester.work();
        tester.testing();
        tester.creatingTicket();
        System.out.println(tester);

        Developer developer = new Developer();
        developer.setInfo("Lydia", "developer", "Amazon", 'F', 28, 1167, 130000);
        developer.work();
        developer.coding();
        developer.fixingBugs();
        System.out.println(developer);

        Driver driver = new Driver();
        driver.setInfo("Jason", "driver", "Best buy", 'M', 38, 980, 60000);
        driver.work();
        driver.driving();
        System.out.println(driver);

        Teacher teacher = new Teacher();
        teacher.setInfo("Marian", "teacher", "MIT", 'F', 32, 7877, 120000);
        teacher.work();
        teacher.teaching();
        System.out.println(teacher);
    }

}
