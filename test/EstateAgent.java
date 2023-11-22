/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
public class EstateAgent implements IEstateAgent {
   
    @Override
    public double estateAgentSales(double[] propertySales) {
        double totalSales = 0;
        for (double sale : propertySales) {
            totalSales += sale;
        }
        return totalSales;
    }

    @Override
    public double estateAgentCommission(double propertySales) {
        return propertySales * 0.02;
    }

    @Override
    public int topEstateAgent(double[] totalSales) {
        int topAgentIndex = 0;
        double topAgentSales = totalSales[0];
        for (int i = 1; i < totalSales.length; i++) {
            if (totalSales[i] > topAgentSales) {
                topAgentIndex = i;
                topAgentSales = totalSales[i];
            }
        }
        return topAgentIndex;
    }
}

