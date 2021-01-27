package l1;

public class lab1 {
    int code;
    String name;
    double money;
    int qty;
    String unit;
    void changeqty(int q){
        qty += q;
    }
    void changemoney(double p){
        money =p;
    }
    boolean checkStock(){
        if(qty>0) return  true;
        return  false;
    }
    void run(){
        System.out.println(code+name+money+qty+unit);
    }
}
