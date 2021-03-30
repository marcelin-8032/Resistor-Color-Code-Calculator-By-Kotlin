package fr.resistor.color.code

import fr.resistor.color.code.Color.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RegisterColorTrioTest {

    @Test
    fun orangeorangeblack() = assertEquals("33 ohms", ResistorColorTrio.text(ORANGE, ORANGE, BLACK))

    @Test
    fun greenbrownorange() = assertEquals("51 kiloohms", ResistorColorTrio.text(GREEN, BROWN, ORANGE))

}