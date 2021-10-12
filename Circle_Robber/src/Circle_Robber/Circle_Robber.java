package Circle_Robber;

/*This is the implementation class. 
 The maximum amount of money will be calculated based on the recursive method.
 Before starting the calculation, we will check two conditions whether there is only one input value or no value in the array.
 The user inputs will be inserted by the main class. */

public class Circle_Robber {

    public int calculation(int[] user_house, int initial, int last){ 
        int update_number_houses = last - initial + 1; //The number of elements in the array.

        int[] new_maximum = new int[update_number_houses]; //Initiate the new maximum array to store the updated elements.
        new_maximum[0] = user_house[initial]; //The first element initialization.
        new_maximum[1] = Math.max(user_house[initial],user_house[initial+1]); //The second element initialization 
        //by comparing the first and the second elements to return the maximum number.

        for(int i=initial+2; i<=last; i++){ //For loop from the second element to the last element
            new_maximum[i-initial]=Math.max(user_house[i]+new_maximum[i-initial-2],
                    new_maximum[i-initial-1]);
        }
        return new_maximum[last-initial];
    }//calculation


    public int circle_robber(int[] user_house){ //user inputs will be inserted by the main class.

        int house_number = user_house.length; //The number of values in the array.

        if(user_house.length == 0){ //If there is no value in the array, then return zero.
            return 0;
        }
        if(user_house.length == 1){ //If there is only one value in the array, then return that value.
            return user_house[0];
        }
        if(user_house.length == 2){ //If there are two values in the array, then return the maximum value between them.
            return Math.max(user_house[0],user_house[1]);
        }
        //If the above conditions do not apply to any cases, then compare the first to last-1 elements and
        //the second to last elements since the elements are supposted to be adjacent.
        int a = calculation(user_house,0,house_number-2); //The first to last-1 elements
        int b = calculation(user_house,1,house_number-1); //The second to last elements

        return Math.max(a,b); //Compare these two elements to return the maximum value between them.

    }//circle_robber
}//Circle_Robber
