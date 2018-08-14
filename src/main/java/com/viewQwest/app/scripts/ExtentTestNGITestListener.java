package com.viewQwest.app.scripts;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ExtentTestNGITestListener extends StartDriver implements ITestListener {
    public static ExtentReports extent = ExtentManager.createInstance("target/extent.html");
    private static ThreadLocal parentTest = new ThreadLocal();
//    private static ThreadLocal test = new ThreadLocal();
    public static ExtentTest logger;

    Calendar calendar = Calendar.getInstance();
    private SimpleDateFormat formatter = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");

    @Override
    public synchronized void onStart(ITestContext context) {
//        ExtentTest parent = extent.createTest(getClass().getName());
//        parentTest.set(parent);
    }

    @Override
    public synchronized void onFinish(ITestContext context) {
        extent.flush();
    }

    @Override
    public synchronized void onTestStart(ITestResult result) {
//        logger = extent.createTest(this.getClass().getName(), "Sample description goes here");
//        ExtentTest child = parentTest.get().createTest(result.getMethod().getMethodName());
//        extent.set(child);
    }

    @Override
    public synchronized void onTestSuccess(ITestResult result) {
        logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is passTest", ExtentColor.GREEN));
    }

    @Override
    public synchronized void onTestFailure(ITestResult result) {
        logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case failed", ExtentColor.RED));

        String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath() + "/target";
        File destFile = new File(reportDirectory + "/failure_screenshots/" + formatter.format(calendar.getTime()) + ".png");
        File scrFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, destFile);
//            logger.addScreenCaptureFromPath(destFile.getAbsolutePath());
            logger.addScreenCaptureFromPath("failure_screenshots/"+destFile.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
//        Reporter.log("<a href='" + destFile.getAbsolutePath() + "'> <img src='" + destFile.getAbsolutePath() + "' height='100' width='100'/> </a>");
    }

    @Override
    public synchronized void onTestSkipped(ITestResult result) {
        logger.skip(result.getThrowable());
    }

    @Override
    public synchronized void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }
}

class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null)
            createInstance("test-output/extent.html");

        return extent;
    }

    public static ExtentReports createInstance(String fileName) {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setDocumentTitle(fileName);
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName(fileName);

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        return extent;
    }
}