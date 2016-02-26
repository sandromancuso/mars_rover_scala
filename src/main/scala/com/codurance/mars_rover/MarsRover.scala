package com.codurance.mars_rover

class MarsRover(initialPosition: Position) {

	var currentPosition = initialPosition;

	def execute(commands: String) =
		currentPosition = currentPosition.moveAhead()

	def position() = currentPosition;

}

case class Position(x: Int, y: Int, direction: String) {
	def moveAhead(): Position = Position(x, y + 1, direction)
}
