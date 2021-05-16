package com.dws.pageObject.pages;

import com.dws.pages.base.PageObjectBase;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static com.dws.helper.CartHelper.getCartHelper;

public class CartPage extends PageObjectBase {
    
    @FindBy(xpath = "//td[@class='cart-total-right']//strong")
    private WebElement labelTotal;
        
    public CartPage assertTotalPrice() {
        float priceLabelTotal = Float.parseFloat(labelTotal.getText());
        Assertions.assertEquals(getCartHelper().getTotalPrice(), priceLabelTotal,
                "Checking the total value of the goods");
        return this;
    }
}