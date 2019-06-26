package Test;

import com.bigdatainterview.T;

class ThreeNum {


    public static void main(String[] args) {

        T1(5,10,15);
    }

    public static double T1(int a ,int b,int c){
        int v1,v2;
        double result;

        //从大到小排序
        if(a < b) {
            int t = a;
            a = b;
            b = t;
        }
        if(a < c) {
            int t = a;
            a = c;
            c = t;
        }
        if(b < c) {
            int t = b;
            b = c;
            c = t;
        }

        v1=a-b;
        v2=b-c;

        if (v1<=v2 ){
            double t = a+b;
            result = t/2;

            }else {
            double t = c+b;
            result = t/2;
        }
        System.out.println("result:"+result);
        return result;

    }
}


