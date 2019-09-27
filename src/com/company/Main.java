package com.company;

public class Main {

    public static void main(String[] args) {

        int arry[][] = new int[3][3];

        arry[0][0]= 90;
        arry[0][1]= 40;
        arry[0][2]= 40;
        arry[1][0]= 45;
        arry[1][1]= 78;
        arry[1][2]= 15;
        arry[2][0]= 75;
        arry[2][1]= 78;
        arry[2][2]= 14;

        for(int i=0 ;i<3;i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(arry[i][j]+"   ");
            }
            System.out.println();
        }
    }
}
