package fr.resistor.color.code

object ResistorColorTrio {

    fun resistorValue(vararg input: Color): Int {
        val (c1, c2, c3) = input
        var value = 10 * c1.ordinal + c2.ordinal
        repeat(times = c3.ordinal) {
            value *= 10
        }
        return value
    }


    fun text(vararg input: Color): String {

        var valueOfColors = resistorValue(*input)
        var magnitude = 0

        while (valueOfColors % 1000 == 0) {
            valueOfColors /= 1000
            magnitude++
        }

        val unitofResistance = Unit.values()[magnitude].name.toLowerCase()

        return "$valueOfColors $unitofResistance"

    }


    @JvmStatic
    fun main(args: Array<String>) {
        print("Resistor value : " + text(Color.ORANGE, Color.ORANGE, Color.RED))

        print("Resistor value :" + text(Color.ORANGE, Color.ORANGE, Color.BLACK))

        print("Resistor value :" + text(Color.GREY, Color.ORANGE, Color.VIOLET))


    }


}