import java.util.Random;
public class UC3PartTimeEmployee {
    public static void main(String args[]){
        Random random = new Random();
        int isPartTime=1;
        int isFullTime=2;
        int empRatePerHr = 20 ;
        int empHrs;
        int salary;
        int x = random.nextInt(3);
        System.out.println("Random Value=" +x);
        if ( x == isPartTime ){
            empHrs=8;
            salary=empRatePerHr * empHrs;
            System.out.println("Employee PartTime Salary=" +salary);
        } else if ( x == isFullTime ) {
            empHrs=16;
            salary=empRatePerHr * empHrs;
            System.out.println("Employee FullTime Salary=" +salary);
        }else{
            empHrs=0;
            salary=empRatePerHr * empHrs;
            System.out.println("Employee Salary=" +salary);
        }
    }
}
