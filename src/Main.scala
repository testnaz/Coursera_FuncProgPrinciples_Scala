class Main {



    val numbers = Array(1, 2, 3)
    val names = List("Ted", "David", "Someone")
    for (n <- numbers; name <- names) {
        println(n + " " + name)
    }
}
