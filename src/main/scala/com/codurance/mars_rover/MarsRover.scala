package com.codurance.mars_rover

class MarsRover(grid: Grid, initialPosition: Position) {

	var currentPosition = initialPosition;

	def execute(commands: String) =
	    commands.split("").foreach(cmd =>
			cmd match {
				case "M" => currentPosition = grid.positionOfNextPoint(currentPosition)
				case "R" => currentPosition = currentPosition.right()
				case "L" => currentPosition = currentPosition.left()
			})

	def position() = currentPosition;

}
