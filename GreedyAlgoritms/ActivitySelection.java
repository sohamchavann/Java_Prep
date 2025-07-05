package GreedyAlgoritms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        //if activities sorted based on ending time sort time using 2d array
        int activities[][] = new int[start.length][3];
        //3 cols: 0th(index), 1st(start time), 2nd(end time)

        for(int i = 0; i<start.length;i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        //lamda func -> shortform
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        //end time based sort
        int maxActi = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st acti
        maxActi = 1;
        ans.add(activities[0][0] );
        int lastEnd = activities[0][2];
        for(int i = 1;i<end.length;i++){
            if(activities[i][1]>=lastEnd){
                //check condn
                maxActi++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("max activities : " +maxActi);

        System.out.println(ans);
    }
}
