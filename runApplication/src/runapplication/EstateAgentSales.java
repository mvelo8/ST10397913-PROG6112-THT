/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runapplication;

/**
 *
 * @author lab_services_student
 */
public class EstateAgentSales extends EstateAgent implements iEstateAgent  {
   
    public EstateAgentSales(String agentName, double propertyPrice) {
        super(agentName, propertyPrice);
    }

    public void printPropertyReport() {
        System.out.println("Estate Agent Name: " + getAgentName());
        System.out.println("Property Sale Price: $" + getPropertyPrice());
        System.out.println("Estate Agent Commission: $" + getAgentCommission());
    }
}
 

