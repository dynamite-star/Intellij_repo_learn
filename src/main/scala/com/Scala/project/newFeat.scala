package com.Scala.project

import org.apache.spark.sql.SparkSession

object newFeat {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("sairajApp").master("local").getOrCreate()
    val raw = spark.sparkContext.parallelize(List(1, 2, 4, 6, 2, 3, 5, 4, 45, 20))
    import spark.sqlContext.implicits._
    raw.toDF("item_id").show()
  }

}
