package com.gu.automation.core.webdriver

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.ie.InternetExplorerDriver
import org.openqa.selenium.remote.DesiredCapabilities

import com.gu.automation.core.ParentWebDriverFactory
import com.gu.automation.support.Config

object LocalWebDriverFactory extends ParentWebDriverFactory {

  def createDriver(capabilities: DesiredCapabilities): WebDriver = {
    browser match {
      case "firefox" => new FirefoxDriver(capabilities)
      case "chrome" => new ChromeDriver(capabilities)
      case "ie" => new InternetExplorerDriver(capabilities)
      case default => throw new RuntimeException(s"Browser: [$default] is not supported")
    }
  }

  def augmentCapabilities(testCaseName: String, capabilities: DesiredCapabilities, extraCapabilities: List[(String, String)]): DesiredCapabilities = {
    capabilities
  }

  def augmentDriver(driver: WebDriver): WebDriver = {
    driver
  }
}