package org.example;

class GFG {
   public static void main(String args[]){

           String reverse="Vinayak";
           char ch;
           String r="";
           for(int i =0;i<reverse.length();i++){
               ch = reverse.charAt(i);
               r= ch+r;
               System.out.println("New String After reverse: " +r);

           }
           System.out.println(r);
       }
   }

