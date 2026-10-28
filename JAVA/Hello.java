public class Hello {
    public static void main(String[] args) {
        int[] scores = {60, 70, 85, 95, 40};
        int count = 0;
        int sum = 0;

        for (int score : scores) {
            if (score < 70) {
                continue;
            }

            count++;
            sum += score;
        }

        int average = sum / count;

        System.out.println(count);
        System.out.println(average);
    }
}