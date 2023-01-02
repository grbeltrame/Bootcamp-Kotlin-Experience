//Faça um programa que receba

//Caso a média seja < 5 imprima "REP";
//Caso a média seja >= 5 e < 7 imprima "REC";
//Caso a média seja >7 imprima "APR".



fun main() {
   val media = readLine()!!.toDouble();
   
   when {
       media < 5 -> println("REP");
       5 <= media && media < 7 -> println("REC")
       media > 7 -> println("APR")
   }
}