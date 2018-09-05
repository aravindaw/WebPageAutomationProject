package com.viewQwest.app.scripts;


import com.viewQwest.app.contexts.DataPansContext;
import com.viewQwest.app.documents.NewSubscriberCreationFloorDocument;
import com.viewQwest.app.enums.*;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Step;

import java.io.File;

/**
 * TEST CASE : OPS_TC_03_NewSubscriberCreationFloor1GbpsMonthly
 * DESCRIPTION : Check new user creation floor
 * SOFT DEPENDENCY : N/A
 * HARD DEPENDENCY : N/A
 */

public class OPS_TC_03_NewSubscriberCreationFloor1GbpsMonthly extends ExtentTestNGITestListener {
    @Step("Step 1 : Create new subscriber")
    @Test
    public void selectPlan() {
        logger = extent.createTest(this.getClass().getName(), "Test Plan " + DataPlans.FiberBundle_1GBMonthly.getPlan());

        DataPansContext context = new DataPansContext();
        context.setTypeOfSubscription(TypeOfSubscriptions.NewSubscriber.getSubscriptionsType());
        context.setDataPlan(DataPlans.FiberBundle_1GBMonthly.getPlan());
        context.setPostalCode("408600");
        context.setLandedPremises(true);

//        Subscriber details
        context.setInitials(TypesOfInitials.Mrs.getInitialType());
        context.setFirstName("sample");
        context.setLastName("User1");
        context.setNricOrPassport("4565956265");
        context.setDob("1981-9-1");
        context.setNationality("Brazilian");
        context.setPhoneNumber("07512632");
        context.setMobileNumber("01695632");
        context.setEmailAddress("sampleuser1@gmail.com");
        context.setGender(Gender.Male.toString());

//        Service plan details
        context.setFiberGuard(FiberGuards.fiberGuardMod.toString());
        context.setHardware(new String[]{Hardware.NETGEAR_AC220.getHardware()});
        context.setOneVoiceAddOnNumber(OneVoice.MonthlyNumberNonDisplay.getOneVoiceType());
        context.setOnsiteInstallation(OnsiteInstall.PerTrip80Annual.getInstallOnsite());
        context.setTvPlayer(TvPlayer.Player118.getPlayer());
        context.setEnableNetflix(true);
//        select country only when enable Netflix
        context.setNetflixCountry(Netflix.NETFLIX_Singapore.getCountryOfNetflix());
        context.setRemark("Sample remark for the test case. Sample remark for the test case. Sample remark for the test case. Sample remark for the test case....");
        context.setPromoterName(Promoters.PearlyChow.getPromoter());
        context.setReferenceName(ReferenceNames.Google.getReference());

        context.setFrontPage(new File("src/main/resources/front.jpg").getAbsolutePath());
        context.setBackPage(new  File("src/main/resources/back.jpg").getAbsolutePath());

        NewSubscriberCreationFloorDocument subscriber = new NewSubscriberCreationFloorDocument(context);
        subscriber.createNewSubscriber();
    }


}
