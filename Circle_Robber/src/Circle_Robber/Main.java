package Circle_Robber;

/*This is the main class.
The users can change the input value in the hardcoded line.
The calculation will be conducted by the implementation class. The implementation will be recursively checked through for loop. 

Name: Hyejin Kim
Date: 10/12/2021*/

public class Main {
    public static void main(String[] args){
        Circle_Robber CR = new Circle_Robber(); 
        int[] user_houses = {1,1,2,3}; //The users can change their input values in the array here.
        int output;
        output = CR.circle_robber(user_houses);
        System.out.println("The maximum amount of the array will be " + output);
    }
}
