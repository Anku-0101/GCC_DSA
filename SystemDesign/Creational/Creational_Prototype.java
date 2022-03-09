/*
    Why do we need prototype pattern?
    1. object creation is slow and resource consuming and most often we need a bunch of similar objects
    2. Client doesn't want to be bothered about object creation, even does not want to know the type of object created

    What does prototype pattern do?
    1. Saves client from creating similar object over and over again 
    2. Saves resources when you have to create many similar object
    3. 1st object is created normally and then rest are cloned
*/