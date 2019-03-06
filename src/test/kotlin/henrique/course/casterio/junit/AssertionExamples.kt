package henrique.course.casterio.junit

import junit.framework.Assert.assertNotNull
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import java.util.stream.Stream

@DisplayName("This tests will cover the lesson of assertions")
class AssertionExamples {

    /* EQUALS */

    @DisplayName("Cards are equals ( card1.equals(card2) )")
    @Test
    fun cardsAreEquals() {
        val card1 = Card("1", "heart", "red")
        val card2 = Card("1", "heart", "red")
        Assertions.assertEquals(card1, card2)
    }

    @DisplayName("Cards are NOT equals ( !card1.equals(card2) )")
    @Test
    fun cardsAreNotEquals() {
        val card1 = Card("1", "heart", "red")
        val card2 = Card("1", "heart", "black")
        Assertions.assertNotEquals(card1, card2, "If the method fail you got this hint! :(")
    }


    /* SAME */

    @DisplayName("Cards are the same (card1 == card1)")
    @Test
    fun cardsAreTheSame() {
        val card1 = Card("1", "heart", "red")
        /*some process happen with this Card inside some context and
          we'd like to check if this object is still the same*/
        Assertions.assertSame(card1, card1)
    }

    @DisplayName("Cards are NOT the same (card1 != card2)")
    @Test
    fun cardsAreNotTheSame() {
        val card1 = Card("1", "heart", "red")
        val card2 = Card("1", "heart", "red")
        Assertions.assertNotSame(card1, card2)
    }


    /* BOOLEAN ASSERTIONS */

    @Test
    fun booleanConditionWithAssertEquals() {
        val expectedValue = 5
        val actualValue = 2

        Assertions.assertEquals(true, expectedValue > actualValue)
    }

    @Test
    fun booleanConditionWithAssertTrue() {
        val expectedValue = 5
        val actualValue = 2

        Assertions.assertTrue(expectedValue > actualValue)
    }

    /* NULLABILITY */

    @Test
    fun nullAssertions() {
        val str1 = "123"
        val str2 = "One"
        val str3 = "Hello World Of Tests!"

        Assertions.assertNotNull(str1.toIntOrNull())
        Assertions.assertNull(str2.toIntOrNull())
        Assertions.assertNull(str3.toIntOrNull())
    }

    /* EXCEPTIONS */

    @Test
    fun cannotDrawFromEmptyDeck() {
        val emptyDeck = Deck(emptyList())
        assertThrows<EmptyDeckException> {
            emptyDeck.draw()
        }
    }

    /*
    (IN THE CASE THAT THE EXPRESSION DOES NOT THROW AN EXCEPTION)
    @Test
    fun canDrawFromEmptyDeck() {
        val emptyDeck = Deck(emptyList())
        Assertions.assertDoesNotThrow {
            emptyDeck.draw()
        }
    }*/


    /* COMPOSABILITY OF ASSERTIONS */

    @Test
    fun multipleAssertionsTest() {
        val user = User(
            firstName = "Carlos",
            lastName = "Horbovyi",
            age = 21,
            postalAddress = listOf("Street BLA", "São Paulo - SP @ Brazil")
        )

        assertAll("user multiple assertions",
            { assertNotNull(user.firstName) },
            { assertNotNull(user.lastName) },
            {
                assertAll("Age tests",
                    { assertEquals(21, user.age) },
                    { assertTrue(user.isAdult()) }
                )
            },
            {
                assertAll("Address tests",
                    { assertEquals(2, user.postalAddress.size) },
                    { assertTrue(user.canReceiveMail()) }
                )
            }
        )


    }


}