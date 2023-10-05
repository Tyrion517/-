//第一题：定义类，继承
//第二题：给主构造函数设置默认参数值，设置次构造函数

open class Animal(val age: Int,
                  val name: String,
                  val price: Int=100) {

    fun jump(){
        println("$name jumps!")
    }

    open fun bark() {
        println("$name barks!")
    }
}

class Dog(age: Int,
          name: String,
          price: Int=250,
          val likeBarking: Boolean=true): Animal(age, name, price)
{
    override fun bark() {
        println("Woff!")
    }


}
class Cat(age: Int,
          name: String,
          price: Int=300,
          val eatFish: Boolean=true,): Animal(age,name, price)
{
    constructor(name: String) : this(1,name)

    override fun bark() {
        println("Meow!")
    }

}


//第三题
fun oneYearOldAnimal(animals: List<Animal>): MutableList<Animal>{
    val temp = mutableListOf<Animal>()
    for (animal in animals){
        if (animal.age==1)
            temp+=animal
    }
    return temp
}

