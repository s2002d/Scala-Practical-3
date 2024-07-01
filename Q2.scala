object Q2 {

 def main(args: Array[String]): Unit = {
    print("Enter strings: ")
    val Str = scala.io.StdIn.readLine()
    val strArr = Str.split(" ")

    val filArr = nArr(strArr)
    
    println("Strings length than 5 characters:")
    filArr.foreach(println)
  }

  def nArr(str: Array[String]): Array[String] = {
  str.filter(_.length > 5)

}
 
}
