package SparkPack

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import sys.process._
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.types._
import org.apache.spark.sql.Row
import java.io.File
import org.apache.spark.sql.functions._
import scala.io.Source

object Spark_Jag_Obj {
  
   def main(args:Array[String]):Unit={

			val conf = new SparkConf().setAppName("ES").setMaster("local[*]")
			val sc = new SparkContext(conf)
			sc.setLogLevel("ERROR")
			
			//Spark Session Initialization
			val spark = SparkSession.builder().getOrCreate()
			import spark.implicits._
			
			
}
   
}