package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	char[][] student = new char[8][10];
	char[] key = {'D','B','D','C','C','D','A','E','A','D'};
	int[] sum= new int[8];

	for(int i = 0 ; i<student.length;i++){
	    for (int j=0;j<10;j++){
	        student[i][j]=(char)(65 + (int)(Math.random()*5));
        }
    }

	for(int i=0;i<student.length;i++){
	    for(int j = 0;j<10;j++){
	        if(student[i][j]==key[j]){
	            sum[i] = sum[i] + 10;
            }
        }
    }

	System.out.println("student 1 point = " + sum[0]);
        System.out.println("student 2 point = " + sum[1]);
        System.out.println("student 3 point = " + sum[2]);

    }
}
