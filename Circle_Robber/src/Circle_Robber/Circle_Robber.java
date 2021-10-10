package Circle_Robber;

public class Circle_Robber {

    public int calculation(int[] user_house, int initial, int last){
        int update_number_houses = last - initial + 1;

        int[] new_maximum = new int[update_number_houses];
        new_maximum[0] = user_house[initial];
        new_maximum[1] = Math.max(user_house[initial],user_house[initial+1]);

        for(int i=initial+2; i<=last; i++){
            new_maximum[i-initial]=Math.max(user_house[i]+new_maximum[i-initial-2],
                    new_maximum[i-initial-1]);
        }
        return new_maximum[last-initial];
    }


    public int circle_robber(int[] user_house){

        int house_number = user_house.length;

        if(user_house.length == 0){
            return 0;
        }
        if(user_house.length == 1){
            return user_house[0];
        }
        if(user_house.length == 2){
            return Math.max(user_house[0],user_house[1]);
        }
        int a = calculation(user_house,0,house_number-2);
        int b = calculation(user_house,1,house_number-1);

        return Math.max(a,b);

    }
}
