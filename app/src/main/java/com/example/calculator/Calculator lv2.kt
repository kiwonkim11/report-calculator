package com.example.calculator

fun main() {
    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()
    var num = 0

    println("어떤 연산자를 사용하시겠습니까?")
    println("[1] 덧셈  [2] 뺄셈  [3] 곱셈  [4] 나눗셈")
    var operator = readLine()!!.toInt()

    if (operator == 1) {
        num = num1 + num2
        println("덧셈 결과 ${num} 입니다.")
    }

    else if (operator == 2) {
        num = num1 - num2
        println("뺄셈 결과 ${num} 입니다.")
    }

    else if (operator == 3) {
        num = num1 * num2
        println("곱셈 결과 ${num} 입니다.")
    }

    else if (operator == 4) {
        num = num1 / num2
        println("나눗셈 결과 ${num} 입니다.")
    }

    else {
        println("계산기를 실행할 수 없습니다.")
    }

    var i = 1
    while (i == 1) {
        println("계산기를 계속 사용하시겠습니까?")
        println("[1] 예  [2] 아니오")
        var continueCal = readLine()!!.toInt()

        if (continueCal == 1){
            var num3 = readLine()!!.toInt()
            println("어떤 연산자를 사용하시겠습니까?")
            println("[1] 덧셈  [2] 뺄셈  [3] 곱셈  [4] 나눗셈")
            var operator = readLine()!!.toInt()

            if (operator == 1) {
                num = num + num3
                println("덧셈 결과 ${num} 입니다.")
            }

            else if (operator == 2) {
                num = num - num3
                println("뺄셈 결과 ${num} 입니다.")
            }

            else if (operator == 3) {
                num = num * num3
                println("곱셈 결과 ${num} 입니다.")
            }

            else if (operator == 4) {
                num = num / num3
                println("나눗셈 결과 ${num} 입니다.")
            }

            else {
                println("계산기를 실행할 수 없습니다.")
                break
            }

        }
        else {
            i--
        }
    }

}