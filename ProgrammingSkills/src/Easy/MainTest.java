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
            case 389 ->Test_0389(sc);
            case 476 ->Test_0476(sc);
            case 496 ->Test_0496(sc);
            case 566 ->Test_0566(sc);
            case 976 ->Test_0976(sc);
            case 1232->Test_1232(sc);
            case 1281->Test_1281(sc);
            case 1491->Test_1491(sc);
            case 1502->Test_1502(sc);
            case 1523->Test_1523(sc);
            case 1572->Test_1572(sc);
            case 1588->Test_1588(sc);
            case 1672->Test_1672(sc);
            case 1678->Test_1678(sc);
            case 1768->Test_1768(sc);
            case 1779->Test_1779(sc);
            case 1790->Test_1790(sc);
            case 1822->Test_1822(sc);
            default  ->Test_0000();
        }

    }

    public static void TestTool_ArrayInput(Scanner sc,int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i]= sc.nextInt();
        }
    }

    public static void TestTool_ArrayInput(Scanner sc,int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=sc.nextInt();
            }
        }
    }

    public static void TestTool_ArrayInput(Scanner sc,int[][] array,int row,int column){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j]=sc.nextInt();
            }
        }
    }

    public static void TestTool_CoordinateInput(Scanner sc,int[][] points,int count){
        for (int i=0;i<count;i++){
            points[i][0]= sc.nextInt();
            points[i][1]= sc.nextInt();
        }
    }

    public static void Test_0000(){
        System.out.println("输入题号错误或未查找到此题目");
    }

    public static void Test_1491(Scanner sc) {
        int count= sc.nextInt();
        int[] salary=new int[count];
        TestTool_ArrayInput(sc,salary);
        AverageSalary_1491 test1491=new AverageSalary_1491();
        double averageSalary= test1491.average(salary);
        System.out.println(averageSalary);
    }

    public static void Test_1523(Scanner sc){
        int low=sc.nextInt();
        int high=sc.nextInt();
        CountOddInRange_1523 test1523=new CountOddInRange_1523();
        int oddCounter= test1523.countOdds(low, high);
        System.out.println(oddCounter);
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

    public static void Test_0976(Scanner sc){
        int[] nums=new int[3];//example1:2,1,2; example2:1,2,1
        TestTool_ArrayInput(sc,nums);
        LargestPerimeterTriangle_0976 test0976=new LargestPerimeterTriangle_0976();
        int largestPerimeter=test0976.largestPerimeter(nums);
        System.out.println(largestPerimeter);
    }

    public static void Test_1779(Scanner sc){
        int[][] points=new int[1][2];
        System.out.println("输入坐标数组");
        TestTool_CoordinateInput(sc,points,1);
        System.out.println("输入x、y");
        int x= sc.nextInt();
        int y= sc.nextInt();
        FindNearestPoint_1779 test1779=new FindNearestPoint_1779();
        int minDistance=test1779.nearestValidPoint(x,y,points);
        System.out.println(minDistance);
    }

    public static void Test_1502(Scanner sc){
        int length=sc.nextInt();
        int[] arr=new int[length];
        TestTool_ArrayInput(sc,arr);
        CanMakeArithmeticProgression_1502 test1502=new CanMakeArithmeticProgression_1502();
        boolean isArithmeticProgression=test1502.canMakeArithmeticProgression(arr);
        System.out.println(isArithmeticProgression);
    }

    public static void Test_1822(Scanner sc){
        int length= sc.nextInt();
        int[] nums=new int[length];
        TestTool_ArrayInput(sc,nums);
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
        TestTool_ArrayInput(sc,personAccount,personCount,bankCount);
        RichestCustomerWealth_1672 test1672=new RichestCustomerWealth_1672();
        int maxWealth=test1672.maximumWealth(personAccount);
        System.out.println(maxWealth);
    }

    public static void Test_0283(Scanner sc){
        System.out.println("请输入数组长度");
        int length= sc.nextInt();
        int []nums=new int[length];
        TestTool_ArrayInput(sc,nums);
        MoveZeros_0283 test0283=new MoveZeros_0283();
        test0283.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void Test_0496(Scanner sc){
        int length1=sc.nextInt();
        int length2=sc.nextInt();
        int[] nums1=new int[length1];
        int[] nums2=new int[length2];
        TestTool_ArrayInput(sc,nums1);
        TestTool_ArrayInput(sc,nums2);
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
        TestTool_CoordinateInput(sc,coordinates,count);
        CheckStraightLine_1232 test1232=new CheckStraightLine_1232();
        boolean isLine=test1232.checkStraightLine(coordinates);
        System.out.println(isLine);
    }

    public static void Test_1588(Scanner sc){
        System.out.println("请输入数组长度");
        int length=sc.nextInt();
        int[] arr=new int[length];
        TestTool_ArrayInput(sc,arr);
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
        TestTool_ArrayInput(sc,nums);
        SumTwoNumber_0001 test0001=new SumTwoNumber_0001();
        int[] result;
        result=test0001.twoSum(nums,target);
        System.out.println(Arrays.toString(result));
        result=test0001.twoSumHash(nums,target);
        System.out.println(Arrays.toString(result));
    }

    public static void Test_1572(Scanner sc){
        System.out.println("请输入数组长度");
        int length=sc.nextInt();
        int[][] mat=new int[length][length];
        TestTool_ArrayInput(sc,mat);
        MatrixDiagonalSum_1572 test1572=new MatrixDiagonalSum_1572();
        int resultSum=test1572.diagonalSum(mat);
        System.out.println(resultSum);
    }

    public static void Test_0566(Scanner sc){
        System.out.println("请输入数组长度");
        int line=sc.nextInt();
        int col= sc.nextInt();
        int[][] matrix=new int[line][col];
        TestTool_ArrayInput(sc,matrix);
        System.out.println("请输入重组数组行、列值");
        int row=sc.nextInt();
        int column=sc.nextInt();
        ReshapeMatrix_0566 test0566=new ReshapeMatrix_0566();
        int[][] reshapeMatrix=test0566.matrixReshape(matrix,row,column);
        System.out.println(Arrays.deepToString(reshapeMatrix));
    }

    public static void Test_1768(Scanner sc){
        String word1=sc.next();
        String word2=sc.next();
        MergeStringsAlternately_1768 test1768=new MergeStringsAlternately_1768();
        String result= test1768.mergeAlternately(word1,word2);
        System.out.println(result);
    }

    public static void Test_1678(Scanner sc){
        String command=sc.next();
        GoalParserInterpretation_1678 test1678=new GoalParserInterpretation_1678();
        String result= test1678.interpret(command);
        System.out.println(result);
    }

    public static void Test_0389(Scanner sc){
        String ss=sc.next();
        String st=sc.next();
        FindDifference_0389 test0389=new FindDifference_0389();
        char result= test0389.findTheDifference(ss,st);
        System.out.println(result);
    }
}
