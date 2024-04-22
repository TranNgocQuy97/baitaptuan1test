public class Example {
    public static void main(String[] args) {
        // Gọi hàm với giá trị đầu vào là 5
        int result = calculate(5);
        System.out.println("Kết quả: " + result);
    }

    // Hàm tính toán
    public static int calculate(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                // Nếu i là số chẵn, cộng vào tổng
                sum += i;
            } else {
                // Nếu i là số lẻ, trừ đi khỏi tổng
                sum -= i;
            }
        }
        return sum;
    }
}
