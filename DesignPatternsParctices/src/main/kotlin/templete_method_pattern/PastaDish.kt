package templete_method_pattern

/**
 * This class acts as a template for subclasses
 * */
abstract class PastaDish {
//
//   protected fun makeRecipe() {
//        boilWater()
//        addPasta()
//        addSauce()
//        addProtein()
//    }

    abstract fun boilWater()
    abstract fun addPasta()
    abstract fun addSauce()
    abstract fun addProtein()

}