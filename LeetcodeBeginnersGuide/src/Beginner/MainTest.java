package Beginner;

import java.util.Arrays;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入测试题目：");
        int select=sc.nextInt();
        switch (select){
            case 383 ->Test_0383(sc);
            case 1342->Test_1342(sc);
            case 1480->Test_1480(sc);
            default  ->Test_0000();
        }
    }

    public static void TestTool_ArrayInput(Scanner sc,int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i]= sc.nextInt();
        }
    }

    /*public static void TestTool_ArrayInput(Scanner sc,String[] strings){
        for (int i = 0; i < strings.length; i++) {
            strings[i]= sc.next();
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
    }*/

    public static void Test_0000(){
        System.out.println("输入题号错误或未查找到此题目");
    }

    public static void Test_1480(Scanner sc){
        int length=sc.nextInt();
        int[] nums=new int[length];
        TestTool_ArrayInput(sc,nums);
        RunningSumArray_1480 test1480=new RunningSumArray_1480();
        int[] result= test1480.runningSum(nums);
        System.out.println(Arrays.toString(result));
    }

    public static void Test_1342(Scanner sc){
        int num=sc.nextInt();
        NumbersStepReduceToZero_1342 test1342=new NumbersStepReduceToZero_1342();
        int step= test1342.numberOfSteps(num);
        System.out.println(step);
    }

    public static void Test_0383(Scanner sc){
        String ransomNote=sc.next();
        String magazine=sc.next();
        RansomNote_0383 test0383=new RansomNote_0383();
        boolean result=test0383.canConstruct(ransomNote,magazine);
        System.out.println(result);
    }
}
