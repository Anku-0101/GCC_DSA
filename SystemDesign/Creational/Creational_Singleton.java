/*
    Creational design pattern 
    1. singleton 
    2. prototype 
*/

/*
    1. Singleton Design pattern 
    When we need only one instance for a class, we use singleton pattern
    1. What happens when we have multithreaded environment? -> can create more than one instance
    2. What happens if we serialize this class? -> can create an instance while deserializing{override readResolve method and return the singleton object} 
    3. What happens when we clone this class? -> throw not implemented exception
    4. What happens if we use reflection to create the object? Add check in private constructor
*/


// For reflection to not create a new instance
private singleton()
{
    if(singletonObject != null)
    {
        throw new ILLegalStateException("Object already created");
    }
}


// ////////////////////////

class Singleton implements Cloneable, Serializable {
    private volatile static Singleton singletonObject;
    private Singleton() {
        if(singletonObject!= null)
            throw new IllegalStateException("Object already created");
    }
    public static Singleton getInstance() {
        if(singletonObject == null) {
            synchronized(Singleton.class){
                if(singletonObject == null) {
                    singletonObject = new Singleton();
                }
            }
        }
        return singletonObject;
    }
    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
    protected Object readResolve(){
        return singletonObject;
    }
    public void doSomeWork(){
        // do some work
    }
}