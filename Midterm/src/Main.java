public class Main {
    public static void main(String[] args) {
        Vector2D a = new Vector2D(10, 20);
        Vector2D b = new Vector2D(-42, 4);
        Vector2D c = new Vector2D(); // create a zero vector
        System.out.printf("%s + %s = %s%n",    a, b,    a.add(b));
        System.out.printf("%s - %s = %s%n",    a, b,    a.subtract(b));
        System.out.printf("%s * %.1f = %s%n",  a, 2.0f, a.multiply(2));
        System.out.printf("%s ⋅ %s = %s%n",    a, b,    a.dot(b));
        System.out.printf("||%s|| = %.1f%n",   a, a.getMagnitude());
        System.out.printf("||%s|| = %.1f%n",   c, c.getMagnitude());
        System.out.println(a.normalized());
        System.out.printf("||^%s|| = %.1f%n",  b, b.normalized().getMagnitude());
    }
}
