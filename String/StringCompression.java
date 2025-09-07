package String;

//Compress the string
public class StringCompression {
    public static void main(String[] args) {
        String s = "aaabbccddd";
        System.out.println(soln(s));
        String str =  "a4b2c3";
        System.out.println(decodeString(str));
    }
    public static String soln(String s){
        StringBuilder sb  = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            int count = 1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(s.charAt(i));
            if(count>1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }
    private static String decodeString(String s){
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<s.length();i++){
            char curr = s.charAt(i);
            int cnt = s.charAt(++i) - '0';

            for(int j=0;j<cnt;j++){
                sb.append(curr);
            }
        }
        return sb.toString();
    }
}
