package com.Scala.project

import org.apache.spark
import org.apache.spark.sql.SparkSession

object interview_questions {

  def main(args:Array[String]): Unit ={
    val spark = SparkSession.builder().appName("sairajApp").master("local").getOrCreate()
    val listRdd = spark.sparkContext.parallelize(List(1,2,3,4,5,3,2))
    listRdd.fold(0)((acc,ele) => {acc + ele})
    val x = spark.read.option("header","true").csv("C:\\Users\\Aai\\OneDrive\\Desktop\\study\\spark-code-scala\\Emptable.csv")
    x.show()
    x.createOrReplaceTempView("emp") // 2nd commit
    spark.sql("select *from emp").show //2nd commit
  }

}
