package OOP.Them2_17.TestThread2;

/**
 * Created by Yuriy on 21.03.2017.
 */
public class MySumCount extends Thread {
    int startIndex;
    int stopIndex;

    public int getStartIndex() {return startIndex;}
    public void setStartIndex(int startIndex) {this.startIndex = startIndex;}
    public int getStopIndex() {return stopIndex;}
    public void setStopIndex(int stopIndex) {this.stopIndex = stopIndex;}
    int[] arr;
    public void setArr(int[] arr) {this.arr = arr;}
    long resultSum;
    public long getResultSum() {return resultSum;}

    @Override
    public void run() {
        if (arr == null || startIndex < 0 || stopIndex > arr.length) return;
        for (int i = startIndex; i < stopIndex; i++) {
            resultSum += arr[i];
        }
    }
}


