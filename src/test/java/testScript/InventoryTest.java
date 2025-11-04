package testScript;

import org.testng.annotations.Test;

import Pages.InventoryPage;


public class InventoryTest extends InventoryPage{

	@Test
	public void InventoryTest() {
		AddInventoryAndVerifyCost();
		
	}
}
