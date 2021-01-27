package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("hello world!");
//        int x;
//        x= 10;
//        if(x>5){
//            System.out.println(x+"la so duong");
//        }else{
//            System.out.println(x+"<=5");
//        }
//        for (int i=0;i<10;i++){
//            System.out.println("i="+i);
//        }
        Student st ; //khai bao 1 bien có kieu du lieu Student
        st = new Student(); //tao doi tuong
        Student st2 = new Student();
        st.name ="nguyen van an";
        st2.name ="trinh quang hoa";
        st.run();
        st2.run();
    }
}
