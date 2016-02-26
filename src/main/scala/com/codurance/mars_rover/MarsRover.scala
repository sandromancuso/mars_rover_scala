package com.codurance.mars_rover

class MarsRover(grid: Grid, initialPosition: Position) {

	var currentPosition = initialPosition;

	def execute(commands: String) =
	    commands.split("").foreach(cmd =>
			cmd match {
				case "M" => currentPosition = grid.moveOnePoint(currentPosition)
				case "R" => currentPosition = currentPosition.turnRight()
				case "L" => currentPosition = currentPosition.turnLeft()
			})

	def position() = currentPosition;

}
