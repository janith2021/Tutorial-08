
object Q1 extends App{
  var p1= Point(2,3)
  var p2= Point(4,5)
  println("Adition= "+p1.add(p2))
  println("Moving= "+p2.move(4,5))
  println("Distance= "+p1.distance(p2))
  println("Inverting= "+p1.invert())
}

case class Point(var a:Int,var b:Int) {

  def add(p:Point):Point={
    return Point(this.a+p.a, this.b+p.b)
  }
  def move(dx:Int,dy:Int):Point={
    this.a=this.a+dx
    this.b=this.b+dy
    return Point(this.a,this.b)
  }
  def distance(p:Point):Double ={
    var xVal=this.a-p.a
    var yVal=this.b-p.b
    var dis= xVal*xVal+yVal*yVal
    scala.math.sqrt(dis)
  }

  def invert(): Point ={
   var p1=this.a
   this.a=this.b
   this.b=p1
    return Point(this.a,this.b)
  }
}
