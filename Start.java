package com.muslejava.hello;

public class Start {
    public static void main(String[] args) {
        //打印空心金字塔
        //1.先打印一个矩形
        //2.打印半个金字塔
        //3.打印整个金字塔
        int totalLevel = 10;

        for(int i = 1 ; i<=totalLevel ; i++){ // i表示层数
            //控制打印每层的星星的个数。
            //在输出星之前还要打印空格。
            for (int k = 1; k<= totalLevel -i ; k++){
                System.out.print(" ");
            }
            for(int j =1 ; j<= 2 * i -1 ;j++){
                if(j==1 || j ==2 * i  -1 || i == totalLevel){
                    System.out.print("*");

                }else
                System.out.print(" ");
            }
            //每打印完一层的星后就换行
            System.out.println("");


        }


    }
}
