package com.mccorby.machinelearning.nlp

import org.junit.Test

class MathOpsTest {

    @Test
    fun `Given a map with characters and scores when charmax is invoked it returns the character with the highest score`() {
        val candidates = mapOf(
            'A' to 0.4f,
            'b' to 0.1f,
            'c' to 0.33f,
            'e' to 0.5f,
            'd' to 0.6f
        )

        val expected = 'd'

        // When
        val result = charMax(candidates)

        // Then
        assert(expected == result)
    }
}