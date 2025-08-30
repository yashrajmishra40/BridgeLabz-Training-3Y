package JavaMethod.Level3;
import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {

    public static int generate6DigitOTP() {
        return (int) (Math.random() * 900000) + 100000; // 100000..999999
    }

    public static boolean uniqueOTPs(int trials) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < trials; i++) set.add(generate6DigitOTP());
        return set.size() == trials;
    }

    public static void main(String[] args) {
        int trials = 10;
        int[] otps = new int[trials];
        for (int i = 0; i < trials; i++) {
            otps[i] = generate6DigitOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }
        Set<Integer> otpSet = new HashSet<Integer>();
        for (int v : otps) otpSet.add(v);
        System.out.println("All unique? " + (otpSet.size() == trials));
        System.out.println("uniqueOTPs(trials) quick-check: " + uniqueOTPs(trials));
    }
}

