public class Palindrome{
    public static void main(String[] args){
        String s = "lein";
        System.out.println(pal(s));

    }
    public static boolean pal(String str){
        int i = 0;
        int j = str.length()-1;
        while(j>i){
            if(str.substring(i,i+1).compareTo(str.substring(j,j+1))==0){
                i++;
                j--;
            }
            else{
                return false;
            }
         
        }
        return true;
    }
}