public class CalculateAvg {
    public static double find_average(int[] array){
        double sum = 0;
        double avg = 0;

        for (int i=0; i<array.length; i++){
            sum +=array[i];
            avg = sum/array.length;
        }
        return avg;
    }
}
