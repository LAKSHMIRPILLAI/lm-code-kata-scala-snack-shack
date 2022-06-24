package com.techreturners

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class AppTest extends AnyFlatSpec with Matchers {

  "A snack shack app" should "take a list of order for a customer Id" in {
    val snackShackOrder = new SnackShack("A123", 1, "Sandwich")
    assert(snackShackOrder.customerId == "A123")
    assert(snackShackOrder.orderList == 1)
    assert(snackShackOrder.orderItem == "Sandwich")
  }
  "For snack shack app order preparation time for Sandwich" should "be 1 and customer service time must be 0.5" in {
    val snackShackOrder = new SnackShack("A123", 1, "Sandwich")
    assert(snackShackOrder.orderPreparationTime == 1.0)
    assert(snackShackOrder.customerServiceTime == 0.5)
  }
  "For snack shack app order the order status" should "be REJECT if waiting time is 6.0" in {
    val snackShackOrder = new SnackShack("A123", 1, "Sandwich")
    snackShackOrder.waitingTimeForOrder=6.0
    assert(snackShackOrder.orderStatus =="REJECT")
  }
  "For snack shack app order the order status" should "be ACCEPT if initial waiting time is zero " in {
    val snackShackOrder = new SnackShack("A123", 1, "Sandwich")
    snackShackOrder.OrderStatus("A123", 1, "Sandwich", 0.0)
    snackShackOrder.orderStatus should equal ("ACCEPT")
  }
  "For snack shack app order the order status" should "be REJECT if waiting time equal to 5.0" in {
    val snackShackOrder = new SnackShack("A123", 1, "Sandwich")
    snackShackOrder.OrderStatus("A123", 1, "Sandwich", 5.0)
    snackShackOrder.orderStatus should equal ("REJECT")
  }
  "For snack shack app order the order status" should "be REJECT if waiting time less than 5.0" in {
    val snackShackOrder = new SnackShack("A123", 1, "Sandwich")
    snackShackOrder.OrderStatus("A123", 1, "Sandwich", 4.5)
    snackShackOrder.orderStatus should equal ("REJECT")
  }
  "For snack shack app order the order status" should "be ACCEPT if waiting time equal 3.0" in {
    val snackShackOrder = new SnackShack("A123", 1, "Sandwich")
    snackShackOrder.OrderStatus("A123", 1, "Sandwich", 3.0)
    snackShackOrder.orderStatus should equal ("ACCEPT")
  }

}