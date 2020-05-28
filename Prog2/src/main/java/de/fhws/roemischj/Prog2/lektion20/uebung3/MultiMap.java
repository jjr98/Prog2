package de.fhws.roemischj.Prog2.lektion20.uebung3;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MultiMap<K, V> implements Map<K, Set<V>>{
	public Map<K, Set<V>> multiMap = new HashMap<>();
	
	public Set<V> get(Object key) {
		return multiMap.get(key);
	}
	
	public Set<V> put(K key, V[] values) {
		Set<V> valueSet = new HashSet<>();
		for(V v : values)
			valueSet.add(v);
		return multiMap.put(key, valueSet);
	}

	@Override
	public int size() {
		return multiMap.size();
	}

	@Override
	public boolean isEmpty() {
		return multiMap.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {
		return multiMap.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return multiMap.containsValue(value);
	}

	@Override
	public Set<V> remove(Object key) {
		return multiMap.remove(key);
	}

	@Override
	public void putAll(Map<? extends K, ? extends Set<V>> m) {
		multiMap.putAll(m);
	}

	@Override
	public void clear() {
		multiMap.clear();
	}

	@Override
	public Set<K> keySet() {
		return multiMap.keySet();
	}

	@Override
	public Collection<Set<V>> values() {
		return multiMap.values();
	}

	@Override
	public Set<Entry<K, Set<V>>> entrySet() {
		return null;
	}

	@Override
	public Set<V> put(K key, Set<V> value) {
		return multiMap.put(key, value);
	}
}
