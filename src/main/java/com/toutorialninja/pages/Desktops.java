package com.toutorialninja.pages;

import com.toutorialninja.utility.Utility;
import org.openqa.selenium.By;

public class Desktops extends Utility {
    By positionZtoA = By.id("input-sort");
    By PositionAtoZ = By.id("input-sort");

    public void sortByPositionZtoA(){
        selectByIndexFromDropDown(positionZtoA,2);
    }

    public void sortByPositionAtoZ(){selectByIndexFromDropDown(PositionAtoZ,1);}



}
