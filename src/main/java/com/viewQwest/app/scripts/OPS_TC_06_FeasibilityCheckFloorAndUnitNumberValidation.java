package com.viewQwest.app.scripts;


import com.viewQwest.app.contexts.DataPansContext;
import com.viewQwest.app.documents.FeasibilityCheckFloorAndUnitNumberValidation;
import com.viewQwest.app.enums.*;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * TEST CASE : OPS_TC_05_NewSubscriberCreationFloorPlan59
 * DESCRIPTION : Check new user creation floor
 * SOFT DEPENDENCY : N/A
 * HARD DEPENDENCY : N/A
 */

public class OPS_TC_06_FeasibilityCheckFloorAndUnitNumberValidation extends ExtentTestNGITestListener {
    @Step("Step 1 : Create new subscriber")
    @Test
    public void selectPlan() {
        logger = extent.createTest(this.getClass().getName(), "Test Plan " + DataPlans.FiberBundle_1GBAnnual.getPlan());

        DataPansContext context = new DataPansContext();
        context.setTypeOfSubscription(TypeOfSubscriptions.NewSubscriber.getSubscriptionsType());

        context.setDataPlan(DataPlans.FiberBundle_1GBAnnual.getPlan());
        context.setPostalCode("408600");
        context.setLandedPremises(false);


        FeasibilityCheckFloorAndUnitNumberValidation subscriber = new FeasibilityCheckFloorAndUnitNumberValidation(context);
        subscriber.FloorAndUnitNumberValidation();
    }


}
