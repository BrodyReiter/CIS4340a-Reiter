public void doSomething() {
    lock.lock();
    try {
        // do work
    } finally {
        lock.unlock();
    }
}

