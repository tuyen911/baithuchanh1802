import java.util.scanner;
public class SwitchDemo {
    public static void main(String agre[]) {
        scanner scan = newScanner (System.in);
        int ngay = scan.nextInt();
        switch(ngay) {
            case 0:system.out.println("Chu nhat");
                break;
            case 1:system.out.println("Thu hai");
                break;
            case 2:system.out.println("Thu ba");
                break;
            case 3:system.out.println("Thu tu");
                break;
            case 4:system.out.println("Thu nam");
                break;
            case 5:system.out.println("Thu sau");
                break;
            case 6:system.out.println("Thu bay");
                break;
            default:system.out.println("So ngay trong tuan sai");
        }
    }
}