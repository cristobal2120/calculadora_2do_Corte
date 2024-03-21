package com.example.calculator

import android.view.View
import android.view.ViewGroup
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.example.calculator.MainActivity
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers
import org.hamcrest.TypeSafeMatcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @Rule
    var mActivityScenarioRule = ActivityScenarioRule(
        MainActivity::class.java
    )

    @Test
    fun mainActivityTest() {
        val appCompatEditText = Espresso.onView(
            Matchers.allOf(
                ViewMatchers.withId(R.id.n1),
                childAtPosition(
                    childAtPosition(
                        ViewMatchers.withId(android.R.id.content),
                        0
                    ),
                    0
                ),
                ViewMatchers.isDisplayed()
            )
        )
        appCompatEditText.perform(ViewActions.replaceText("5"), ViewActions.closeSoftKeyboard())
        val appCompatEditText2 = Espresso.onView(
            Matchers.allOf(
                ViewMatchers.withId(R.id.n2),
                childAtPosition(
                    childAtPosition(
                        ViewMatchers.withId(android.R.id.content),
                        0
                    ),
                    1
                ),
                ViewMatchers.isDisplayed()
            )
        )
        appCompatEditText2.perform(ViewActions.replaceText("21"), ViewActions.closeSoftKeyboard())
        val appCompatEditText3 = Espresso.onView(
            Matchers.allOf(
                ViewMatchers.withId(R.id.n2), ViewMatchers.withText("21"),
                childAtPosition(
                    childAtPosition(
                        ViewMatchers.withId(android.R.id.content),
                        0
                    ),
                    1
                ),
                ViewMatchers.isDisplayed()
            )
        )
        appCompatEditText3.perform(ViewActions.pressImeActionButton())
        val appCompatEditText4 = Espresso.onView(
            Matchers.allOf(
                ViewMatchers.withId(R.id.n1), ViewMatchers.withText("5"),
                childAtPosition(
                    childAtPosition(
                        ViewMatchers.withId(android.R.id.content),
                        0
                    ),
                    0
                ),
                ViewMatchers.isDisplayed()
            )
        )
        appCompatEditText4.perform(ViewActions.pressImeActionButton())
        val materialButton = Espresso.onView(
            Matchers.allOf(
                ViewMatchers.withId(R.id.Suma), ViewMatchers.withText("Suma"),
                childAtPosition(
                    childAtPosition(
                        ViewMatchers.withId(android.R.id.content),
                        0
                    ),
                    7
                ),
                ViewMatchers.isDisplayed()
            )
        )
        materialButton.perform(ViewActions.click())
        val materialButton2 = Espresso.onView(
            Matchers.allOf(
                ViewMatchers.withId(R.id.Multi), ViewMatchers.withText("Multi"),
                childAtPosition(
                    childAtPosition(
                        ViewMatchers.withId(android.R.id.content),
                        0
                    ),
                    6
                ),
                ViewMatchers.isDisplayed()
            )
        )
        materialButton2.perform(ViewActions.click())
        val materialButton3 = Espresso.onView(
            Matchers.allOf(
                ViewMatchers.withId(R.id.Div), ViewMatchers.withText("Division"),
                childAtPosition(
                    childAtPosition(
                        ViewMatchers.withId(android.R.id.content),
                        0
                    ),
                    4
                ),
                ViewMatchers.isDisplayed()
            )
        )
        materialButton3.perform(ViewActions.click())
        val materialButton4 = Espresso.onView(
            Matchers.allOf(
                ViewMatchers.withId(R.id.Resta), ViewMatchers.withText("Resta"),
                childAtPosition(
                    childAtPosition(
                        ViewMatchers.withId(android.R.id.content),
                        0
                    ),
                    5
                ),
                ViewMatchers.isDisplayed()
            )
        )
        materialButton4.perform(ViewActions.click())
        val materialButton5 = Espresso.onView(
            Matchers.allOf(
                ViewMatchers.withId(R.id.Potencia), ViewMatchers.withText("Potencia"),
                childAtPosition(
                    childAtPosition(
                        ViewMatchers.withId(android.R.id.content),
                        0
                    ),
                    3
                ),
                ViewMatchers.isDisplayed()
            )
        )
        materialButton5.perform(ViewActions.click())
        val materialButton6 = Espresso.onView(
            Matchers.allOf(
                ViewMatchers.withId(R.id.MOP), ViewMatchers.withText("Ir a factorial"),
                childAtPosition(
                    childAtPosition(
                        ViewMatchers.withId(android.R.id.content),
                        0
                    ),
                    8
                ),
                ViewMatchers.isDisplayed()
            )
        )
        materialButton6.perform(ViewActions.click())
        val appCompatEditText5 = Espresso.onView(
            Matchers.allOf(
                ViewMatchers.withId(R.id.N3),
                childAtPosition(
                    childAtPosition(
                        ViewMatchers.withId(android.R.id.content),
                        0
                    ),
                    2
                ),
                ViewMatchers.isDisplayed()
            )
        )
        appCompatEditText5.perform(ViewActions.replaceText("5"), ViewActions.closeSoftKeyboard())
        val appCompatEditText6 = Espresso.onView(
            Matchers.allOf(
                ViewMatchers.withId(R.id.N3), ViewMatchers.withText("5"),
                childAtPosition(
                    childAtPosition(
                        ViewMatchers.withId(android.R.id.content),
                        0
                    ),
                    2
                ),
                ViewMatchers.isDisplayed()
            )
        )
        appCompatEditText6.perform(ViewActions.pressImeActionButton())
        val materialButton7 = Espresso.onView(
            Matchers.allOf(
                ViewMatchers.withId(R.id.Fac), ViewMatchers.withText("Factorial"),
                childAtPosition(
                    childAtPosition(
                        ViewMatchers.withId(android.R.id.content),
                        0
                    ),
                    1
                ),
                ViewMatchers.isDisplayed()
            )
        )
        materialButton7.perform(ViewActions.click())
        val materialButton8 = Espresso.onView(
            Matchers.allOf(
                ViewMatchers.withId(R.id.back), ViewMatchers.withText("Volver"),
                childAtPosition(
                    childAtPosition(
                        ViewMatchers.withId(android.R.id.content),
                        0
                    ),
                    4
                ),
                ViewMatchers.isDisplayed()
            )
        )
        materialButton8.perform(ViewActions.click())
    }

    companion object {
        private fun childAtPosition(
            parentMatcher: Matcher<View>, position: Int
        ): Matcher<View> {
            return object : TypeSafeMatcher<View>() {
                override fun describeTo(description: Description) {
                    description.appendText("Child at position $position in parent ")
                    parentMatcher.describeTo(description)
                }

                public override fun matchesSafely(view: View): Boolean {
                    val parent = view.parent
                    return parent is ViewGroup && parentMatcher.matches(parent) && view == parent.getChildAt(
                        position
                    )
                }
            }
        }
    }
}
