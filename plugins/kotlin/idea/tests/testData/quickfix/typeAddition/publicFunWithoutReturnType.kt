// "Specify return type explicitly" "true"
package a

class A() {
    public fun <caret>foo() = "a"
}
/* IGNORE_FIR */

// FUS_QUICKFIX_NAME: org.jetbrains.kotlin.idea.intentions.SpecifyTypeExplicitlyIntention