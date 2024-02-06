package Strings;

import java.util.ArrayList;
import java.util.List;

public class dice {
    public static void main(String[] args) {
//        di("",4);
        System.out.println(diList("",4));
    }

    static void di(String p, int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6 && i<=target ; i++) {
            di(p+i,target-i);
        }
    }

    static  ArrayList<String>diList(String p, int target){
        if(target==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <=6 && i<=target ; i++) {
            list.addAll(diList(p+i,target-i));
        }
        return list;
    }
}
