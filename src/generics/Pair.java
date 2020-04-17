package generics;

/**
 * description:
 * @author :刘俊新(junxin.liu@ucarinc.com)
 * @Date :2020-02-26 16:03:05
 * @Version: V1.0
 */

public class Pair<T> {
    private T first;
    private T second;

    public Pair() { first = null; second = null; }
    public Pair(T first, T second) { this.first = first;  this.second = second; }

    public T getFirst() { return first; }
    public T getSecond() { return second; }

    public void setFirst(T newValue) { first = newValue; }
    public void setSecond(T newValue) { second = newValue; }
}
