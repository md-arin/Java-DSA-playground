public class SearchinString {
    public static void main(String[] args) {
        String str = "Md Arin Alam";
        char target = 'l';
        System.out.println(search(str, target));
    }
    static boolean search(String str, int target){
        if (str.length()==0){
            return false;
        }

        for (int i = 0; i<str.length(); i++){
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
