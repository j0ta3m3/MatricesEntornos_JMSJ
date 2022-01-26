import javax.swing.JOptionPane

fun main(args: Array<String>) {
    vectores()
}

var c1 = 5
var c2 = 4

fun vectores() {
    var numeroPosiciones = JOptionPane.showInputDialog("Ingresa el número de posiciones del Array1 ").toInt()
    var V1 = arrayOfNulls<Int>(numeroPosiciones)
    for (i in V1.indices) {
        V1[i] = 2 * i + c1
    }

    var numeroPosiciones2 = JOptionPane.showInputDialog("Ingresa el numero de posiciones del Array2 ").toInt()
    var V2 = arrayOfNulls<Int>(numeroPosiciones2)
    for (i in V2.indices) {
        V2[i] = 2 * i + c2
    }

    var V3 = arrayOf(V1, V2)
    for (i in V3.indices) {
        println(V3[i].contentToString())
    }
}
