private final AtomicInteger count = new AtomicInteger(0);

public void run() {
    count.incrementAndGet();
}
