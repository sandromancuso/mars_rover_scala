package com.codurance.mars_rover

import com.codurance.mars_rover.Directions.directionFor

class MarsRover(grid: Grid, initialPosition: Position) {

	var currentPosition = initialPosition;

	def execute(commands: String) =
	    commands.split("").foreach(cmd =>
			cmd match {
				case "M" => currentPosition = currentPosition.moveAhead(grid)
				case "R" => currentPosition = currentPosition.turnRight()
				case "L" => currentPosition = currentPosition.turnLeft()
			})

	def position() = currentPosition;

}

case class Position(x: Int, y: Int, direction: Direction) {

	def moveAhead(grid: Grid): Position =
		direction match {
			case North => Position(x, grid.moveNorth(y), direction)
			case East  => Position(grid.moveEast(x), y, direction)
			case South => Position(x, grid.moveSouth(y), direction)
			case West  => Position(grid.moveWest(x), y, direction)
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

case class Grid(x: Int, y: Int) {

	def moveSouth(currentY: Int): Int =
		if (currentY == 0) y - 1 else currentY - 1;

	def moveNorth(currentY: Int): Int =
		if (currentY == y - 1) 0 else currentY + 1;

	def moveWest(currentX: Int): Int =
		if (currentX == 0) x - 1 else currentX - 1;

	def moveEast(currentX: Int): Int =
		if (currentX == x - 1) 0 else currentX + 1;
}

