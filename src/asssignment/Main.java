package asssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        ArrayList<Sinhvien> dsSv = new ArrayList<>();
        boolean run = true;
        do {
            System.out.println("chon chuc nang:");
            System.out.println("1. them Sv");
            System.out.println("2. sua Sv:");
            System.out.println("3. xoa Sv:");
            System.out.println("4. sap xep theo GPA:");
            System.out.println("5. sap xep theo ten:");
            System.out.println("6.xoa danh sach Sv:");
            System.out.println("7. thoat:");
            Scanner sc = new Scanner(System.in);
            int c = sc.nextInt();
            if(c == 0){
                run = false;
            }else if(c == 1){
                System.out.println("nhap id sv:");
                int id = sc.nextInt();
            }
        }while (run);
    }
}
