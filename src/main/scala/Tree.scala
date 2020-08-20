import scala.collection.IterableOnce.iterableOnceExtensionMethods

object Tree extends App {

 var treeHeight = 3

if (!args.isEmpty) {
 println(s"We got ${args.length} argument")
 treeHeight = args(0).toInt
} else
 println("We got nothing well we will use the default value")

for (i <- 1 to treeHeight*2 by 2)
 println(" "*((treeHeight*2-i)/2) + "*"*(i+0))

}