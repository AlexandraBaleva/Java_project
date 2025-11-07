public class AverageCalculator {
    int [] nums = {10, 20, 23, 50, 100};

    public static int findAverage(int [] numsParameter){
        int sum = 0;
        for (int num : numsParameter) {
          sum += num;    
        } 
        
       
        return sum / numsParameter.length;
    }

    public static void main(String[] args) {

        int [] localNums = {50, 80, 23, 50, 100};
        int average = findAverage(localNums);
        System.out.println("Sredna stoinost: " + average);
        }
    }

