object Q3{
def main(args: Array[String]):Unit={
print("Enter number 1= ")
val n1 = scala.io.StdIn.readDouble()
print("Enter number 2= ")
val n2 = scala.io.StdIn.readDouble()
val Mn = mean(n1,n2)
println(round(Mn))

   }

def mean(x:Double,y:Double):Double={
return (x+y)/2.00
 }

def round(number: Double): Double = {
 BigDecimal(number).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }
}