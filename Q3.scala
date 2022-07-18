object Volume {
    def DiscVolume(r:Double) : Double = {
    return 4.0/3.0*Math.PI*r*r*r;
    }
    def main(args: Array[String]) = {
    println(DiscVolume(5));
    }
 
}