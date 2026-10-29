public class Hello {

    static void update(int number, int[] numbers) {
        number += 5;
        numbers[0] += 5;
    }

    public static void main(String[] args) {
        int number = 10;
        int[] numbers = {10, 20};

        update(number, numbers);

        System.out.println(number);
        System.out.println(numbers[0]);
    }
}