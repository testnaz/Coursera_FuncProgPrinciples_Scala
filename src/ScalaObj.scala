/*
 * Copyright (c) 2002-2016 EMC Corporation All Rights Reserved
 */
object ScalaObj {

            //val main = Main;
    def main(args: Array[String]): Unit = {
        val numbers = Array(1, 2, 3)
        val names = List("Ted", "David", "Someone")
        for (n <- numbers; name <- names) {
            println(n + " " + name)
        }
    }
}
