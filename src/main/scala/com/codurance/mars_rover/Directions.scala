package com.codurance.mars_rover

sealed abstract class Direction(currentDirection: String,
                                rightDirection: String,
                                leftDirection: String) {

	def current() = currentDirection

	def right() = rightDirection

	def left() = leftDirection
}

case object North extends Direction("N", "E", "W")
case object South extends Direction("S", "W", "E")
case object East extends Direction("E", "S", "N")
case object West extends Direction("W", "N", "S")

object Directions {

	val directions: List[Direction] = List(North, South, East, West)

	def directionFor(symbol: String) =
		directions.find(d => d.current == symbol)

}
