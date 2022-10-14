import kotlin.math.pow

open class Point (_CoordX:Double, _CoordY:Double){
    var X:Double
    var Y:Double
    init{
        X = _CoordX
        Y = _CoordY
    }
    open fun InfoPrint(){
        println("Координаты точки: \n" +
        "X = $X\n" +
        "Y = $Y")
    }
}

class  ColoredPoint (_CoordX: Double, _CoordY: Double, _color: String) :Point (_CoordX,_CoordY){
    var color: String
    init {
        color = _color
    }

    override fun InfoPrint() {
        super.InfoPrint()
        println ("Цвет точки = $color")
    }
}

class Line(_PointOne:Point, _PointTwo: Point ){
    var pointOne:Point
    var pointTwo:Point
    val length :Double
    init {
        pointOne = _PointOne
        pointTwo = _PointTwo
        length = (Math.sqrt((pointTwo.X + pointOne.Y).pow(2) + (pointTwo.Y + pointOne.X).pow(2)))
    }
    open fun PrintInfo (){
        println("Первая точка\n ${pointOne.InfoPrint()} ")
         println("Вторая точка\n ${pointTwo.InfoPrint()}")
          println("Длина отрезка = $length")
    }

}

fun main(args: Array<String>) {

    var Point1: Point = Point(_CoordX = 3.0, _CoordY = 5.0)
    Point1.InfoPrint()

    var ColorPont:ColoredPoint = ColoredPoint(_CoordX = 4.0, _CoordY = 6.0, _color = "Черный")
    ColorPont.InfoPrint()

    var Line1:Line = Line(Point(_CoordX = 7.0, _CoordY = 2.0), Point(_CoordX = 3.0, _CoordY = 6.0 ))
    Line1.PrintInfo()
}
//Я немного не понял что мне нужно делать с полигоном, потому хочу после выздоровления узнать подробнее о целях класса полигон