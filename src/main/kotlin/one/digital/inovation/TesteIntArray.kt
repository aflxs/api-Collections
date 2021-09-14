package one.digital.inovation

fun main () {//inicialização
    val values = IntArray(5)
    values[0]=1
    values[1]=7
    values[2]=6
    values[3]=3
    values[4]=2

    for (valor in values) {
        println(valor)
    }
    println("-----------")
    values.forEach {valor->
        println(valor)
    }
    println("---------")
    for (index in values.indices) {
        println(values[index])
    }

    println("---------")//sort ordena do menor para o maior
    values.sort()
    for (valor in values) {
        println(valor)
    }
}