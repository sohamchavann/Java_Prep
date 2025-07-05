//find all subssets of the string
package BackTracking;

public class Subsets {
    public static void findSubsets(String str,int i, String ans){
        //i= idx of CurrChar
        //base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        //recusion
        //yes choice by CurrChar
        findSubsets(str, i+1, ans+str.charAt(i));
        //No choice by CurrChar
        findSubsets(str,i+1,ans);
    }

    public static void main(String[] args) {
        findSubsets("abc",0,"" );
    }
}
