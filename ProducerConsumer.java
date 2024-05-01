import java.lang.Thread.*;

class Q {
    int i;
    int maxSize;
    int producedCount = 0;
    boolean produced = false;

    Q(int maxSize) {
        this.maxSize = maxSize;
    }

    synchronized void produce(int x) {
        if (produced) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        i = x;
        produced = true;
        System.out.println("Produced " + i);
        producedCount++;
        notify();
    }

    synchronized int consume() {
        if (!produced) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed " + i);
        produced = false;
        notify();
        return i;
    }
}

class Producer extends Thread {
    Q q;
    int produceLimit;

    Producer(Q q, int produceLimit) {
        this.q = q;
        this.produceLimit = produceLimit;
    }

    public void run() {
        for (int i = 0; i < produceLimit; i++) {
            q.produce(i);
        }
    }
}

class Consumer extends Thread {
    Q q;
    int consumeLimit;

    Consumer(Q q, int consumeLimit) {
        this.q = q;
        this.consumeLimit = consumeLimit;
    }

    public void run() {
        for (int i = 0; i < consumeLimit; i++) {
            q.consume();
        }
    }
}

public class ProducerConsumer {
    public static void main(String args[]) {
        int maxSize = 10;
        int produceLimit = 10;
        int consumeLimit = 10;

        Q q = new Q(maxSize);
        Producer p = new Producer(q, produceLimit);
        Consumer c = new Consumer(q, consumeLimit);

        p.start();
        c.start();
    }
}
