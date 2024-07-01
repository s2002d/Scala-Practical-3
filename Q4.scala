object Q4{

def main(args: Array[String]):Unit={
println("Enter numbers :")
val input = scala.io.StdIn.readLine()
val lis = input.split(" ").map(_.toInt).toList

var ev = lis.filter(even)
var sum : Int = 0;
ev.foreach(sum +=  _ );
print("Sum of even= ")
println(sum)

}

def even(x:Double):Boolean={
if(x%2 == 0)
{return true}
else
{return false}
}


  }