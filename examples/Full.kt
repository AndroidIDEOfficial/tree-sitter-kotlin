// Variables
val number: Int = 10
var message: String = "Hello"

// Functions
fun greet(name: String) {
    println("Hello, $name!")
}

// Control flow statements
fun checkNumber(number: Int) {
    if (number % 2 == 0) {
        println("$number is even")
    } else {
        println("$number is odd")
    }
}

// Classes and inheritance
open class Animal(val name: String) {
  	val v : String = ""
    open fun makeSound() {
        println("Animal making sound")
    }
}

class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("Woof!")
    }
}

// Interfaces
interface Shape {
    fun area(): Double
}

class Circle(val radius: Double) : Shape {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

// Lambdas
val numbers = listOf(1, 2, 3, 4, 5)
val doubled = numbers.map { it * 2 }

// Class K with fields and method
class K internal constructor(val f1: String, val f2: String) {
  	constructor(some: String): super(some)
    init {
    	
    }
    
    companion object {
    	const val CONST = ""
    }
    
    fun M() {
        f1.apply {
            println("f1 = $this")
            println("f2 = ${this@K.f2.f2}")
        }
    }
}

fun main() {
    // Function calls and operations
    greet("John")
    checkNumber(17)
    
    // Object creation and method call
    val dog = Dog("Buddy")
    dog.makeSound()
    
    // Interface implementation
    val circle = Circle(5.0)
    val area = circle.area()
    println("Circle area: $area")

    // Lambdas
    println("Doubled numbers: $doubled")
    
    // Operators
    val a = 10
    val b = 5
    
    // Arithmetic operators
    val addition = a + b
    val subtraction = a - b
    val multiplication = a * b
    val division = a / b
    val modulus = a % b
    
    println("Addition: $addition")
    println("Subtraction: $subtraction")
    println("Multiplication: $multiplication")
    println("Division: $division")
    println("Modulus: $modulus")
    
    // Assignment operators
    var value = 10
    value += 5
    value -= 3
    value *= 2
    value /= 4
    value %= 3
    
    println("Value: $value")
    
    // Comparison operators
    val x = 5
    val y = 7
    
    val equalTo = x == y
    val notEqualTo = x != y
    val greaterThan = x > y
    val lessThan = x < y
    val greaterThanOrEqualTo = x >= y
    val lessThanOrEqualTo = x <= y
    
    println("Equal To: $equalTo")
    println("Not Equal To: $notEqualTo")
    println("Greater Than: $greaterThan")
    println("Less Than: $lessThan")
    println("Greater Than or Equal To: $greaterThanOrEqualTo")
    println("Less Than or Equal To: $lessThanOrEqualTo")
    
    // Logical operators
    val p = true
    val q = false
    
    val andResult = p && q
    val orResult = p || q
    val notResult = !p
    
    println("AND Result: $andResult")
    println("OR Result: $orResult")
    println("NOT Result: $notResult")
    
    // Hard operators and special symbols
    val range = 1..10
    val elvisOperator = number ?: 0
    val safeCallOperator = message?.length
    val nullabilityOperator = message!!
    val stringTemplate = "The value of message is ${message.toUpperCase()}"
    
    println("Range: $range")
    println("Elvis Operator: $elvisOperator")
    println("Safe Call Operator: $safeCallOperator")
    println("Nullability Operator: $nullabilityOperator")
    println("String Template: $stringTemplate")
    
    // Qualified symbols
    val currentInstance = this
    println("Current Instance: $currentInstance")
    
    // Labeled control loops
    outer@ for (i in 1..3) {
        inner@ for (j in 1..3) {
            if (j == 2) {
                println("Breaking inner loop")
                break@inner
            }
            println("i = $i, j = $j")
        }
    }
    
    // Class K instance and method call
    val k = K("Field 1", "Field 2")
    k.M()
}
