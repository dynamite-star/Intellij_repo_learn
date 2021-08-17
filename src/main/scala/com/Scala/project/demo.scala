package com.Scala.project

class test() {
  test.instanceCnt += 1
}

object test {
  var instanceCnt = 0

  def printInstanceCnt {
    println(instanceCnt)
  }
}

abstract class polygon {
  def area: Double
}

object demo {
  def main(args: Array[String]): Unit = {

    var rect = new rectangle(52.1, 20.0)
    var tri = new trangle(42, 13)

    printArea(rect)
    printArea(tri)

    for (i <- 1 to 7) {
      new test()
    }
    test.printInstanceCnt
    println("*************************************")

    val nums = (1 to 10 by 2).toList
    for (i <- nums if i<7){
      println(i+" Hiii")
    }
    //nums.foreach(println)

  }


  def printArea(p: polygon): Unit = {
    println(p.area)
  }

}
