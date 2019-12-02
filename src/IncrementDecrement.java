public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;

        //Post
        lives--;
        lives++;
        System.out.println(lives);
        //Pre

        int gift = 100 + ++lives;
        System.out.println(gift);
        System.out.println(lives);
    }
}

