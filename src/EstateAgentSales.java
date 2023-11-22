/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
public class EstateAgentSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] propertySales = {
                {800000, 1500000, 2000000}, //Joe Bloggs
                {700000, 1200000, 1600000}  // Jane Doe
        };

        int[] totalSales = new int[propertySales.length];
        for (int i = 0; i < propertySales.length; i++) {
            int agentTotalSales = 0;
            for (int j = 0; j < propertySales[i].length; j++) {
                agentTotalSales += propertySales[i][j];
            }
            totalSales[i] = agentTotalSales;
            System.out.println("Total sales for Estate Agent " + (i + 1) + ": " + agentTotalSales);
        }

        double[] commissions = new double[propertySales.length];
        for (int i = 0; i < totalSales.length; i++) {
            double commission = totalSales[i] * 0.02;
            commissions[i] = commission;
            System.out.println("Commission earned by Estate Agent " + (i + 1) + ": " + commission);
        }

        int topAgentIndex = 0;
        int topAgentSales = totalSales[0];
        for (int i = 1; i < totalSales.length; i++) {
            if (totalSales[i] > topAgentSales) {
                topAgentIndex = i;
                topAgentSales = totalSales[i];
            }
        }
        System.out.println("Top-selling estate agent: Estate Agent " + (topAgentIndex + 1));
    }
}
    
    