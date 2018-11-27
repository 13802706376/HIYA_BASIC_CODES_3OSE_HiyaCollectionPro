package com.hiya.se.collection;

public class CollectionClient
{
    public static void main(String[] args)
    {
        AbstractChainHandler chainHandler = new HiyaCollectionsOper();
        chainHandler
        .setNextHandler(new HiyaMapOper())
        .setNextHandler(new HiyaSetOper())
        .setNextHandler(new HiyaListOper());
        Student student = new Student("21","WADE");
        chainHandler.doHandle(student);
    }
}
