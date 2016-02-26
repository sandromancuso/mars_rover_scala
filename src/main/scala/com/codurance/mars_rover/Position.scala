package com.codurance.mars_rover

import com.codurance.mars_rover.Directions._

case class Position(x: Int, y: Int, direction: Direction) {

	def turnRight(): Position = Position(x, y, directionFor(direction.right).get)

	def turnLeft(): Position = Position(x, y, directionFor(direction.left).get)
}
