package com.example.calculator

class Calculator {
    fun addOperation (oper: AddOperation, num1: Int, num2: Int): Double {
        return oper.operate(num1, num2)
    }

    fun subOperation (oper: SubstractOpeation, num1: Int, num2: Int): Double {
        return oper.operate(num1, num2)
    }

    fun mulOperation (oper: MultiplyOperation, num1: Int, num2: Int): Double {
        return oper.operate(num1, num2)
    }

    fun divOperation (oper: DivideOperation, num1: Int, num2: Int): Double {
        return oper.operate(num1, num2)
    }
}