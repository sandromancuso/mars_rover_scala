package com.codurance.mars_rover

import com.codurance.UnitSpec
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MarsRoverShould extends UnitSpec {

	val INITIAL_POSITION = Position(0, 0, "N")

	trait context {
		val marsRover = new MarsRover(INITIAL_POSITION)
	}

	"return existing position" in new context {
		marsRover.position should be(INITIAL_POSITION)
	}

	"move one point in the same direction" in new context {
		marsRover execute("M")

		marsRover.position should be(Position(0, 1, "N"))
	}

	"move a few points in the same direction" in new context {
		marsRover execute("MMM")

		marsRover.position should be(Position(0, 3, "N"))
	}
}
