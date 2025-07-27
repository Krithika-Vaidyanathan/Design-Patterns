package org.krithika.BuilderPattern;

//Builder Interface
public interface Builder {
    void buildCPU();
    void buildRAM();
    void buildStorage();
    Computer getResult();
}
