package com.codurance.mars_rover

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

case class Position(x: Int, y: Int, direction: String) {

	def moveAhead(): Position =
		direction match {
			case "N" => Position(x, y + 1, direction)
			case "E" => Position(x + 1, y, direction)
		}

	def turnRight(): Position = Position(x, y, "E")

	def turnLeft(): Position = Position(x, y, "W")
}
