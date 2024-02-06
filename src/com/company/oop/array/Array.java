package com.company.oop.array;

public class Array {

    public void arrayDes(int j){

         int[] num = {55,2,7,32,44};

//        int array = num[j];
////        System.out.println(array);
////        System.out.println(num.length);
//        num[1]=10;
//        System.out.println(num[0]);
//        System.out.println(num[1]);
//        System.out.println(num[2]);
//        System.out.println(num[3]);
//        System.out.println(num[4]);

//        for(int i=0;i<5;i++){
//            System.out.println(num[i]);
//        }

//        int sum=0;
//        for(int i = 0;i<num.length;i++){
//            sum = sum + num[i];
//        }
//        System.out.println(sum);

//          int max = num[0];
//          for(int i =0;i<num.length;i++){
//              if(num[i]>max){
//                  max = num[i];
//              }
//          }
//        System.out.println(max);
//        int[] reverse = new int[num.length];
//
//        for (int i = 0; i < num.length / 2; i++) {
//            int temp = num[i];
//            num[i] = num[num.length - i - 1];
//            num[num.length - i - 1] = temp;
//        }
//
//// Now, let's print the reversed array
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(num[i]);
//        }

        for(int i=0;i<num.length-1;i++){

            int temp = num[i];
            if(num[i]>num[i+1]){
                num[i]=num[i+1];
                num[i+1]=temp;
            }
        }
        for(int k=0;k< num.length;k++){
            System.out.println(num[k]);
        }
    }
}
