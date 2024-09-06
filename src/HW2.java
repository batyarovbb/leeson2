import java.util.Random;

public class HW2 { public static void main(String[] args) {
    System.out.println(permission(generateRandomAge(), -9));
    System.out.println(permission(generateRandomAge(), 0));
    System.out.println(permission(generateRandomAge(), 21));
    System.out.println(permission(generateRandomAge(), 31));
    System.out.println(permission(generateRandomAge(), 34));
}

    public static String permission(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100);
    }
}

