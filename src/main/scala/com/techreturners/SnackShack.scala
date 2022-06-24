package com.techreturners

class SnackShack(customer:String,order:Int,item:String) {
  val orderList:Int=order
  val customerId:String=customer
  val orderItem:String=item
  val orderPreparationTime:Double=1.0
  val customerServiceTime: Double = 0.5
  var waitingTimeForOrder:Double=0.0

  val orderStatus:String = OrderStatus(customerId, orderList, orderItem,waitingTimeForOrder)
  val waitTime:Double= WaitTime(customerId, orderList, orderItem,waitingTimeForOrder)

  def OrderStatus(customerId:String,order:Int,item:String,waitTime:Double): String ={
    var status :String="REJECT"
    val waitingTimeNew:Double =waitTime+(order*orderPreparationTime)+customerServiceTime
    Console.println(waitTime)
    Console.println(waitingTimeNew)
    if (waitingTimeNew<=5.0)status="ACCEPT"
    else if (waitingTimeNew>5.0){status="REJECT"}
    status
  }
  def WaitTime(customerId:String,order:Int,item:String,waitTime:Double): Double ={
    var status :String="REJECT"
    var orderWaitTime:Double=waitTime
    val waitingTimeNew:Double =waitTime+(order*orderPreparationTime)+customerServiceTime
    if ((waitingTimeNew<=5.0) && (waitingTimeNew>=0.0)) {
      status="ACCEPT"
      orderWaitTime=waitingTimeNew
    }
    else{
      status="REJECT"
      orderWaitTime=waitTime
    }
    orderWaitTime
  }

}
