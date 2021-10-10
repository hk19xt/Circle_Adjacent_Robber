package Circle_Robber;

public class Main {
    public static void main(String[] args){
        Circle_Robber CR = new Circle_Robber();
        int[] user_houses = {1,2,3,1};
        int output;
        output = CR.circle_robber(user_houses);
        System.out.println(output);
    }
}
