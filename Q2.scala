object Temperature {
    def Fahrenheit(celsius:Double) : Double = {
    return celsius * 1.8000 + 32.00;
    }
    def main(args: Array[String]) = {
    println(Fahrenheit(35));
    }
}