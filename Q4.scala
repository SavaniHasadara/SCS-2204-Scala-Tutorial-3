object Cost {
    def BookPrice(x:Int) : Double = {
    return x*24.95;
    }
    def Discount(d:Double) : Double = {
    return d*0.4;
    }
    def ShippingCost(x:Int) : Double = {
    return 3*x + (x - 50)*0.75;
    }

    def main(args: Array[String]) = {
    println("Wholesale Cost:" + (BookPrice(60) - Discount(BookPrice(60)) + ShippingCost(60)));
    }
 
}