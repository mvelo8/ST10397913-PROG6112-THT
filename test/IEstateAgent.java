/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
public interface IEstateAgent {
   
    double estateAgentSales(double[] propertySales);
    double estateAgentCommission(double propertySales);
    int topEstateAgent(double[] totalSales);
}

