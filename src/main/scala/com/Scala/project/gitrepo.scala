package com.Scala.project

import org.apache.spark.sql.SparkSession

object gitrepo {
    def main(args:Array[String]): Unit ={
      val spark = SparkSession.builder().appName("sairajApp").master("local").getOrCreate()
      val data = spark.read.option("header","true").csv("C:\\Users\\Aai\\OneDrive\\Desktop\\study\\spark-code-scala\\Emptable.csv")
      data.show()
      println("changes from the git") //changed by git owner
  }

}
