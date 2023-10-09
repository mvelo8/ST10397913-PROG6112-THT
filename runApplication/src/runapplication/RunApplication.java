/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runapplication;

/**
 *
 * @author lab_services_student
 */
public class RunApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EstateAgentSales agentSales = new EstateAgentSales("John Doe", 250000.0);
        agentSales.printPropertyReport();
    }
}
    
    
