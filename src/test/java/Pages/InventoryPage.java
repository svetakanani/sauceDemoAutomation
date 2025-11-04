package Pages;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import util.BaseClass;

public class InventoryPage extends BaseClass{


	public static void AddInventoryAndVerifyCost() {
		page.locator("#add-to-cart-sauce-labs-backpack").click();
		page.locator("#shopping_cart_container").click();
		String InventoryName = page.locator("//div[@class='inventory_item_name']").textContent();
		Assertion assertion = new Assertion();
		assertion.assertEquals(InventoryName, "Sauce Labs Backpack");
		String InventoryPrice = page.locator("//div[@class='inventory_item_price']").textContent();
		assertion.assertEquals(InventoryPrice, "$29.99");
		
		
	}
}
