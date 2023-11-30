package com.example.calculator

class Calculator {
    var num1 = 0
    var num2 = 0
    var result = 0

    constructor(_num1: Int, _num2: Int) {
        num1 = _num1
        num2 = _num2
    }
    fun addOperation(): Int {
        result = AddOperation(num1, num2)
        return result
    }

    fun subtractOperation(): Int {
        result = SubtractOpeation(num1, num2)
        return result
    }

    fun multiplyOperation(): Int {
        result = MultiplyOperation(num1, num2)
        return result
    }

    fun divideOperation(): Int {
        result = DivideOperation(num1, num2)
        return result
    }
}