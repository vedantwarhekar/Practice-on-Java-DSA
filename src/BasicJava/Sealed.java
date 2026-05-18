package BasicJava;
final class Dog extends Sealed{
}
final class Cat extends  Sealed{
}
public sealed class Sealed permits  Dog, Cat {
}
