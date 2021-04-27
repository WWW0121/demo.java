package waicenxunhuan;

import java.util.Scanner;

/**
 * @author wangwenbo
 * @data 2021/3/26 9:32
 */
public class demo02 {
    public static void main(String[] args) {
        System.out.println("****** 欢迎进入系统********");
        System.out.println("\t\t\t 1.注册");
        System.out.println("\t\t\t 2.登录");
        System.out.println("\t\t\t 3.抽奖");
        System.out.println("*************************");
        System.out.println("\t\t\t 请选择菜单：");
        Scanner scanner = new Scanner(System.in);
        int haha = scanner.nextInt();
        switch (haha){
            case 1:
                System.out.println("系统< 注册");
                break;
            case 2:
                System.out.println("系统< 登录");
                break;
            case 3:
                System.out.println("系统< 抽奖");
                break;
            default:
                System.out.println("您输入的信息有误");

        }
        String answer ;
        Scanner input = new Scanner(System.in);
        System.out.println("继续吗（y/n）");
        answer =  input.next();
        System.out.println("*******欢迎进入系统*********");
        System.out.println("1.注册");
         System.out.println("2.登录");
        System.out.println("3.抽奖");
        System.out.println("**************************");


        }
    }
