package org.krithika.CommandDesignPattern;

//Step1: Command interface
//This interface sets a contract for concrete command classes, defining execute() method that encapsulates the operation to be performed.
public interface Command {
    void execute();
}
