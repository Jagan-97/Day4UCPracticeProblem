import java.util.Random;
public class UC2DailyWage {
    public static void main(String args[]){
        Random random = new Random();
        int isPresent = 1;
        int empRatePerHr = 20 ;
        int empHrs = 8 ;
        int salary;
        int x = random.nextInt(2);
        System.out.println(x);
        if (isPresent == x )
        {
            salary=empRatePerHr * empHrs ;
            System.out.println(salary);
        }
        else{
            salary = 0;
            System.out.println(salary);
        }
    }
}
