object Q1{
def main(args:Array[String]):Unit={
print("Enter Strings= " )
val arr = scala.io.StdIn.readLine()
val rs = reverse(arr)
println(rs)
}
  }
def reverse(str:String):String={
if(str.Empty)
{" "}
else
{reverse(str.tail}+str.head}

 }