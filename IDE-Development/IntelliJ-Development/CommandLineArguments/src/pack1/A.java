package pack1;

import java.util.Arrays;

class A
{
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(args));
    }
}

//commandline arguments
//if you are printing the reference you will get object's memory location like classname@hascode in the form of hexadecimal
//At the time of running a program, we can pass some arguments to the program, that is what we can call command line arguments.
//while running a program even JVM also supply a default empty String array object as an argument to the main method of a class.
//we can supply some command line arguments and that would be converted into String object.