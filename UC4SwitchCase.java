import java.util.Random;
public class UC4SwitchCase {
    public static void main(String args[]){
        Random random = new Random();
        int isPartTime=1;
        int isFullTime=2;
        int empRatePerHr = 20 ;
        int empHrs;
        int salary;
        int x = random.nextInt(3);
        System.out.println("Random Value=" +x);
        switch (x) {
            case 1:
                empHrs=8;
                salary=empRatePerHr * empHrs;
                System.out.println("Employee PartTime Salary=" +salary);
                break;
            case 2:
                empHrs=16;
                salary=empRatePerHr * empHrs;
                System.out.println("Employee FullTime Salary=" +salary);
                break;
            default:
                empHrs=0;
                salary=empRatePerHr * empHrs;
                System.out.println("Employee Salary=" +salary);
        }
    }
}
