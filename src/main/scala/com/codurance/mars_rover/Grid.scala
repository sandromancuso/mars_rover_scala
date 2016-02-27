package com.codurance.mars_rover

case class Grid(x: Int, y: Int) {

	def positionOfNextPoint(position: Position): Position =
		position match {
			case Position(px, py, North) => Position(px, moveNorth(py), North)
			case Position(px, py, East)  => Position(moveEast(px), py, East)
			case Position(px, py, South) => Position(px, moveSouth(py), South)
			case Position(px, py, West)  => Position(moveWest(px), py, West)
		}

	private def moveSouth(currentY: Int): Int =
		if (currentY == 0) y - 1 else currentY - 1;

	private def moveNorth(currentY: Int): Int =
		if (currentY == y - 1) 0 else currentY + 1;

	private def moveWest(currentX: Int): Int =
		if (currentX == 0) x - 1 else currentX - 1;

	private def moveEast(currentX: Int): Int =
		if (currentX == x - 1) 0 else currentX + 1;
}

