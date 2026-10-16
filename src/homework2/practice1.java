import java.util.Scanner;
public class practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入学生成绩：");
        int x = sc.nextInt();
        char grade;

        // 先判断得到等级字符
        if(x >=85){
            grade = 'A';
        }else if(x >=70){
            grade = 'B';
        }else if(x >=60){
            grade = 'C';
        }else{
            grade = 'D';
        }

        // 题目给的switch核心代码
        switch(grade){
            case 'A':System.out.println(grade+" is 85～100");
                break;
            case 'B':System.out.println(grade+" is 70～84");
                break;
            case 'C':System.out.println(grade+" is 60～69");
                break;
            case 'D':System.out.println(grade+" is <60");
                break;
            default:System.out.println("input error");
        }
        sc.close();
    }
}
