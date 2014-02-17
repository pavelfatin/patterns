trait Animal
class Dog private extends Animal
class Cat private extends Animal

object Animal {
  def apply(kind: String) = kind match {
    case "dog" => new Dog()
    case "cat" => new Cat()
  }
}

Animal("dog")
