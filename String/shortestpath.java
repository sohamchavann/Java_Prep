package String;

public class shortestpath {
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(soln(path));
    }
    public static float soln(String path){
        int x = 0, y = 0;

        for(int i = 0;i<path.length();i++){
            char currDir = path.charAt(i);

            if(currDir == 'N'){
                y++;
            }
            else if(currDir == 'S'){
                y--;
            }
            else if(currDir == 'E'){
                x++;
            }
            else if(currDir == 'W'){
                x--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 +y2);
    }
}
