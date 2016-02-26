package com.codurance.mars_rover

import com.codurance.UnitSpec
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MarsRoverShould extends UnitSpec {

	"return existing position" in {
		val initialPosition = Position(0, 0, "N")

		val marsRover = new MarsRover(initialPosition)

		marsRover.position should be(initialPosition)
	}

}
