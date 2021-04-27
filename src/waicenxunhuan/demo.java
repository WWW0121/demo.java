package waicenxunhuan;

import java.util.Scanner;

/**
 * @author wangwenbo
 * @data 2021/3/26 8:17
 */
public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第" +(i+1) + "个人购买的商品的价格");
            int count = 0;
            for (int j = 0; j < 3; j++) {   //每个人买的商品
                int price = scanner.nextInt();
                if (price >= 300) {
                    count++;
                }
            }
            System.out.println("第" + (i+1) + "个人有" + count + "件商品享受8折优惠");
        }


    }
}
