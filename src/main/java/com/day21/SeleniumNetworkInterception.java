package com.day21;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v145.fetch.Fetch;
import org.openqa.selenium.devtools.v145.fetch.model.RequestPattern;
import org.openqa.selenium.devtools.v145.fetch.model.RequestStage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumNetworkInterception {

	public static void main(String[] args) {

		WebDriver wd = new ChromeDriver();

		wd.manage().window().maximize();

		// Access to DevTools = Casting
		DevTools devTools = ((ChromeDriver) wd).getDevTools();
		devTools.createSession(); // Mandatory + Opens a WebSocket to Chrome

		devTools.send(Fetch.enable(
				Optional.of(List
						.of(new RequestPattern(Optional.of("*"), Optional.empty(), Optional.of(RequestStage.REQUEST)))),
				Optional.empty()));

		devTools.addListener(Fetch.requestPaused(), request -> {
			System.out.println("Intercepted");
			System.out.println(request.getRequest().getMethod());
			System.out.println(request.getRequest().getUrl());

			String url = request.getRequest().getUrl();

			if (url.contains("verify")) {
				System.out.println("Need To Mock this api Response");

				String jsonResponse = """

												{
						    "status": "SUCCESS",
						    "message": "Citizen registration verified successfully.",
						    "transaction_id": "MOCK QA MASTERY SAILESH",
						    "amount_deducted": "₹0.00 (~$1.00 USD)",
						    "username": "sailesh",
						    "timestamp": "2026-04-04T07:45:15.836Z"
						}

												""";
				
				String jsonresponseBase64 = Base64.getEncoder().encodeToString(jsonResponse.getBytes(StandardCharsets.UTF_8));

				devTools.send(Fetch.fulfillRequest(request.getRequestId(), 200, Optional.empty(), Optional.empty(),
						Optional.of(jsonresponseBase64), Optional.empty()));

			} else {
				devTools.send(Fetch.continueRequest(request.getRequestId(), Optional.empty(), Optional.empty(),
						Optional.empty(), Optional.empty(), Optional.empty()));
			}
		});

		wd.get("http://mock-api.techwithjatin.com/");

		WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(10));

		By userNameTextBoxLocator = By.id("username");
		WebElement userName = wait.until(ExpectedConditions.visibilityOfElementLocated(userNameTextBoxLocator));
		userName.sendKeys("sailesh");

		By passwordTextBoxLocator = By.id("password");
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordTextBoxLocator));
		password.sendKeys("pass");

		By registerButtonLocator = By.id("registerBtn");
		WebElement registerBtn = wait.until(ExpectedConditions.elementToBeClickable(registerButtonLocator));
		registerBtn.click();

		System.out.println("Register button Successfully Clicked");

	}

}
