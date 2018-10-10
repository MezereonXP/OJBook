public class Main {

    public static void main(String[] args) {

        double scord = 0;
        double floatCloud = 592;
        double contribution = 0;
        double onlineTime = 3;
        double upload = 10 * 1024;
        double download = 37.84 * 1024;

        scord = calculateScord(floatCloud, contribution, onlineTime, upload, download);
        System.out.println("scord = [" + scord + "]");
        while (scord < 0) {
            upload += 1024;
            scord = calculateScord(floatCloud, contribution, onlineTime, upload, download);
        }
        System.out.println("upload = [" + upload / 1024 + "]");
    }

    private static double calculateScord(double floatCloud, double contribution, double onlineTime, double upload, double download) {
        double temp = Math.log(Math.abs(download) + 1) / Math.log(2);
        if (temp > 33) {
            temp = 33;
        } else {
            temp = Math.log(Math.abs(download) + 1) / Math.log(2);
        }
        return floatCloud + onlineTime * 5 + contribution * 5 + upload / 10 - download / (34 - temp);
    }

}
