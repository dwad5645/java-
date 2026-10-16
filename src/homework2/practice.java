package homework2;

import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入学生成绩：");
        int x = sc.nextInt();

        if(x >=85){
            System.out.println(x+"属于 A 级.");
        }else if(x >=70){
            System.out.println(x+"属于 B 级.");
        }else if(x >=60){
            System.out.println(x+"属于 C 级.");
        }else{
            System.out.println(x+"属于 D 级.");
        }
        sc.close();
    }
}
