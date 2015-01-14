package MyBase;

interface IIterator
{
    public boolean hasNext();
    public Object next();
}

interface IContainer
{
    public IIterator createIterator();
}