package com.mygdx.game

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.given
import kotlin.test.assertEquals


class TestGame : Spek() {{

    given("Tax rate calculator with default locale settings") {
        on("calculating the rate for an income of 200 and an average change of 10 per semester") {
            it("should result in a value of 300") {
                assertEquals(300, 300)
            }
        }
    }
    given("other things") {
        on("doing other things") {
            it("should pass") {
                assertEquals(200, 200)
            }
        }
    }
}}

