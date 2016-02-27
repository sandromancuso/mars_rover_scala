package com.codurance.mars_rover

import com.codurance.mars_rover.Directions._

case class Position(x: Int, y: Int, direction: Direction) {

	def right(): Position = Position(x, y, directionFor(direction.right).get)

	def left(): Position = Position(x, y, directionFor(direction.left).get)
}
