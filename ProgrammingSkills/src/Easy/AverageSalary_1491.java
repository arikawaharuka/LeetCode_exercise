package Easy;

public class AverageSalary_1491 {
    public double average(int[] salary) {
        int maxSalary=salary[0];
        int minSalary=salary[0];
        double sumSalary=0;
        if (salary[0]>salary[1]){
            minSalary=salary[1];
        }else {
            maxSalary=salary[1];
        }
        sumSalary=salary[0]+salary[1];
        for (int i=2;i<salary.length;i++){
            if (salary[i]>maxSalary){
                maxSalary=salary[i];
            } else if (salary[i]<minSalary) {
                minSalary=salary[i];
            }
            sumSalary=sumSalary+salary[i];
        }
        return (sumSalary-maxSalary-minSalary)/(salary.length-2);
    }
}
