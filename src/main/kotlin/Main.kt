
fun main() {

   try{
       val n1 : Int = readLine() !!.toInt()
       val n3 = 100 /n1
       println("result : ${n3}")
   }
   catch (ex:Exception){
       println(ex.message.toString())
   }
    println("app is done")
}