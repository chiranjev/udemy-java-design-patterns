package com.chiranjev.patterns.singleton;
/*

Steps -
1. Declare the constructor of the class as private
2. Declare static method
3. Declare a static member of the same class type in the class

Further reading
1. educative design pattern singleton_Pattern

 */





// 5. Serialization, Deserialization and Singleton and override the clone method
// deserialization should return singleton object

public class DateUtil {

    private static DateUtil instance;

    private DateUtil(){

    }

    public static DateUtil getInstance(){
        if(instance==null){
            instance = new DateUtil();
        }
        return instance;
    }

    protected Object readResolve(){
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}

/*

// 4. improving multiple thread code

public class DateUtil {

    private static volatile DateUtil instance;

    private DateUtil(){

    }

    public static DateUtil getInstance(){
        if(instance == null){
            synchronized (DateUtil.class) {
                if (instance == null) {
                    instance = new DateUtil();
                }
            }
        }
        return instance;
    }

}

*/

/*

// 3. Handle multiple threads

public class DateUtil {

    private static DateUtil instance;

    private DateUtil(){

    }
    // synchronized keyword makes sure that this method will be accessed by one thread at a time
    public static synchronized DateUtil getInstance() {
        if (instance == null) {
            instance = new DateUtil();
        }
        return instance;
    }
}

*/

/*
// 2. Eager initialization - useful when we are sure that
// singleton object will be used at least once in our application

public class DateUtil {

//    private static DateUtil instance = new DateUtil();
    private static DateUtil instance;

    static { // static block is executed when class is loaded
        instance = new DateUtil();
    }

    private DateUtil(){

    }

    public static DateUtil getInstance(){
        return instance;
    }
}
*/

/*
// 1. Lazy initialization

public class DateUtil {

    private static DateUtil instance;

    private DateUtil(){

    }

    public static DateUtil getInstance(){
        if(instance==null){
            instance = new DateUtil();
        }
        return instance;
    }
}

 */