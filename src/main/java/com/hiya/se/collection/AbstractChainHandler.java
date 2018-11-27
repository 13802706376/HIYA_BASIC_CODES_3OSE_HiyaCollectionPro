package com.hiya.se.collection;

public abstract class AbstractChainHandler implements IChain
{
    private AbstractChainHandler nextHandler;

    public AbstractChainHandler setNextHandler(AbstractChainHandler nextHandler)
    {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    @Override
    public void doHandle(Student student)
    {
        if(null== student.getId() )
        {
            throw new RuntimeException("Threshold is empty.");
        }
        System.out.println("AbstractChainHandler>>doHandle>>" + student.toString());
        doBudiness(student);
        if(null != nextHandler)
        {
            nextHandler.doHandle(student);
        }
    }
    
    abstract void doBudiness(Student student);
}
