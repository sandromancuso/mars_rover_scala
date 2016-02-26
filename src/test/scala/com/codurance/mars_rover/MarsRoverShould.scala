package com.codurance.mars_rover

import com.codurance.UnitSpec
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MarsRoverShould extends UnitSpec {

	val INITIAL_POSITION = Position(0, 0, North)

	trait context {
		val marsRover = new MarsRover(INITIAL_POSITION)
	}

	"return existing position" in new context {
		marsRover.position should be(INITIAL_POSITION)
	}

	"move one point in the same direction" in new context {
		marsRover execute("M")

		marsRover.position should be(Position(0, 1, North))
	}

	"move a few points in the same direction" in new context {
		marsRover execute("MMM")

		marsRover.position should be(Position(0, 3, North))
	}

	"turn right" in new context {
		marsRover execute("R")

		marsRover.position should be(Position(0, 0, East))
	}

	"turn right and move one point" in new context {
		marsRover execute("RM")

		marsRover.position should be(Position(1, 0, East))
	}

	"turn left" in new context {
		marsRover execute("L")

		marsRover.position should be(Position(0, 0, West))
	}

	"turn right twice" in new context {
		marsRover execute("RR")

		marsRover.position should be(Position(0, 0, South))
	}

	"turn left and right a few times" in new context {
		marsRover execute("LLLRR")

		marsRover.position should be(Position(0, 0, West))
	}
}
