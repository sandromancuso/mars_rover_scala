package com.codurance.mars_rover

class MarsRover(initalPosition: Position) {

	def position() = initalPosition;

}

case class Position(x: Int, y: Int, direction: String)
