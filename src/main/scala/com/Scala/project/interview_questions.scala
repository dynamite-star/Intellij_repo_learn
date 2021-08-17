package com.Scala.project

object interview_questions {

  def main(args:Array[String]): Unit ={
    val listRdd = spark.sparkContext.parallelize(List(1,2,3,4,5,3,2))
    listRdd.fold(0)((acc,ele) => {acc + ele})
    val x = spark.read.option("header","true").csv("C:\\Users\\Aai\\OneDrive\\Desktop\\study\\spark-code-scala\\Emptable.csv")
    x.show()
  }

}
