package com.example.calculator

fun main() {
    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()
    var carl = Calculator()

    println("어떤 연산자를 사용하시겠습니까?")
    println("[1] 덧셈  [2] 뺄셈  [3] 곱셈  [4] 나눗셈")
    var operator = readLine()!!.toInt()

    if (operator == 1) {
        carl.addOperation()
    }

    else if (operator == 2) {
        carl.subtractOperation()
        println("뺄셈 결과 ${carl.subtractOperation(SubtractOpeation(), num1, num2)} 입니다.")
    }

    else if (operator == 3) {
        carl.multiplyOperation()
        println("곱셈 결과 ${carl.multiplyOperation(MultiplyOperation(), num1, num2)} 입니다.")
    }

    else if (operator == 4) {
        carl.divideOperation()
        println("나눗셈 결과 ${carl.divideOperation(DivideOperation(), num1, num2)} 입니다.")
    }

    else {
        println("계산기를 실행할 수 없습니다.")
    }

}
