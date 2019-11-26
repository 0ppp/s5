object slip5
{
    def main(args:Array[String])
    {
        val a=Set("hello","where","will","when","your")
        val b=Set("hello","fine","okay","are","you")
        println(a)
        println(b)
       var c=a.intersect(b)
       println("common elements in given set : "+c)
       var lm=a.filterNot(b.contains(_))
       var km=b.filterNot(a.contains(_))
       println("after merging both set:"+(lm++km))
           
    }
}