import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class phoneNumber {
    public static void main(String[] args) {
        System.out.println(letterCombinations(""));
    }
    static List<String> letterCombinations(String digits) {
        ArrayList<String> list = pad("", digits);
        return list;
    }
    static ArrayList<String> pad(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        int digits = up.charAt(0)-'0';
        for(int i = (digits-2)*3;i<(digits-1)*3;i++){
            char ch = (char)('a'+i);
            list.addAll(pad(p+ch,up.substring(1)));
        }
        return list;
    }
}



