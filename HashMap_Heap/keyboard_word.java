package HashMap_Heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class keyboard_word {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String[] words = new String[n];
		for (int i = 0; i < n; i++)
			words[i] = scn.next();
		String[] res = findWords(words);
		for (int i = 0; i < res.length; i++)
			System.out.print(res[i] + " ");
	}

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input an array of string.
	// It should return an array of suitable strings.
   public static String[] findWords(String[] words) {
         
         HashMap<Character,Integer> map=new HashMap<>();
         
         String[] strs = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
         // Attach all the letters to their respective row number in tha keyboard in hmap
         for(int i=0;i<strs.length;i++){
             for(char ch:strs[i].toCharArray()){
                 map.put(ch,i);
             }
         }
         
         ArrayList<String> res=new ArrayList<>();
         
         // now for each word check if each of its letter belong to same index or not
         for(String s:words){
             int idx=map.get(s.toUpperCase().charAt(0));
             boolean bl=true;
             for(char ch: s.toUpperCase().toCharArray()){
                 if(map.get(ch)!=idx){
                     bl=false;
                     break;
                 }
             }
             if(bl==true){
                 res.add(s);
             }
         }
         
         String[] arr=new String[res.size()];
         for(int i=0;i<res.size();i++){
             String str=res.get(i);
             arr[i]=str;
         }
         
         return arr;
     }
 }