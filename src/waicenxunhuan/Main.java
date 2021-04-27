package waicenxunhuan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("请输入等腰三角形的行数");
        Scanner scanner = new Scanner(System.in);
        int hangshu = scanner.nextInt();
        for (int i = 1; i < hangshu; i++) {     //  控制行数
            for (int j = 0; j < 5 - i; j++) {   //  一行中" "的个数
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i-1; k++) {   //  一行中"*"的个数
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
