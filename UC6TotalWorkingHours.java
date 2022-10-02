import java.util.Random;

public class UC6TotalWorkingHours {
    public static void main(String args[]){
        Random random = new Random();
        int  isPartTime=1;
        int  isFullTime=2;
        int  empRatePerHrs=20;
        int  numOfworkingDay=20;
        int  empHrs;
        int  totalEmpHr=0;
        int  salary;
        int  totalSalary=0;
        for ( int day=1; day<=numOfworkingDay; day++)
        {
            int x = random.nextInt(3);
            switch (x) {
                case 1:
                    empHrs=8;
                    break;
                case 2:
                    empHrs=16;
                    break;
                default:
                    empHrs=0;
            }
            salary=empHrs*empRatePerHrs;
            totalSalary=totalSalary+salary;
            totalEmpHr=totalEmpHr+empHrs;
            System.out.println("RandomCheck= " + x);
            System.out.println("EmpHr= " + empHrs);
        }
        System.out.println("totalEmpHr= " +totalEmpHr);
    }
}
