package Task4.example;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static long getSize(File folder) {
        long total = 0;
        File[] files = folder.listFiles();

        if (files == null) {
            return 0;
        }

        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                total = total + files[i].length();
            } else if (files[i].isDirectory()) {
                total = total + getSize(files[i]);
            }
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter directory name: ");
        String name = input.nextLine();

        File directory = new File(name);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Error: the directory does not exist.");
        } else {
            long bytes = getSize(directory);
            double kilobytes = bytes / 1024.0;
            double megabytes = bytes / (1024.0 * 1024.0);

            System.out.println("Total size:");
            System.out.println(bytes + " bytes");
            System.out.println(kilobytes + " KB");
            System.out.println(megabytes + " MB");
        }
    }
}