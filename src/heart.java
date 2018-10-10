import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @program: heart
 * @description:
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/9/4
 **/
public class heart {
    public static void main(String[] args) {
        String[][] map = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                map[i][j] = "-";
            }
        }

        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        if (check(x1 - 1) && check(y1 - 1)) {
            map[x1 - 1][y1 - 1] = "#";
        }
        if (check(x1 - 1) && check(y2 - 1)) {
            map[x2 - 1][y2 - 1] = "#";
        }

        boolean flag = true;
        int margin = Math.abs(y1 - y2);
        int layer = margin % 2 != 0 ? margin / 2 : (margin + 1) / 2;

        int width = 1;

        int left = Math.min(y1, y2) - layer;
        int right = Math.max(y1, y2) + layer;

        for (int i = 1; i <= layer; i++) {
            width = 2 * i + 1;
            if (check(x1 - 1 + i) && check(y1 - 1)) {
                map[x1 - 1 + i][y1 - 1] = "#";
            }
            if (check(x1 - 1 + i) && check(y2 - 1)) {
                map[x2 - 1 + i][y2 - 1] = "#";
            }
            for (int j = 1; j <= width / 2; j++) {
                if (check(y1 + j - 1) && check(x1 + i - 1)) {
                    map[x1 + i - 1][y1 + j - 1] = "#";
                }
                if (check(y1 - j - 1) && check(x1 + i - 1)) {
                    map[x1 + i - 1][y1 - j - 1] = "#";
                }
                if (check(y2 + j - 1) && check(x1 + i - 1)) {
                    map[x1 + i - 1][y2 + j - 1] = "#";
                }
                if (check(y2 - j - 1) && check(x1 + i - 1)) {
                    map[x1 + i - 1][y2 - j - 1] = "#";
                }
            }
        }

        int layer2 = layer + 1;
        if (margin % 2 == 0) {
            right--;
            left++;
        }
        while (right - left >= 0) {
            for (int i = left; i <= right; i++) {
                if (check(x1 + layer2 - 1) && check(i - 1)) {
                    map[x1 + layer2 - 1][i - 1] = "#";
                }
            }
            left++;
            right--;
            layer2++;
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(map[i][j] + (j != 10 ? " " : ""));
            }
            System.out.println();
        }
    }

    private static boolean check(int i) {
        return i < 10 && i >= 0;
    }
}
