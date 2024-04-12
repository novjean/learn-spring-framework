package com.novatech.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
//        for(int i=0; i<=n; i++){
//            String line = sc.nextLine();
//            String[] nums = line.split(" ");
//            ArrayList listNums = new ArrayList<>();
//            
//            try{
//                int columnCount = Integer.parseInt(nums[0]);
//                 
//                for(int index = 1; index<=columnCount; index++){
//                    listNums.add(nums[index]);
//                }
//                lists.add(listNums);
//                
//                /*
//                for(int a = 0; a<columnCount; a++){
//                    System.out.printf("%s ", listNums.get(a));
//                }
//                System.out.println();
//                */
//            } catch (Exception e){
//                System.out.println(e.toString());
//            }
//            
//            
//        }
        
        for (int i = 0; i < n; i++) 
        {  

            int d = sc.nextInt();
            list.add(new ArrayList<Integer>());
            for (int j = 0; j < d; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        
        
        int numQueries = sc.nextInt();
        ArrayList<Integer> xs = new ArrayList<>();
        ArrayList<Integer> ys = new ArrayList<>();
        
        System.out.println("num queries : " + numQueries);
        
        for(int i=0;i<=numQueries;i++){
            String line = sc.nextLine();
            String[] nums = line.split(" ");
            try{
                //System.out.printf("%s,%s\n", nums[0], nums[1]);

                xs.add(Integer.parseInt(nums[0]));
                ys.add(Integer.parseInt(nums[1]));
                
            } catch(Exception e){
                System.out.println(e.toString());
            }
            
        }
        
        for(int i=0; i<=numQueries; i++){
            int x = xs.get(i);
            int y = ys.get(i);
            
            if(x > n){
                System.out.println("ERROR");
            } else {
                
                try{
                    ArrayList<Integer> row = list.get(x);
                    System.out.println(row.get(y));
                } catch (Exception e){
                    System.out.println("ERROR");
                }
            } 
        }
	}

}
