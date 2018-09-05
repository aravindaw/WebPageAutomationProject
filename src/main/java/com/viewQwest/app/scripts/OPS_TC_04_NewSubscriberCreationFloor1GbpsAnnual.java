package com.viewQwest.app.scripts;


import com.viewQwest.app.contexts.DataPansContext;
import com.viewQwest.app.documents.NewSubscriberCreationFloorDocument;
import com.viewQwest.app.enums.*;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Step;

import java.io.File;

/**
 * TEST CASE : OPS_TC_04_NewSubscriberCreationFloor1GbpsAnnual
 * DESCRIPTION : Check new user creation floor
 * SOFT DEPENDENCY : N/A
 * HARD DEPENDENCY : N/A
 */

public class OPS_TC_04_NewSubscriberCreationFloor1GbpsAnnual extends ExtentTestNGITestListener {
    @Step("Step 1 : Create new subscriber")
    @Test
    public void selectPlan() {
        logger = extent.createTest(this.getClass().getName(), "Test Plan " + DataPlans.FiberBundle_1GBAnnual.getPlan());

        DataPansContext context = new DataPansContext();
        context.setTypeOfSubscription(TypeOfSubscriptions.NewSubscriber.getSubscriptionsType());

        context.setDataPlan(DataPlans.FiberBundle_1GBAnnual.getPlan());
        context.setPostalCode("408600");
        context.setLandedPremises(false);
        context.setFloorLevel("23");
        context.setUnitNumber("01");

//        Subscriber details
        context.setInitials(TypesOfInitials.Mrs.getInitialType());
        context.setFirstName("New");
        context.setLastName("Subscriber");
        context.setNricOrPassport("8456958562");
        context.setDob("1978-1-10");
        context.setNationality("Chilean");
        context.setPhoneNumber("07898909");
        context.setMobileNumber("01023562");
        context.setEmailAddress("newsubscriber@gmail.com");
        context.setGender(Gender.Male.toString());

//        Service plan details
        context.setFiberGuard(FiberGuards.fiberGuardHigh.toString());
        context.setHardware(new String[]{Hardware.NETGEAR_AC220.getHardware()});
        context.setOneVoiceAddOnSubscribe(OneVoice.AnnualSubscription.getOneVoiceType());
        context.setOneVoiceAddOnNumber(OneVoice.MonthlyNumberNonDisplay.getOneVoiceType());
        context.setOnsiteInstallation(OnsiteInstall.PerTrip80.getInstallOnsite());
        context.setTvPlayer(TvPlayer.Player118.getPlayer());
        context.setEnableNetflix(true);
//        select country only when enable Netflix
        context.setNetflixCountry(Netflix.NETFLIX_Singapore.getCountryOfNetflix());
        context.setRemark("Sample remark for the test case. Sample remark for the test case. Sample remark for the test case. Sample remark for the test case....");
        context.setPromoterName(Promoters.HusainiAzmi.getPromoter());
        context.setReferenceName(ReferenceNames.Facebook.getReference());

        context.setFrontPage(new File("src/main/resources/front.jpg").getAbsolutePath());
        context.setBackPage(new  File("src/main/resources/back.jpg").getAbsolutePath());

        NewSubscriberCreationFloorDocument subscriber = new NewSubscriberCreationFloorDocument(context);
        subscriber.createNewSubscriber();
    }


}
