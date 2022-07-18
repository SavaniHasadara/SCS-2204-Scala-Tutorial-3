object RunTime {
    def EasyPace(x:Int) : Int = {
    return x*8;
    }
    def Tempo(d:Int) : Int = {
    return d*7;
    }

    def main(args: Array[String]) = {
    println("Total Running Time:" + (EasyPace(2) + Tempo(3) + EasyPace(2)));
    }
 
}