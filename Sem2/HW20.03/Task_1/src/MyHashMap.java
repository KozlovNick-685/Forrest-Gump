public class MyHashMap<K, V> implements MyMap<K, V> {

    private Node<K, V>[] buckets;
    private int size;
    protected static final int CAPACITY =  16;

    public MyHashMap(){
        buckets = (Node<K, V>[]) new Node[CAPACITY];
        size = 0;
    }

    @Override
    public V put(K key, V value) {
        if (size >= buckets.length) {
            resize();
        }
        int index = getBucketIndex(key);
        Node<K, V> current = buckets[index];
        while (current != null) {
            if (current.key.equals(key)) {
                V oldValue = current.value;
                current.value = value;
                return oldValue;
            }
            current = current.next;
        }
        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;
        return null;
    }

    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode() % buckets.length);
    }

    @Override
    public V get(Object key) {
        int index = getBucketIndex((K) key);
        Node<K, V> current = buckets[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public V remove(Object key) {
        int index = getBucketIndex((K) key);
        Node<K, V> current = buckets[index];
        if (current.key.equals(key)) {
            V removeValue = current.value;
            buckets[index] = current.next;
            size--;
            return removeValue;
        }
        while (current.next != null) {
            if (current.next.key.equals(key)) {
                V removeValue = current.next.value;
                current.next = current.next.next;
                size--;
                return  removeValue;
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public boolean containsKey(Object key) {
        int index = getBucketIndex((K) key);
        Node<K, V> current = buckets[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (int i = 0; i < buckets.length; i++) {
            Node<K, V> current = buckets[i];
            while (current != null) {
                if (current.value.equals(value)) {
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = null;
            size = 0;
        }

    }

    private void resize() {
        Node<K, V>[] oldBuckets = buckets;
        int newCapacity = oldBuckets.length * 2;
        buckets = (Node<K, V>[]) new Node[newCapacity];
        for (Node<K, V> oldBucket : oldBuckets) {
            while (oldBucket != null) {
                K key = oldBucket.key;
                V value = oldBucket.value;
                int newIndex = getBucketIndex(key);
                Node<K, V> newNode = new Node<>(key, value);
                newNode.next = buckets[newIndex];
                buckets[newIndex] = newNode;
                oldBucket = oldBucket.next;
            }
        }
    }
}
