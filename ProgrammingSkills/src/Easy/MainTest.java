package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入测试题目：");
        int select=sc.nextInt();
        switch (select){
            case 1   ->Test_0001(sc);
            case 29  ->Test_0029(sc);
            case 69  ->Test_0069(sc);
            case 191 ->Test_0191(sc);
            case 202 ->Test_0202(sc);
            case 283 ->Test_0283(sc);
            case 367 ->Test_0367(sc);
            case 476 ->Test_0476(sc);
            case 496 ->Test_0496(sc);
            case 976 ->Test_0976(sc);
            case 1232->Test_1232(sc);
            case 1281->Test_1281(sc);
            case 1491->Test_1491(sc);
            case 1502->Test_1502(sc);
            case 1523->Test_1523(sc);
            case 1588->Test_1588(sc);
            case 1672->Test_1672(sc);
            case 1779->Test_1779(sc);
            case 1790->Test_1790(sc);
            case 1822->Test_1822(sc);
            default  ->Test_0000();
        }

    }

    public static void Test_1491(Scanner sc) {
        //int[] salary=new int[4];//example 1:4000,3000,1000,2000
        int[] salary=new int[3];//example 2:1000,2000,3000
        //int[] salary=new int[6];//example 3:6000,5000,4000,3000,2000,1000 example 4:8000,9000,2000,3000,6000,1000

        for (int i=0;i<salary.length;i++){
            salary[i]=sc.nextInt();
        }

        AverageSalary_1491 test1491=new AverageSalary_1491();
        double averageSalary= test1491.average(salary);
        System.out.println(averageSalary);
    }

    public static void Test_1523(Scanner sc){
        //给你两个非负整数 low 和 high 。请你返回 low 和 high 之间（包括二者）奇数的数目
        int low=sc.nextInt();
        int high=sc.nextInt();
        CountOddInRange_1523 test1523=new CountOddInRange_1523();
        int oddCounter= test1523.countOdds(low, high);
        System.out.println(oddCounter);
        //example1:low=3,high=7
        //example2:low=8,high=10
    }

    public static void Test_0029(Scanner sc){
        int number1,number2;
        System.out.println("请输入被除数和除数");
        number1 = sc.nextInt();
        number2 = sc.nextInt();

        int quotient;
        DivideTwoIntegers_0029 test0029=new DivideTwoIntegers_0029();
        quotient = test0029.divide(number1,number2);
        System.out.println("商是："+quotient);
    }

    public static void Test_0191(Scanner sc){
        int number= sc.nextInt();
        NumberOneBits_0191 test0191=new NumberOneBits_0191();
        int count = test0191.hammingWeight(number);
        System.out.println(count);
    }

    public static void Test_1281(Scanner sc){
        int number=sc.nextInt();
        SubtractProductSum_1281 test1281=new SubtractProductSum_1281();
        int result= test1281.subtractProductAndSum(number);
        System.out.println(result);
    }

    public static void Test_0367(Scanner sc){
        /*example 1：input:16 output：true
          example 2：input:14 output：false*/
        int number = sc.nextInt();
        boolean isPerfectSquare;
        ValidPerfectSquare_0367 test0367=new ValidPerfectSquare_0367();
        isPerfectSquare=test0367.IsPerfectSquare_1(number);
        System.out.println(isPerfectSquare);

        isPerfectSquare=test0367.IsPerfectSquare_2(number);
        System.out.println(isPerfectSquare);
    }

    public static void Test_0000(){
        System.out.println("输入题号错误或未查找到此题目");
    }

    public static void Test_0976(Scanner sc){
        int[] nums=new int[3];//example1:2,1,2; example2:1,2,1

        for (int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        LargestPerimeterTriangle_0976 test0976=new LargestPerimeterTriangle_0976();
        int largestPerimeter=test0976.largestPerimeter(nums);
        System.out.println(largestPerimeter);
    }

    public static void Test_1779(Scanner sc){
        int[][] points=new int[1][2];
        System.out.println("输入坐标数组");
        for (int i=0;i<1;i++){
            points[i][0]= sc.nextInt();
            points[i][1]= sc.nextInt();
        }
        System.out.println("输入x、y");
        int x= sc.nextInt();
        int y= sc.nextInt();
        FindNearestPoint_1779 test1779=new FindNearestPoint_1779();
        int minDistance=test1779.nearestValidPoint(x,y,points);
        System.out.println(minDistance);
    }

    public static void Test_1502(Scanner sc){
        int[] arr=new int[3];
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        CanMakeArithmeticProgression_1502 test1502=new CanMakeArithmeticProgression_1502();
        boolean isArithmeticProgression=test1502.canMakeArithmeticProgression(arr);
        System.out.println(isArithmeticProgression);
    }

    public static void Test_1822(Scanner sc){
        int[] nums=new int[5];//example1:7,example2,3:5
        //example 1:-1,-2,-3,-4,3,2,1
        //example 2:1,5,0,2,-3
        //example 3:-1,1,-1,1,-1
        for (int i=0;i<nums.length;i++){
            nums[i]= sc.nextInt();
        }
        ArraySign_1822 test1822=new ArraySign_1822();
        int arraySign=test1822.arraySign(nums);
        System.out.println(arraySign);
    }

    public static void Test_0069(Scanner sc){
        int x= sc.nextInt();
        SqrtX_0069 test0069=new SqrtX_0069();
        int result= test0069.mySqrt(x);
        System.out.println(result);
    }

    public static void Test_0202(Scanner sc){
        int number=sc.nextInt();
        HappyNumber_0202 test0202=new HappyNumber_0202();
        boolean isHappyNum=test0202.isHappy(number);
        System.out.println(isHappyNum);
    }

    public static void Test_1790(Scanner sc){
        String s1=sc.next();
        String s2=sc.next();
        CheckStringSwapEqual_1790 test1790=new CheckStringSwapEqual_1790();
        boolean isEqual=test1790.areAlmostEqual(s1,s2);
        System.out.println(isEqual);
    }

    public static void Test_1672(Scanner sc){
        System.out.println("请输入总人数：");
        int personCount=sc.nextInt();
        System.out.println("请输入银行数量：");
        int bankCount=sc.nextInt();
        int [][]personAccount=new int[personCount][bankCount];
        for (int i = 0; i < personCount; i++) {
            for (int j = 0; j < bankCount; j++) {
                personAccount[i][j]=sc.nextInt();
            }
        }
        RichestCustomerWealth_1672 test1672=new RichestCustomerWealth_1672();
        int maxWealth=test1672.maximumWealth(personAccount);
        System.out.println(maxWealth);
    }

    public static void Test_0283(Scanner sc){
        System.out.println("请输入数组长度");
        int length= sc.nextInt();
        int []nums=new int[length];
        for (int i = 0; i <nums.length ; i++) {
            nums[i]= sc.nextInt();
        }
        MoveZeros_0283 test0283=new MoveZeros_0283();
        test0283.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void Test_0496(Scanner sc){
        int length1=sc.nextInt();
        int length2=sc.nextInt();
        int[] nums1=new int[length1];
        int[] nums2=new int[length2];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i]=sc.nextInt();
        }
        for (int i = 0; i < nums2.length; i++) {
            nums2[i]=sc.nextInt();
        }
        NextGreaterElement_0496 test0496=new NextGreaterElement_0496();
        int[] result=new int[length1];
        Arrays.fill(result, -1);
        result= test0496.nextGreaterElement(nums1,nums2);
        System.out.println(Arrays.toString(result));
        result=test0496.nextGreaterElement_2(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }

    public static void Test_1232(Scanner sc){
        System.out.println("请输入点的个数");
        int count= sc.nextInt();
        int[][] coordinates=new int[count][2];
        System.out.println("输入坐标数组");
        for (int i=0;i<count;i++){
            coordinates[i][0]= sc.nextInt();
            coordinates[i][1]= sc.nextInt();
        }
        CheckStraightLine_1232 test1232=new CheckStraightLine_1232();
        boolean isLine=test1232.checkStraightLine(coordinates);
        System.out.println(isLine);
    }

    public static void Test_1588(Scanner sc){
        System.out.println("请输入数组长度");
        int length=sc.nextInt();
        int[] arr=new int[length];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        SumOddLengthSubArrays_1588 test1588=new SumOddLengthSubArrays_1588();
        int sum= test1588.sumOddLengthSubArrays(arr);
        System.out.println(sum);
    }

    public static void Test_0476(Scanner sc){
        int num= sc.nextInt();
        NumberComplement_0476 test0476=new NumberComplement_0476();
        int result=test0476.findComplement(num);
        System.out.println(result);
    }

    public static void Test_0001(Scanner sc){
        System.out.println("请输入target");
        int target=sc.nextInt();
        System.out.println("请输入数组长度");
        int length=sc.nextInt();
        int[] nums=new int[length];
        for (int i = 0; i < length; i++) {
            nums[i]= sc.nextInt();
        }
        SumTwoNumber_0001 test0001=new SumTwoNumber_0001();
        int[] result;
        result=test0001.twoSum(nums,target);
        System.out.println(Arrays.toString(result));
        result=test0001.twoSumHash(nums,target);
        System.out.println(Arrays.toString(result));
    }
}
