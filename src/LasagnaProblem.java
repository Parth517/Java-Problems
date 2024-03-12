
public class LasagnaProblem {
    // TODO: define the 'expectedMinutesInOven()' method
    int expectedMinutesInOven=40;
    public int expectedMinutesInOven(){
        return expectedMinutesInOven;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutesInOven){
        return expectedMinutesInOven()-actualMinutesInOven;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayers){
        return numberOfLayers*2;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberOfLayers,int actualMinutesInOven){
        return preparationTimeInMinutes(numberOfLayers)+actualMinutesInOven;
    }
    public static void main(String[] args){
        LasagnaProblem lasagna=new LasagnaProblem();
        lasagna.expectedMinutesInOven();
        lasagna.remainingMinutesInOven(20);
        lasagna.preparationTimeInMinutes(2);
        lasagna.totalTimeInMinutes(2,20);
    }
}