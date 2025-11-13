/*
 * Ad Soyad: [Emine Zehra Duyar]
 * Ogrenci No: 250541027
 *Tarih: 13.11.2025
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */
import java.util.Scanner;

public class PhysicsAssistant {

    // Sabit Tanımlama (Zorunlu)
    final static double GRAVITY = 9.8;

    // --- 1. HIZ METODU (v = s / t) ---
    public static double calculateSpeed(double distance, double time) {
        return distance / time;
    }

    // --- 2. İVME METODU (a = Δv / t) ---
    public static double calculateAcceleration(double deltaVelocity, double time) {
        return deltaVelocity / time;
    }

    // --- 3. KUVVET METODU (F = m * a) ---
    public static double calculateForce(double mass, double acceleration) {
        return mass * acceleration;
    }

    // --- 4. İŞ METODU (W = F * d) ---
    public static double calculateWork(double force, double distance) {
        return force * distance;
    }

    // --- 5. GÜÇ METODU (P = W / t) ---
    public static double calculatePower(double work, double time) {
        return work / time;
    }

    // --- 6. KİNETİK ENERJİ METODU (KE = 0.5 * m * v^2) ---
    // Math.pow() kullanılmalı
    public static double calculateKineticEnergy(double mass, double velocity) {
        return 0.5 * mass * Math.pow(velocity, 2);
    }

    // --- 7. POTANSİYEL ENERJİ METODU (PE = m * g * h) ---
    // GRAVITY sabiti kullanılmalı
    public static double calculatePotentialEnergy(double mass, double height) {
        return mass * GRAVITY * height;
    }

    // --- 8. MOMENTUM METODU (p = m * v) ---
    public static double calculateMomentum(double mass, double velocity) {
        return mass * velocity;
    }


    // --- ANA METOT (Test için) ---
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Fizik Formül Asistanı ---");

        // 1. Hız Testi
        System.out.print("Hız için mesafe (m) girin: ");
        double distance = scanner.nextDouble();
        System.out.print("Hız için zaman (s) girin: ");
        double timeForSpeed = scanner.nextDouble();
        double speed = calculateSpeed(distance, timeForSpeed);
        System.out.printf("HESAPLANDI -> Hız: %.2f m/s\n", speed);
        System.out.println("--------------------");

        // 2. İvme Testi
        System.out.print("İvme için hız değişimi (Δv) girin: ");
        double deltaV = scanner.nextDouble();
        System.out.print("İvme için zaman (s) girin: ");
        double timeForAccel = scanner.nextDouble();
        double acceleration = calculateAcceleration(deltaV, timeForAccel);
        System.out.printf("HESAPLANDI -> İvme: %.2f m/s²\n", acceleration);
        System.out.println("--------------------");

        // 3. Kuvvet Testi (Hesaplanan ivmeyi kullanabiliriz veya yeni alabiliriz)
        System.out.print("Kuvvet için kütle (kg) girin: ");
        double massForForce = scanner.nextDouble();
        // Önceki adımdaki ivmeyi kullanalım
        double force = calculateForce(massForForce, acceleration);
        System.out.printf("HESAPLANDI -> Kuvvet (%.2f kg * %.2f m/s²): %.2f N\n", massForForce, acceleration, force);
        System.out.println("--------------------");

        // 4. İş Testi
        System.out.print("İş için mesafe (m) girin: ");
        double distanceForWork = scanner.nextDouble();
        // Önceki adımdaki kuvveti kullanalım
        double work = calculateWork(force, distanceForWork);
        System.out.printf("HESAPLANDI -> İş (%.2f N * %.2f m): %.2f J\n", force, distanceForWork, work);
        System.out.println("--------------------");

        // 5. Güç Testi
        System.out.print("Güç için zaman (s) girin: ");
        double timeForPower = scanner.nextDouble();
        // Önceki adımdaki işi kullanalım
        double power = calculatePower(work, timeForPower);
        System.out.printf("HESAPLANDI -> Güç (%.2f J / %.2f s): %.2f W\n", work, timeForPower, power);
        System.out.println("--------------------");

        // 6. Kinetik Enerji Testi
        System.out.print("Kinetik Enerji için kütle (kg) girin: ");
        double massForKE = scanner.nextDouble();
        System.out.print("Kinetik Enerji için hız (m/s) girin: ");
        double velocityForKE = scanner.nextDouble();
        double kineticEnergy = calculateKineticEnergy(massForKE, velocityForKE);
        System.out.printf("HESAPLANDI -> Kinetik Enerji: %.2f J\n", kineticEnergy);
        System.out.println("--------------------");

        // 7. Potansiyel Enerji Testi
        System.out.print("Potansiyel Enerji için kütle (kg) girin: ");
        double massForPE = scanner.nextDouble();
        System.out.print("Potansiyel Enerji için yükseklik (m) girin: ");
        double heightForPE = scanner.nextDouble();
        double potentialEnergy = calculatePotentialEnergy(massForPE, heightForPE);
        System.out.printf("HESAPLANDI -> Potansiyel Enerji (g=%.1f): %.2f J\n", GRAVITY, potentialEnergy);
        System.out.println("--------------------");

        // 8. Momentum Testi
        System.out.print("Momentum için kütle (kg) girin: ");
        double massForMomentum = scanner.nextDouble();
        System.out.print("Momentum için hız (m/s) girin: ");
        double velocityForMomentum = scanner.nextDouble();
        double momentum = calculateMomentum(massForMomentum, velocityForMomentum);
        System.out.printf("HESAPLANDI -> Momentum: %.2f kg*m/s\n", momentum);

        scanner.close();
    }
}
