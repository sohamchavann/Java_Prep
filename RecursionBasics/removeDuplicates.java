//remove duplicates
package RecursionBasics;

public class removeDuplicates {
    public static void main(String[] args) {
        String str = "appnnacollege";
        int idx = 0;
        StringBuilder newStr = new StringBuilder("");
        boolean arrmap[] = new boolean[26];
        soln(str, idx, newStr,arrmap );
    }
    public static void soln(String str, int idx, StringBuilder newStr, boolean arrmap[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(arrmap[currChar-'a']== true){
            soln(str,idx+1,newStr,arrmap);
        }
        else{
            arrmap[currChar-'a']=true;
            newStr.append(currChar);
            soln(str, idx+1, newStr, arrmap);
        }
    }
}
