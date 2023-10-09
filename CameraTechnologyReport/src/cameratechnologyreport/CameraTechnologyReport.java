/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cameratechnologyreport;

/**
 *
 * @author lab_services_student
 */
public class CameraTechnologyReport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] manufacturers = {"CANON", "SONY", "NIKON"};
        int[][] prices = {
            {10500, 8500},
            {9500, 7200},
            {12000, 8000}
        };

        int totalDifference = 0;
        int maxDifference = 0;
        String manufacturerWithMaxDifference = "";

        System.out.println("Camera Technology Report");
        System.out.println("------------------------");
        System.out.println("Manufacturer\tMirrorless\tDSLR\tDifference");

        for (int i = 0; i < manufacturers.length; i++) {
            int mirrorlessPrice = prices[i][0];
            int dslrPrice = prices[i][1];
            int difference = mirrorlessPrice - dslrPrice;

            totalDifference += difference;

            System.out.print(manufacturers[i] + "\t\t" + mirrorlessPrice + "\t\t" + dslrPrice + "\t\t" + difference);

            if (difference >= 2500) {
                System.out.print(" ***");
            }

            System.out.println();

            if (difference > maxDifference) {
                maxDifference = difference;
                manufacturerWithMaxDifference = manufacturers[i];
            }
        }

        System.out.println("------------------------");
        System.out.println("Total Difference: " + totalDifference);
        System.out.println("Manufacturer with Max Difference: " + manufacturerWithMaxDifference);
    }
}


