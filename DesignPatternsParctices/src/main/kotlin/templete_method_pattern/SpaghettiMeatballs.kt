package templete_method_pattern

class SpaghettiMeatballs : PastaDish() {
    override fun boilWater() {
        println("Water Boiled To SpaghettiMeatballs")
    }

    override fun addPasta() {
        println("Add spaghetti")
    }

    override fun addSauce() {
        println("Add tomato sauce")

    }

    override fun addProtein() {
        println("Add meatballs")

    }
}