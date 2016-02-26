package com.codurance.mars_rover

import com.codurance.mars_rover.Directions.directionFor

class MarsRover(initialPosition: Position) {

	var currentPosition = initialPosition;

	def execute(commands: String) =
	    commands.split("").foreach(cmd =>
			cmd match {
				case "M" => currentPosition = currentPosition.moveAhead()
				case "R" => currentPosition = currentPosition.turnRight()
				case "L" => currentPosition = currentPosition.turnLeft()
			})

	def position() = currentPosition;

}

case class Position(x: Int, y: Int, direction: Direction) {

	def moveAhead(): Position =
		direction match {
			case North => Position(x, y + 1, direction)
			case East => Position(x + 1, y, direction)
			case South => Position(x, y - 1, direction)
			case _ => this
		}

	def turnRight(): Position = Position(x, y, directionFor(direction.right).get)

	def turnLeft(): Position = Position(x, y, directionFor(direction.left).get)
}

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


