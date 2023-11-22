/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 *
 * @author lab_services_student
 */
public class EstateAgentNGTest {
    
    public EstateAgentNGTest() {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testEstateAgentSales() {
        EstateAgent estateAgent = new EstateAgent();

        double[] propertySales = {800000, 1500000, 2000000};
        double expectedTotalSales = 4300000;

        double actualTotalSales = estateAgent.estateAgentSales(propertySales);

        Assertions.assertEquals(expectedTotalSales, actualTotalSales);
    }

    @Test
    public void testEstateAgentCommission() {
        EstateAgent estateAgent = new EstateAgent();

        double propertySales = 4300000;
        double expectedCommission = 86000;

        double actualCommission = estateAgent.estateAgentCommission(propertySales);

        Assertions.assertEquals(expectedCommission, actualCommission);
    }

    @Test
    public void testTopEstateAgent() {
        EstateAgent estateAgent = new EstateAgent();

        double[] totalSales = {4300000, 3500000};
        int expectedTopAgentIndex = 0;

        int actualTopAgentIndex = estateAgent.topEstateAgent(totalSales);

        Assertions.assertEquals(expectedTopAgentIndex, actualTopAgentIndex);
    }
    
}
