package org.example;

class GFG {
   public static void main(String args[]){

           String rev="Vinayak";
           char ch;
           String r="";
           for(int i =0;i<rev.length();i++){
               ch = rev.charAt(i);
               r= ch+r;

           }
           System.out.println("New reverse String: "  + r);
       }
   }

