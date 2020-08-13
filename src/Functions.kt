fun main(){
    val user = setUser("Akbar Nugroho", 16,"Gaming")
    println(user)
}
fun setUser(name: String, age: Int, hobby: String) = "My name is $name, I like $hobby, and I'm $age years old"