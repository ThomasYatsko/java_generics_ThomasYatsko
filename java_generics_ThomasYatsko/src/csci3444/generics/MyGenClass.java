package csci3444.generics;

import csci3444.generics.MyGenInterface;

public class MyGenClass<K, V> implements MyGenInterface<K, V> 
{
	private K key;
	private V value;
	
	public MyGenClass(K _key, V _value)
	{
		key = _key;
		value = _value;
	}
	@Override
	public K getKey() 
	{
		return key;
	}

	@Override
	public V getValue() 
	{
		return value;
	}
	
	public static class MyClass {}

}
