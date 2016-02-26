package com.codurance.mars_rover

import com.codurance.UnitSpec
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MarsRoverShould extends UnitSpec {

	val INITIAL_POSITION = Position(0, 0, "N")

	"return existing position" in {
		val marsRover = new MarsRover(INITIAL_POSITION)

		marsRover.position should be(INITIAL_POSITION)
	}

	"move ahead" in {
		val marsRover = new MarsRover(INITIAL_POSITION)

		marsRover execute("M")

		marsRover.position should be(Position(0, 1, "N"))
	}

}
