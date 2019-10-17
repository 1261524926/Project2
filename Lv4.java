package com.company;
import java.lang.*;

public class Lv4 {
    public static void main(String[] args) {

    }
}


class MutableStringArray{
    String string[]=null;
    int length;

    MutableStringArray(String string[]){
        this.string=string;
        this.length=this.string.length;
    }

    int getlength(){
        if(this.string.length==this.length){
            return this.string.length;
        }else{
            return 0;
        }
    }


    void print(){
        if(this.string.length!=0){
            System.out.print("{");
            for(int i=0;i<this.string.length-1;i++){
                System.out.print(string[i]+",");
            }
            System.out.print(this.string[this.string.length-1]+"}");
        }
    }

    boolean add(String s){
        String string[]=new String[this.string.length+1];
        for(int i=0;i<this.string.length;i++){
            string[i]=this.string[i];
        }
        string[string.length-1]=s;
        this.string=string;
        this.length=this.string.length;
        return true;
    }

    boolean add(String s[]){
        String string[]=new String[this.string.length+s.length];
        for(int i=0;i<this.string.length;i++){
            string[i]=this.string[i];
        }
        for(int i=this.string.length;i<this.string.length+s.length;i++){
            string[i]=s[i-this.string.length];
        }
        this.string=string;
        this.length=this.string.length;
        return true;
    }

    boolean addAt(String s,int index){
        String temp[]=new String[this.string.length];
        String string[]=new String[this.string.length+1];

        if(index==this.string.length){
            this.add(s);
            return true;
        }else if(index<this.string.length){
            for(int i=0;i<=index-1;i++){
                string[i]=this.string[i];
            }
            string[index]=s;
            for(int i=index+1;i<string.length;i++){
                string[i]=this.string[i-1];
            }
            this.string=string;
            this.length=this.string.length;
            return true;
        }else{
            System.out.println("Wrong:index beyond range");
            return false;
        }
    }

    boolean deleteLast(){
        String string[]=new String[this.string.length-1];
        for(int i=0;i<string.length;i++){
            string[i]=this.string[i];
        }
        this.string=string;
        this.length=this.string.length;
        return true;
    }

    boolean deleteAt(int index){
        if(index>=this.string.length||index<0){
            System.out.println("Wrong:index beyond range");
            return false;
        }else{
            String string[]=new String[this.string.length-1];
            for(int i=0;i<=index-1;i++){
                string[i]=this.string[i];
            }
            for(int i=index;i<string.length;i++){
                string[i]=this.string[i+1];
            }
            this.string=string;
            this.length=this.string.length;
            return true;
        }
    }

    boolean clear(){
        String string[]=new String[this.string.length];
        this.string=string;
        this.length=this.string.length;
        return true;
    }

    boolean changeAt(int index,String s){
        if(index<0||index>=this.string.length){
            System.out.println("Wrong:index beyond range");
            return false;
        }else{
            this.string[index]=s;
            return true;
        }
    }

    String get(int index){
        if(index<0||index>=this.string.length){
            System.out.println("Wrong:index beyond range");
            return "?";
        }else{
            return this.string[index];
        }
    }

    boolean contains(String s){
        for(int i=0;i<this.string.length;i++){
            if(this.string[i].equals(s)){
                return true;
            }
        }
        return false;
    }

    int getLength(){
        return this.string.length;
    }
}