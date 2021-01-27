package l1;

public class mainlab1 {
    public static void main(String[] args) {
        lab1 st = new lab1();
        lab1 st2 = new lab1();
        lab1 st3 = new lab1();
        st.code = 1;
        st2.code = 2;
        st3.code = 3;
        st.name = "iphone12promax";
        st2.name = "iphone5pro";
        st3.name = "iphone22max";
        st.money = 12000000;
        st2.money = 9000000;
        st3.money = 120000000;
        st.qty = 300;
        st2.qty = 1000;
        st3.qty = 30;
        st.unit = "cai";
        st2.unit = "chiec";
        st3.unit = "con";
        st.run();
        st2.run();
        st3.run();

        st.changemoney(12000000);
        st.changeqty(31);
        if(st.checkStock()){
            System.out.println("san pham"+st.name+st.qty+"sp");
        }else {
            System.out.println("san pham"+st.money+st.unit+"sp");
        }
    }
}
