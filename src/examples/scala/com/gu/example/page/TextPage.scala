package com.gu.example.page

import org.openqa.selenium.By._
import org.openqa.selenium.WebElement

/**
 * Created by jduffell on 13/07/2014.
 */
case class TextPage(root: WebElement) {
  private def heading = root findElement name("heading")
}

